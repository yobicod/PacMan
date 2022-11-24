/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacMan.sound;
import javax.sound.sampled.*;
public class Sound {
    private Clip clip;
    public static Sound sound1 = new Sound("/res/Sounds/kiminoto.wav");
    public static Sound sound2 = new Sound("/res/Sounds/coin.wav");
    public static Sound sound3 = new Sound("/res/Sounds/mixkit-ominous-drums-227.wav");
    public Sound (String fileName) {
	try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(Sound.class.getResource(fileName));
            clip = AudioSystem.getClip();
            clip.open(ais);
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-30.0f);
	} 
        catch (Exception e) {
            e.printStackTrace();
	}
    }
	public void play() {
            try {
                if (clip != null) {
                    new Thread() {
			public void run() {
                            synchronized (clip) {
				clip.stop();
				clip.setFramePosition(0);
				clip.start();
                            }
                        }
                    }.start();
                }
            } 
            catch (Exception e) {
		e.printStackTrace();
            }
	}
	
	public void stop(){
		if(clip == null) return;
		clip.stop();
	}
	
	public void loop() {
		try {
			if (clip != null) {
				new Thread() {
					public void run() {
						synchronized (clip) {
							clip.stop();
							clip.setFramePosition(0);
							clip.loop(Clip.LOOP_CONTINUOUSLY);
						}
					}
				}.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean isActive(){
		return clip.isActive();
	}
}