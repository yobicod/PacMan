
package PacMan.entities;

import java.awt.Graphics;
import PacMan.Handler;
import PacMan.gfx.Assets;
import PacMan.tiles.Tile;
//import java.awt.Rectangle;
//import PacMan.entities.Entity;
//import PacMan.states.State;

public class BeastUp extends creature{

    private int speed = 3; //speed ของ Steve ที่วิ่งจากซ้ายไปขวา
    public BeastUp(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
    }

    public void getInput()
    {
        
        if(speed < 0){
             int ty = (int) (y + bounds.y) / Tile.TILEHEIGHT;
             if(!collisionWithTile((int) (x + bounds.x )/Tile.TILEWIDTH ,ty ) &&
                     !collisionWithTile( (int) (x + bounds.x + bounds.width - 1)/Tile.TILEWIDTH , ty)){
                 speed = speed;
             }else{
                 speed = -speed;
             }
         }else if (speed > 0){
             int ty = (int) (y + bounds.height + bounds.y) / Tile.TILEHEIGHT;
             if(!collisionWithTile((int) (x + bounds.x )/Tile.TILEWIDTH , ty ) &&
                     !collisionWithTile((int) (x + bounds.x + bounds.width - 1)/Tile.TILEWIDTH ,ty )){
                 speed = speed;
             }else{
                 speed = -speed;
             }
         }
        
    }
    @Override
    public void die() {
        
    }

    @Override
    public void tick() {
        getInput();
        y += speed;
    }
   @Override
    public void render(Graphics g) {
        g.drawImage(Assets.beast,(int) ( x - handler.getGameCamera().getxOffset() ), (int)  ( y - handler.getGameCamera().getyOffset() ), width , height , null);
    }
 }
