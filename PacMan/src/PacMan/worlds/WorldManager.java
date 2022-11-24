
package PacMan.worlds;

import PacMan.Handler;
import java.awt.Graphics;

public class WorldManager {
    
    private Handler handler;
    World world;
    public WorldManager(Handler handler , String directory , int worldNumber){
        
        this.handler = handler;
        
        if (worldNumber == 1) {
            world = new World(handler, directory + "world1.txt");
        } else if (worldNumber == 2){
            world = new World(handler, directory + "world2.txt");
        } else if (worldNumber == 3){
            world = new World(handler, directory + "world3.txt");
        }
        
        
        handler.setWorld(world);
        
    }
    
    public void tick(){
        world.tick();
    }
    
    public void render(Graphics g){
        world.render(g);
    }
    
    
}
