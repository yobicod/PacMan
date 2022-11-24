package PacMan.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import PacMan.Handler;
import PacMan.gfx.Assets;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class MenuState extends State{

    private String highScore = "";
    public MenuState(Handler handler)
    {
        super(handler);
    }
    
    @Override
    public void tick() {
        Rectangle startR = new Rectangle( handler.getGame().getCanvas().getWidth()/2 - 50 , handler.getGame().getCanvas().getHeight()/2 , 175 , 77 );
        Rectangle exitR = new Rectangle( handler.getGame().getCanvas().getWidth()/2 - 43 , handler.getGame().getCanvas().getHeight()/2 + 120 , 165 , 77 );
        
        if(handler.getMouseManager().isLeftPressed() && startR.contains(handler.getMouseManager().getMouseX(), handler.getMouseManager().getMouseY())){
            
            handler.getGame().setWorldNumber(1);
            handler.getGame().setScore(-handler.getGame().getScore());
            State.setCurrentState(new GameState(handler , 1));
            
        }
        
        if(handler.getMouseManager().isLeftPressed() && exitR.contains(handler.getMouseManager().getMouseX(), handler.getMouseManager().getMouseY())){
            System.exit(0);
        }
        
        
    }
//getRectangle().intersects(r)
    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.mainPic, 0, 0, handler.getGame().getWidth() , handler.getGame().getHeight() , null );
        g.drawImage(Assets.startButton, handler.getGame().getCanvas().getWidth()/2 - 50 , handler.getGame().getCanvas().getHeight()/2 , null);
        g.drawImage(Assets.exitButton, handler.getGame().getCanvas().getWidth()/2 - 43 , handler.getGame().getCanvas().getHeight()/2 +120 , null );
        
        if (highScore.equals("")){
            highScore = this.getHighScore();
        }
        
        if( handler.getWorld().getEntityManager().getPlayer().dead){
            CheckScore();
            g.setColor(Color.red);
            g.setFont(new Font("Sergiue", Font.BOLD, 50));
            g.drawString("You are Killed. Your Score : " + handler.getGame().getScore(), 650, 800);
            g.drawString("Highscore " + highScore, 700, 850);
        }
        
        if( handler.getWorld().getEntityManager().getPlayer().winner){
            CheckScore();
            g.setColor(Color.green);
            g.setFont(new Font("Sergiue", Font.BOLD, 40));
            g.drawString("Congratulations. You Won the Game -- Your Score : " + handler.getGame().getScore(), 450, 825);
        }
        
    }
    
    public String getHighScore(){
        FileReader readFile = null;
        BufferedReader reader = null;
        try {
            readFile = new FileReader("highscore.dat");
            reader = new BufferedReader(readFile);
            return reader.readLine();
        } catch (Exception e) {
            return "-:0";
        }
        finally{
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void CheckScore(){
        if (handler.getGame().getScore() > Integer.parseInt(highScore.split(":")[1])){
            String name = JOptionPane.showInputDialog("You set a new highscore.\nInsert your name: ");
            highScore = name + ":" + handler.getGame().getScore();
            
            File scoreFile = new File("highscore.dat");
            if (!scoreFile.exists()){
                try {
                    scoreFile.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            FileWriter writeFile = null;
            BufferedWriter writer = null;
            try{
                writeFile = new FileWriter(scoreFile);
                writer = new BufferedWriter(writeFile);
                writer.write(this.highScore);
            }
            catch(Exception e){
                
            }
            finally{
                if (writer != null){
                    try {
                        writer.close();
                    } catch (IOException ex) {
                        
                    }
                }
            }
        }
    }
}