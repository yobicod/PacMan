
package PacMan.entities;

//import PacMan.entities.BeastUp;
//import PacMan.entities.Beast;
//import java.awt.Color;
//import PacMan.entities.Entity;
//import PacMan.worlds.WorldManager;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import PacMan.Handler;
import PacMan.gfx.Animations;
import PacMan.gfx.Assets;
import PacMan.sound.Sound;
import PacMan.states.GameState;
import PacMan.states.State;
import java.awt.event.KeyEvent;

public class Player extends creature{

    public static BufferedImage currentAnimation;
    Animations  animDown , animUp , animRight , animLeft ,animEat;
    private GameState gameState;
    
    // ส่วนของตัวละครที่ผู้เล่นได้เล่นประกอบด้วยขนาดของตัวละคร และ เวลากดเดินให้ตัวละครเปลี่ยน Animation
    public Player(Handler handler , float x, float y) {
        super(handler , x , y , (int) creature.DEFAULT_CREATURE_WIDTH , (int) creature.DEFAULT_CREATURE_HEIGHT);
        
        currentAnimation = Assets.player_right;
        
        
        bounds.x = 4;
        bounds.y = 4;
        bounds.width = 55;
        bounds.height = 55;
        
        animEat = new Animations(currentAnimation);
        animDown = new Animations(Assets.player_down);
        animUp = new Animations(Assets.player_up);
        animRight = new Animations(Assets.player_right);
        animLeft = new Animations(Assets.player_left);
    }

    @Override
    public void tick() {
        
        if(worldNumber == 2){
            gameState.tick();
            worldNumber = 3;
            return;
        }
        
        //Animations 
        animDown.tick();
        animUp.tick();
        animRight.tick();
        animLeft.tick();
        
        //Movement
        getInput();
        move();
        handler.getGameCamera().centerOnEntity(this);
        
        checkAttacks();
        checkScore();
    }
    
    // รับค่าจาก keybord มาเพื่อใช้ในการเดิน
    public void getInput()
    {
        xMove = 0;
        yMove = 0;
        
        if(handler.getKeyManager().up || handler.getKeyManager().w)
            yMove = -speed;
        if(handler.getKeyManager().down || handler.getKeyManager().s)
            yMove = speed;
        if(handler.getKeyManager().left || handler.getKeyManager().a)
            xMove = -speed;
        if(handler.getKeyManager().right || handler.getKeyManager().d)
            xMove = speed;
        if(handler.getKeyManager().keys[KeyEvent.VK_ESCAPE]){
            dead = true;
            State.setCurrentState(handler.getGame().menuState);
        }
        
    }
    
    
    @Override
    public void render(Graphics g) {
        
        if(worldNumber == 2){
            gameState.render(g);
            worldNumber = 3;
            return;
        }
        
        g.drawImage( getCurrentAnimationFrame(), (int) ( x - handler.getGameCamera().getxOffset() ) 
                ,(int) ( y - handler.getGameCamera().getyOffset() ) , width , height , null);
        
        //g.drawRect((int)( x + bounds.x  ) , (int) ( y + bounds.y ) , bounds.width , bounds.height);
        
        g.setFont(new Font("Sergiue", Font.BOLD, 22));
        g.drawString("Score : " + handler.getGame().getScore() , handler.getGame().getCanvas().getWidth() - 150 , 50 );
        
    }
    private BufferedImage getCurrentAnimationFrame()
    {
        if(xMove > 0)
            return animRight.getCurrentFrame();
        else if(xMove < 0)
            return animLeft.getCurrentFrame();
        else if(yMove < 0)
            return animUp.getCurrentFrame();
        else if(yMove > 0)
            return animDown.getCurrentFrame();
        else
            return currentAnimation;
    }
    
    public int getBoundsHeight(){
        return bounds.height;
    }
    public int getBoundsWidth(){
        return bounds.width;
    }
    
    
    public int worldNumber;
    
    // เช็คการเดินชนกับ Steve ถ้าเกอดการชนกับ Steve แล้วจะเกิด condition ตาย
    public void checkAttacks() {
        
        Rectangle cb = getCollisionBounds(0, 0);   
        Rectangle ar = new Rectangle();    
        int arSize = 30;             
        ar.width = arSize;                          
        ar.height = arSize;     

        if (handler.getKeyManager().up || handler.getKeyManager().w) {                  
            ar.x = cb.x + cb.width / 2 - arSize / 2; 
            ar.y = cb.y - arSize /2  + 30; 
        } else if (handler.getKeyManager().down || handler.getKeyManager().s) {            
            ar.x = cb.x + cb.width / 2 - arSize / 2;
            ar.y = cb.y + cb.height - 40;
        } else if (handler.getKeyManager().left || handler.getKeyManager().a) {
            ar.x = cb.x - arSize + 60;
            ar.y = cb.y + cb.height / 2 - arSize / 2 + 20;
        } else if (handler.getKeyManager().right || handler.getKeyManager().d) {
            ar.x = cb.x + cb.width - 40;
            ar.y = cb.y + cb.height / 2 - arSize / 2 + 20;
        }
        else{
            ar.x = cb.x - arSize + 40;
            ar.y = cb.y + cb.height / 2 - arSize / 2;
        }

        
        for (Entity e : handler.getWorld().getEntityManager().getEntities()) {
            if (e.equals(this)) {
                continue;
            }
            if (e.getCollisionBounds( 0 , 0).intersects(ar)) {
                if(e instanceof Beast || e instanceof BeastUp){
                    this.eat(10);
                    die();
                    State.setCurrentState(handler.getGame().menuState);
                    handler.getGame().getG().drawString("You are Killed. Your Score : " + handler.getGame().getScore(), 200, 400);
                    Sound.sound3.play();
                    return;
                }
                e.eat(10);
                handler.getGame().setScore(10);
                return;
            }

        }   
    }
    
    // เช็คเกี่ยวกับ condition winning หรือ ชนะเกม
    public boolean winner;
    private void checkScore(){
        
        int count = 0;
        for(Entity e : handler.getWorld().getEntityManager().getEntities()){
            if(e instanceof Food)
                count++;
        }
        
        if(count == 0){
            worldNumber = handler.getGame().getWorldNumber();
            
            switch (worldNumber) {
                case 1:
                    handler.getGame().setWorldNumber(2);
                    worldNumber = 2;
                    gameState = new GameState(handler , worldNumber);
                    State.setCurrentState(gameState);
                    break;
                case 2:
                    handler.getGame().setWorldNumber(3);
                    worldNumber = 3;
                    gameState = new GameState(handler, worldNumber);
                    State.setCurrentState(gameState);
                    break;
                default:
                    winner = true;
                    handler.getGame().setWorldNumber(1);
                    State.setCurrentState(handler.getGame().menuState);
                    break;
            }
        }
    }
    
    
    public boolean dead = false;

    BufferStrategy br;
    @Override
    public void die() {
        dead = true;
    }
    
    
}