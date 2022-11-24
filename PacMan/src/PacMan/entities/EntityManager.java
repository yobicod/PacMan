
package PacMan.entities;

import java.awt.Graphics;
import java.util.ArrayList;
import PacMan.Handler;

public class EntityManager {
    
    private Handler handler;
    private Player player;
    private ArrayList<Entity> entities;

    public EntityManager(Handler handler, Player player) {
        this.handler = handler;
        this.player = player;
        entities = new ArrayList<>();
        
// switch case เพื่อเปลี่ยนค่าตำแหน่งของเหรียญกับผีภายในเกมของแต่ล่ะ World
        switch (handler.getGame().getWorldNumber()) {
            case 1:
                EntitiesOfWorld1();
                break;
            case 2:
                EntitiesOfWorld2();
                break;
            default:
                EntitiesOfWorld3();
                break;
        }
        
        
        addEntity(player);
    }
    
    
    public void tick()
    {
        for(int i = 0 ; i < entities.size() ; i++){
            Entity e = entities.get(i);
            e.tick();
            if(!e.isActive())
                entities.remove(e);
        }
    }
    
    public void render(Graphics g)
    {
        for(Entity e : entities){
            e.render(g);
        }
    }

    public void addEntity(Entity e)
    {
        entities.add(e);
    }
    
    
    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Entity> getEntities() {
        return entities;
    }

    public void setEntities(ArrayList<Entity> entities) {
        this.entities = entities;
    }
    
    // เป็น method ที่เก็บค่าตำแหน่งของเหรียญ และ Steve ใน World 1
    private void EntitiesOfWorld1(){
        
        
        //foodworld1
        
        addEntity(new Food(handler, 64, 64));
        addEntity(new Food(handler, 110 , 64));
        addEntity(new Food(handler, 164 , 64 ));
        addEntity(new Food(handler, 228 , 64 ));
        addEntity(new Food(handler, 292 , 64 ));
        addEntity(new Food(handler, 356 , 64 ));
        addEntity(new Food(handler, 420 , 64 ));
        addEntity(new Food(handler, 484 , 64 ));
        addEntity(new Food(handler, 548 , 64 ));
        addEntity(new Food(handler, 612 , 64 ));
        addEntity(new Food(handler, 676 , 64 ));
        addEntity(new Food(handler, 740 , 64 ));
        addEntity(new Food(handler, 804 , 64 ));
        addEntity(new Food(handler, 868 , 64 ));
        addEntity(new Food(handler, 932 , 64 ));
        addEntity(new Food(handler, 996 , 64 ));
        addEntity(new Food(handler, 1064 , 64 ));
        addEntity(new Food(handler, 1128 , 64 ));
        addEntity(new Food(handler, 1192 , 64 ));
        addEntity(new Food(handler, 1256 , 64 ));
        addEntity(new Food(handler, 1320 , 64 ));
        addEntity(new Food(handler, 1384 , 64 ));
        addEntity(new Food(handler, 1448 , 64 ));
        addEntity(new Food(handler, 1512 , 64 ));
        addEntity(new Food(handler, 1576 , 64 ));
        addEntity(new Food(handler, 1640 , 64 ));
        addEntity(new Food(handler, 1704 , 64 ));
        addEntity(new Food(handler, 1768 , 64 ));
        
        
            addEntity(new Food(handler, 64, 128));
        addEntity(new Food(handler, 110 , 128));
        addEntity(new Food(handler, 164 , 128 ));
        addEntity(new Food(handler, 228 , 128 ));
        addEntity(new Food(handler, 292 , 128 ));
        addEntity(new Food(handler, 356 , 128 ));
        addEntity(new Food(handler, 420 , 128 ));
        addEntity(new Food(handler, 484 , 128 ));
        addEntity(new Food(handler, 548 , 128 ));
        addEntity(new Food(handler, 612 , 128 ));
        addEntity(new Food(handler, 676 , 128 ));
        addEntity(new Food(handler, 740 , 128 ));
        addEntity(new Food(handler, 804 , 128 ));
        addEntity(new Food(handler, 868 , 128 ));
        addEntity(new Food(handler, 932 , 128 ));
        addEntity(new Food(handler, 996 , 128 ));
        addEntity(new Food(handler, 1064 , 128 ));
        addEntity(new Food(handler, 1128 , 128 ));
        addEntity(new Food(handler, 1192 , 128 ));
        addEntity(new Food(handler, 1256 , 128 ));
        addEntity(new Food(handler, 1320 , 128 ));
        addEntity(new Food(handler, 1384 , 128 ));
        addEntity(new Food(handler, 1448 , 128 ));
        addEntity(new Food(handler, 1512 , 128 ));
        addEntity(new Food(handler, 1576 , 128 ));
        addEntity(new Food(handler, 1640 , 128 ));
        addEntity(new Food(handler, 1704 , 128 ));
        addEntity(new Food(handler, 1768 , 128 ));
        
        addEntity(new Food(handler, 64 , 256 ));
        addEntity(new Food(handler, 128, 256 ));
        addEntity(new Food(handler, 380 , 256 ));
        addEntity(new Food(handler, 444 , 256 ));
        addEntity(new Food(handler, 1410 , 256 ));
        addEntity(new Food(handler, 1470 , 256 ));
        addEntity(new Food(handler, 1714 , 256 ));
        addEntity(new Food(handler, 1778 , 256 ));
        
        
        addEntity(new Food(handler, 64 , 320 ));
        addEntity(new Food(handler, 128, 320 ));
        addEntity(new Food(handler, 380 , 320 ));
        addEntity(new Food(handler, 444 , 320 ));
        addEntity(new Food(handler, 1410 , 320 ));
        addEntity(new Food(handler, 1470 , 320 ));
        addEntity(new Food(handler, 1714 , 320 ));
        addEntity(new Food(handler, 1778 , 320 ));
        
        addEntity(new Food(handler, 64 , 384 ));
        addEntity(new Food(handler, 128, 384 ));
        addEntity(new Food(handler, 380 , 384 ));
        addEntity(new Food(handler, 444 , 384 ));
        addEntity(new Food(handler, 1410 , 384 ));
        addEntity(new Food(handler, 1470 , 384 ));
        addEntity(new Food(handler, 1714 , 384 ));
        addEntity(new Food(handler, 1778 , 384 ));
        
        
        
        addEntity(new Food(handler, 576 , 384 ));
        addEntity(new Food(handler, 640 , 384 ));
        addEntity(new Food(handler, 768 , 384 ));
        addEntity(new Food(handler, 832 , 384 ));
        addEntity(new Food(handler, 964 , 384 ));
        addEntity(new Food(handler, 1096 , 384 ));
        addEntity(new Food(handler, 1150 , 384 ));
        addEntity(new Food(handler, 1278 , 384 ));
        
        
        addEntity(new Food(handler, 576 , 448 ));
        addEntity(new Food(handler, 640 , 448 ));
        addEntity(new Food(handler, 768 , 448 ));
        addEntity(new Food(handler, 832 , 448 ));
        addEntity(new Food(handler, 964 , 448 ));
        addEntity(new Food(handler, 1096 , 448 ));
        addEntity(new Food(handler, 1150 , 448 ));
        addEntity(new Food(handler, 1278 , 448 ));
        
        
        addEntity(new Food(handler, 576 , 512 ));
        addEntity(new Food(handler, 640 , 512 ));
        addEntity(new Food(handler, 768 , 512 ));
        addEntity(new Food(handler, 832 , 512 ));
        addEntity(new Food(handler, 1096 , 512 ));
        addEntity(new Food(handler, 1150 , 512 ));
        addEntity(new Food(handler, 1278 , 512 ));
        
        
        addEntity(new Food(handler, 576 ,576 ));
        addEntity(new Food(handler, 640 ,576 ));
        addEntity(new Food(handler, 768 ,576 ));
        addEntity(new Food(handler, 832 ,576 ));
        addEntity(new Food(handler, 1096 ,576 ));
        addEntity(new Food(handler, 1150 ,576 ));
        addEntity(new Food(handler, 1278 ,576 ));
        
        
        addEntity(new Food(handler, 576 ,640 ));
        addEntity(new Food(handler, 640 ,640 ));
        addEntity(new Food(handler, 768 ,640 ));
        addEntity(new Food(handler, 832 ,640 ));
        addEntity(new Food(handler, 1096 ,640 ));
        addEntity(new Food(handler, 1150 ,640 ));
        addEntity(new Food(handler, 1278 ,640 ));
        
        
        addEntity(new Food(handler, 576 ,704 ));
        addEntity(new Food(handler,640 ,704 ));
        addEntity(new Food(handler, 768 ,704 ));
        addEntity(new Food(handler, 832 ,704 ));
        addEntity(new Food(handler, 1096 ,704 ));
        addEntity(new Food(handler, 1150 ,704 ));
        addEntity(new Food(handler, 1278 ,704 ));
        
        
        addEntity(new Food(handler, 576 ,768 ));
        addEntity(new Food(handler,640 ,768 ));
        addEntity(new Food(handler, 768 ,768 ));
        addEntity(new Food(handler, 832 ,768 ));
        addEntity(new Food(handler, 964 ,768 ));
        addEntity(new Food(handler, 1096 ,768 ));
        addEntity(new Food(handler, 1150 ,768 ));
        addEntity(new Food(handler, 1278 ,768 ));
        
        
        addEntity(new Food(handler, 576 ,832 ));
        addEntity(new Food(handler,640 ,832 ));
        addEntity(new Food(handler, 768 ,832 ));
        addEntity(new Food(handler, 832 ,832 ));
        addEntity(new Food(handler, 964 ,832 ));
        addEntity(new Food(handler, 1096 ,832 ));
        addEntity(new Food(handler, 1150 ,832 ));
        addEntity(new Food(handler, 1278 ,832 ));
        
        
        addEntity(new Food(handler, 64 , 832 ));
        addEntity(new Food(handler, 128, 832 ));
        addEntity(new Food(handler, 380 , 832 ));
        addEntity(new Food(handler, 444 , 832 ));
        addEntity(new Food(handler, 1410 , 832 ));
        addEntity(new Food(handler, 1470 , 832 ));
        addEntity(new Food(handler, 1714 , 832 ));
        addEntity(new Food(handler, 1778 , 832 ));
        
        
        addEntity(new Food(handler, 64 , 896 ));
        addEntity(new Food(handler, 128, 896 ));
        addEntity(new Food(handler, 380 , 896 ));
        addEntity(new Food(handler, 444 , 896 ));
        addEntity(new Food(handler, 1410 , 896 ));
        addEntity(new Food(handler, 1470 , 896 ));
        addEntity(new Food(handler, 1714 , 896 ));
        addEntity(new Food(handler, 1778 , 896 ));
        
        
        addEntity(new Food(handler, 64 , 960 ));
        addEntity(new Food(handler, 128, 960 ));
        addEntity(new Food(handler, 380 , 960 ));
        addEntity(new Food(handler, 444 , 960 ));
        addEntity(new Food(handler, 1410 , 960 ));
        addEntity(new Food(handler, 1470 , 960 ));
        addEntity(new Food(handler, 1714 , 960 ));
        addEntity(new Food(handler, 1778 , 960 ));
        
        
        addEntity(new Food(handler, 64, 1152));
        addEntity(new Food(handler, 110 , 1152));
        addEntity(new Food(handler, 164 , 1152 ));
        addEntity(new Food(handler, 228 , 1152 ));
        addEntity(new Food(handler, 292 , 1152 ));
        addEntity(new Food(handler, 356 , 1152 ));
        addEntity(new Food(handler, 420 , 1152 ));
        addEntity(new Food(handler, 484 , 1152 ));
        addEntity(new Food(handler, 548 , 1152 ));
        addEntity(new Food(handler, 612 , 1152 ));
        addEntity(new Food(handler, 676 , 1152 ));
        addEntity(new Food(handler, 740 , 1152 ));
        addEntity(new Food(handler, 804 , 1152 ));
        addEntity(new Food(handler, 868 , 1152 ));
        addEntity(new Food(handler, 932 , 1152 ));
        addEntity(new Food(handler, 996 , 1152 ));
        addEntity(new Food(handler, 1064 , 1152 ));
        addEntity(new Food(handler, 1128 , 1152 ));
        addEntity(new Food(handler, 1192 , 1152 ));
        addEntity(new Food(handler, 1256 , 1152 ));
        addEntity(new Food(handler, 1320 , 1152 ));
        addEntity(new Food(handler, 1384 , 1152 ));
        addEntity(new Food(handler, 1448 , 1152 ));
        addEntity(new Food(handler, 1512 , 1152 ));
        addEntity(new Food(handler, 1576 , 1152 ));
        addEntity(new Food(handler, 1640 , 1152 ));
        addEntity(new Food(handler, 1704 , 1152 ));
        addEntity(new Food(handler, 1768 , 1152 ));
        
        
        addEntity(new Food(handler, 64, 1088));
        addEntity(new Food(handler, 110 , 1088));
        addEntity(new Food(handler, 164 , 1088 ));
        addEntity(new Food(handler, 228 , 1088 ));
        addEntity(new Food(handler, 292 , 1088 ));
        addEntity(new Food(handler, 356 , 1088 ));
        addEntity(new Food(handler, 420 , 1088 ));
        addEntity(new Food(handler, 484 , 1088 ));
        addEntity(new Food(handler, 548 , 1088 ));
        addEntity(new Food(handler, 612 , 1088 ));
        addEntity(new Food(handler, 676 , 1088 ));
        addEntity(new Food(handler, 740 , 1088 ));
        addEntity(new Food(handler, 804 , 1088 ));
        addEntity(new Food(handler, 868 , 1088 ));
        addEntity(new Food(handler, 932 , 1088 ));
        addEntity(new Food(handler, 996 , 1088 ));
        addEntity(new Food(handler, 1064 , 1088 ));
        addEntity(new Food(handler, 1128 , 1088 ));
        addEntity(new Food(handler, 1192 , 1088 ));
        addEntity(new Food(handler, 1256 , 1088 ));
        addEntity(new Food(handler, 1320 , 1088 ));
        addEntity(new Food(handler, 1384 , 1088 ));
        addEntity(new Food(handler, 1448 , 1088 ));
        addEntity(new Food(handler, 1512 , 1088 ));
        addEntity(new Food(handler, 1576 , 1088 ));
        addEntity(new Food(handler, 1640 , 1088 ));
        addEntity(new Food(handler, 1704 , 1088 ));
        addEntity(new Food(handler, 1768 , 1088 ));
        
        
        addEntity(new Food(handler, 192 , 512 ));
        addEntity(new Food(handler, 256 , 512 ));
        addEntity(new Food(handler, 320 , 512 ));
        addEntity(new Food(handler, 1534 , 512 ));
        addEntity(new Food(handler, 1598 , 512 ));
        addEntity(new Food(handler, 1662 , 512 ));
        
        
        addEntity(new Food(handler, 192 , 576 ));
        addEntity(new Food(handler, 256 , 576 ));
        addEntity(new Food(handler, 320 , 576 ));
        addEntity(new Food(handler, 1534 , 576 ));
        addEntity(new Food(handler, 1598 , 576 ));
        addEntity(new Food(handler, 1662 , 576 ));
        
        
        addEntity(new Food(handler, 192 , 640 ));
        addEntity(new Food(handler, 256 , 640 ));
        addEntity(new Food(handler, 320 , 640 ));
        addEntity(new Food(handler, 1534 , 640 ));
        addEntity(new Food(handler, 1598 , 640 ));
        addEntity(new Food(handler, 1662 , 640 ));
        
        addEntity(new Food(handler, 192 , 704 ));
        addEntity(new Food(handler, 256 , 704 ));
        addEntity(new Food(handler, 320 , 704 ));
        addEntity(new Food(handler, 1534 , 704 ));
        addEntity(new Food(handler, 1598 , 704 ));
        addEntity(new Food(handler, 1662 , 704 ));
        

//        besrtworld 1
    addEntity(new Beast(handler, 64 , 64 ));
        addEntity(new Beast(handler, 960, 128 ));
        addEntity(new Beast(handler, 576, 256));
        addEntity(new Beast(handler, 832, 576));
        addEntity(new Beast(handler, 1088, 640));
        addEntity(new Beast(handler , 1280 , 960));
        addEntity(new Beast(handler , 1792 , 1088 ));
        addEntity(new BeastUp(handler , 64 , 1152 ));
        addEntity(new BeastUp(handler , 576 , 960 ));
        addEntity(new BeastUp(handler , 1280 , 256 ));
        addEntity(new BeastUp(handler , 1792 , 64 ));
        
        
    }
    
    // เป็น method ที่เก็บค่าตำแหน่งของเหรียญ และ Steve ใน World 2
    private void EntitiesOfWorld2(){
        
        
        //Food 
        
        
        addEntity(new Food(handler, 64, 64));
        addEntity(new Food(handler, 110 , 64));
        addEntity(new Food(handler, 164 , 64 ));
        addEntity(new Food(handler, 228 , 64 ));
        addEntity(new Food(handler, 292 , 64 ));
        addEntity(new Food(handler, 356 , 64 ));
        addEntity(new Food(handler, 420 , 64 ));
        addEntity(new Food(handler, 484 , 64 ));
        addEntity(new Food(handler, 548 , 64 ));
        addEntity(new Food(handler, 612 , 64 ));
        addEntity(new Food(handler, 676 , 64 ));
        addEntity(new Food(handler, 740 , 64 ));
        addEntity(new Food(handler, 804 , 64 ));
        addEntity(new Food(handler, 868 , 64 ));
        addEntity(new Food(handler, 932 , 64 ));
        addEntity(new Food(handler, 996 , 64 ));
        addEntity(new Food(handler, 1064 , 64 ));
        addEntity(new Food(handler, 1128 , 64 ));
        addEntity(new Food(handler, 1192 , 64 ));
        addEntity(new Food(handler, 1256 , 64 ));
        addEntity(new Food(handler, 1320 , 64 ));
        addEntity(new Food(handler, 1384 , 64 ));
        addEntity(new Food(handler, 1448 , 64 ));
        addEntity(new Food(handler, 1512 , 64 ));
        addEntity(new Food(handler, 1576 , 64 ));
        addEntity(new Food(handler, 1640 , 64 ));
        addEntity(new Food(handler, 1704 , 64 ));
        addEntity(new Food(handler, 1768 , 64 ));
        
        
         addEntity(new Food(handler, 64, 256));
        addEntity(new Food(handler, 128 , 256));
        addEntity(new Food(handler, 192 , 256));
        addEntity(new Food(handler, 320 , 256 ));
        addEntity(new Food(handler, 384 , 256 ));
        addEntity(new Food(handler, 448 , 256 ));
        addEntity(new Food(handler, 576 , 256 ));
        addEntity(new Food(handler, 640 , 256 ));
        addEntity(new Food(handler, 768 , 256 ));
        addEntity(new Food(handler, 832 , 256 ));
        addEntity(new Food(handler, 896 , 256 ));
        addEntity(new Food(handler, 964 , 256 ));
        addEntity(new Food(handler, 1028 , 256 ));
        addEntity(new Food(handler, 1092 , 256 ));
        addEntity(new Food(handler, 1220 , 256 ));
        addEntity(new Food(handler, 1284 , 256 ));
        addEntity(new Food(handler, 1412 , 256 ));
        addEntity(new Food(handler, 1476 , 256 ));
        addEntity(new Food(handler, 1540 , 256 ));
        addEntity(new Food(handler, 1668 , 256 ));
        addEntity(new Food(handler, 1732 , 256 ));
        addEntity(new Food(handler, 1796 , 256 ));
        
        
        addEntity(new Food(handler, 64, 320));
        addEntity(new Food(handler, 128 , 320));
        addEntity(new Food(handler, 192 , 320));
        addEntity(new Food(handler, 320 , 320 ));
        addEntity(new Food(handler, 384 , 320 ));
        addEntity(new Food(handler, 448 , 320 ));
        addEntity(new Food(handler, 576 , 320 ));
        addEntity(new Food(handler, 640 , 320 ));
        addEntity(new Food(handler, 768 , 320 ));
        addEntity(new Food(handler, 832 , 320 ));
        addEntity(new Food(handler, 896 , 320 ));
        addEntity(new Food(handler, 964 , 320 ));
        addEntity(new Food(handler, 1028 , 320 ));
        addEntity(new Food(handler, 1092 , 320 ));
        addEntity(new Food(handler, 1220 , 320 ));
        addEntity(new Food(handler, 1284 , 320 ));
        addEntity(new Food(handler, 1412 , 320 ));
        addEntity(new Food(handler, 1476 , 320 ));
        addEntity(new Food(handler, 1540 , 320 ));
        addEntity(new Food(handler, 1668 , 320 ));
        addEntity(new Food(handler, 1732 , 320 ));
        addEntity(new Food(handler, 1796 , 320 ));
        
        
        
        
        
        
        addEntity(new Food(handler, 64, 384));
        addEntity(new Food(handler, 128 , 384));
        addEntity(new Food(handler, 192 , 384));
        addEntity(new Food(handler, 320 , 384 ));
        addEntity(new Food(handler, 384 , 384 ));
        addEntity(new Food(handler, 448 , 384 ));
        addEntity(new Food(handler, 576 , 384 ));
        addEntity(new Food(handler, 640 , 384 ));
        addEntity(new Food(handler, 768 , 384 ));
        addEntity(new Food(handler, 832 , 384 ));
        addEntity(new Food(handler, 896 , 384 ));
        addEntity(new Food(handler, 964 , 384 ));
        addEntity(new Food(handler, 1028 , 384 ));
        addEntity(new Food(handler, 1092 , 384 ));
        addEntity(new Food(handler, 1220 , 384 ));
        addEntity(new Food(handler, 1284 , 384 ));
        addEntity(new Food(handler, 1412 , 384 ));
        addEntity(new Food(handler, 1476 , 384 ));
        addEntity(new Food(handler, 1540 , 384 ));
        addEntity(new Food(handler, 1668 , 384 ));
        addEntity(new Food(handler, 1732 , 384 ));
        addEntity(new Food(handler, 1796 , 384 ));
        
        
        addEntity(new Food(handler, 64, 512));
        addEntity(new Food(handler, 128 , 512));
        addEntity(new Food(handler, 192 , 512));
        addEntity(new Food(handler, 320 , 512 ));
        addEntity(new Food(handler, 384 , 512 ));
        addEntity(new Food(handler, 448 , 512 ));
        addEntity(new Food(handler, 576 , 512 ));
        addEntity(new Food(handler, 964 , 512 ));
        addEntity(new Food(handler, 1284 , 512 ));
        addEntity(new Food(handler, 1412 , 512 ));
        addEntity(new Food(handler, 1476 , 512 ));
        addEntity(new Food(handler, 1540 , 512 ));
        addEntity(new Food(handler, 1668 , 512 ));
        addEntity(new Food(handler, 1732 , 512 ));
        addEntity(new Food(handler, 1796 , 512 ));
        
        
        addEntity(new Food(handler, 64, 576));
        addEntity(new Food(handler, 128 , 576));
        addEntity(new Food(handler, 192 , 576));
        addEntity(new Food(handler, 320 , 576 ));
        addEntity(new Food(handler, 384 , 576 ));
        addEntity(new Food(handler, 448 , 576 ));
        addEntity(new Food(handler, 576 , 576 ));
        addEntity(new Food(handler, 964 , 576 ));
        addEntity(new Food(handler, 1284 , 576 ));
        addEntity(new Food(handler, 1412 , 576 ));
        addEntity(new Food(handler, 1476 , 576 ));
        addEntity(new Food(handler, 1540 , 576 ));
        addEntity(new Food(handler, 1668 , 576 ));
        addEntity(new Food(handler, 1732 , 576 ));
        addEntity(new Food(handler, 1796 , 576 ));
        
        
        addEntity(new Food(handler, 64, 640));
        addEntity(new Food(handler, 128 , 640));
        addEntity(new Food(handler, 192 , 640));
        addEntity(new Food(handler, 320 , 640 ));
        addEntity(new Food(handler, 384 , 640 ));
        addEntity(new Food(handler, 448 , 640 ));
        addEntity(new Food(handler, 576 , 640 ));
        addEntity(new Food(handler, 964 , 640 ));
        addEntity(new Food(handler, 1284 , 640 ));
        addEntity(new Food(handler, 1412 , 640 ));
        addEntity(new Food(handler, 1476 , 640 ));
        addEntity(new Food(handler, 1540 , 640 ));
        addEntity(new Food(handler, 1668 , 640 ));
        addEntity(new Food(handler, 1732 , 640 ));
        addEntity(new Food(handler, 1796 , 640 ));
        
        
        addEntity(new Food(handler, 64, 704));
        addEntity(new Food(handler, 128 , 704));
        addEntity(new Food(handler, 192 , 704));
        addEntity(new Food(handler, 320 , 704 ));
        addEntity(new Food(handler, 384 , 704 ));
        addEntity(new Food(handler, 448 , 704 ));
        addEntity(new Food(handler, 576 , 704 ));
        addEntity(new Food(handler, 964 , 704 ));
        addEntity(new Food(handler, 1284 , 704 ));
        addEntity(new Food(handler, 1412 , 704 ));
        addEntity(new Food(handler, 1476 , 704 ));
        addEntity(new Food(handler, 1540 , 704 ));
        addEntity(new Food(handler, 1668 , 704 ));
        addEntity(new Food(handler, 1732 , 704 ));
        addEntity(new Food(handler, 1796 , 704 ));
        
        
        addEntity(new Food(handler, 64, 768));
        addEntity(new Food(handler, 128 , 768));
        addEntity(new Food(handler, 192 , 768));
        addEntity(new Food(handler, 320 , 768 ));
        addEntity(new Food(handler, 384 , 768 ));
        addEntity(new Food(handler, 448 , 768 ));
        addEntity(new Food(handler, 576 , 768 ));
        addEntity(new Food(handler, 964 , 768 ));
        addEntity(new Food(handler, 1284 , 768 ));
        addEntity(new Food(handler, 1412 , 768 ));
        addEntity(new Food(handler, 1476 , 768 ));
        addEntity(new Food(handler, 1540 , 768 ));
        addEntity(new Food(handler, 1668 , 768 ));
        addEntity(new Food(handler, 1732 , 768 ));
        addEntity(new Food(handler, 1796 , 768 ));
        
        
        
        addEntity(new Food(handler, 64, 896));
        addEntity(new Food(handler, 128 , 896));
        addEntity(new Food(handler, 192 , 896));
        addEntity(new Food(handler, 320 , 896 ));
        addEntity(new Food(handler, 384 , 896 ));
        addEntity(new Food(handler, 448 , 896 ));
        addEntity(new Food(handler, 576 , 896 ));
        addEntity(new Food(handler, 640 , 896 ));
        addEntity(new Food(handler, 768 , 896 ));
        addEntity(new Food(handler, 832 , 896 ));
        addEntity(new Food(handler, 896 , 896 ));
        addEntity(new Food(handler, 964 , 896 ));
        addEntity(new Food(handler, 1028 , 896 ));
        addEntity(new Food(handler, 1092 , 896 ));
        addEntity(new Food(handler, 1220 , 896 ));
        addEntity(new Food(handler, 1284 , 896 ));
        addEntity(new Food(handler, 1412 , 896 ));
        addEntity(new Food(handler, 1476 , 896 ));
        addEntity(new Food(handler, 1540 , 896 ));
        addEntity(new Food(handler, 1668 , 896 ));
        addEntity(new Food(handler, 1732 , 896 ));
        addEntity(new Food(handler, 1796 , 896 ));
        
        
         addEntity(new Food(handler, 64, 960));
        addEntity(new Food(handler, 128 , 960));
        addEntity(new Food(handler, 192 , 960));
        addEntity(new Food(handler, 320 , 960 ));
        addEntity(new Food(handler, 384 , 960 ));
        addEntity(new Food(handler, 448 , 960 ));
        addEntity(new Food(handler, 576 , 960 ));
        addEntity(new Food(handler, 640 , 960 ));
        addEntity(new Food(handler, 768 , 960 ));
        addEntity(new Food(handler, 832 , 960 ));
        addEntity(new Food(handler, 896 , 960 ));
        addEntity(new Food(handler, 964 , 960 ));
        addEntity(new Food(handler, 1028 , 960 ));
        addEntity(new Food(handler, 1092 , 960 ));
        addEntity(new Food(handler, 1220 , 960 ));
        addEntity(new Food(handler, 1284 , 960 ));
        addEntity(new Food(handler, 1412 , 960 ));
        addEntity(new Food(handler, 1476 , 960 ));
        addEntity(new Food(handler, 1540 , 960 ));
        addEntity(new Food(handler, 1668 , 960 ));
        addEntity(new Food(handler, 1732 , 960 ));
        addEntity(new Food(handler, 1796 , 960 ));
        
        
        
        addEntity(new Food(handler, 64, 1024));
        addEntity(new Food(handler, 128 , 1024));
        addEntity(new Food(handler, 192 , 1024));
        addEntity(new Food(handler, 320 , 1024 ));
        addEntity(new Food(handler, 384 , 1024 ));
        addEntity(new Food(handler, 448 , 1024 ));
        addEntity(new Food(handler, 576 , 1024 ));
        addEntity(new Food(handler, 640 , 1024 ));
        addEntity(new Food(handler, 768 , 1024 ));
        addEntity(new Food(handler, 832 , 1024 ));
        addEntity(new Food(handler, 896 , 1024 ));
        addEntity(new Food(handler, 964 , 1024 ));
        addEntity(new Food(handler, 1028 , 1024 ));
        addEntity(new Food(handler, 1092 , 1024 ));
        addEntity(new Food(handler, 1220 , 1024 ));
        addEntity(new Food(handler, 1284 , 1024 ));
        addEntity(new Food(handler, 1412 , 1024 ));
        addEntity(new Food(handler, 1476 , 1024 ));
        addEntity(new Food(handler, 1540 , 1024 ));
        addEntity(new Food(handler, 1668 , 1024 ));
        addEntity(new Food(handler, 1732 , 1024 ));
        addEntity(new Food(handler, 1796 , 1024 ));
        
        
        
        
        addEntity(new Food(handler, 64, 1216));
        addEntity(new Food(handler, 110 , 1216));
        addEntity(new Food(handler, 164 , 1216 ));
        addEntity(new Food(handler, 228 , 1216 ));
        addEntity(new Food(handler, 292 , 1216 ));
        addEntity(new Food(handler, 356 , 1216 ));
        addEntity(new Food(handler, 420 , 1216 ));
        addEntity(new Food(handler, 484 , 1216 ));
        addEntity(new Food(handler, 548 , 1216 ));
        addEntity(new Food(handler, 612 , 1216 ));
        addEntity(new Food(handler, 676 , 1216 ));
        addEntity(new Food(handler, 740 , 1216 ));
        addEntity(new Food(handler, 804 , 1216 ));
        addEntity(new Food(handler, 868 , 1216 ));
        addEntity(new Food(handler, 932 , 1216 ));
        addEntity(new Food(handler, 996 , 1216 ));
        addEntity(new Food(handler, 1064 , 1216 ));
        addEntity(new Food(handler, 1128 , 1216 ));
        addEntity(new Food(handler, 1192 , 1216 ));
        addEntity(new Food(handler, 1256 , 1216 ));
        addEntity(new Food(handler, 1320 , 1216 ));
        addEntity(new Food(handler, 1384 , 1216 ));
        addEntity(new Food(handler, 1448 , 1216 ));
        addEntity(new Food(handler, 1512 , 1216 ));
        addEntity(new Food(handler, 1576 , 1216 ));
        addEntity(new Food(handler, 1640 , 1216 ));
        addEntity(new Food(handler, 1704 , 1216 ));
        addEntity(new Food(handler, 1768 , 1216 ));
        
        
        
        
        
        
        //Beasts
        
        
        addEntity(new Beast(handler, 64 , 64 ));
          addEntity(new Beast(handler, 320 , 448 ));
          addEntity(new Beast(handler, 1536 , 832 ));
          addEntity(new Beast(handler, 1792 , 1216));
          addEntity(new BeastUp(handler , 64 , 64));
          addEntity(new BeastUp(handler , 320 , 320));
          addEntity(new BeastUp(handler , 384 , 960));
          addEntity(new BeastUp(handler , 960 , 1024));
          addEntity(new BeastUp(handler , 960 , 256));
          addEntity(new BeastUp(handler , 1536 , 320));
          addEntity(new BeastUp(handler , 1472 , 960));
          addEntity(new BeastUp(handler , 1792 , 1152));
        
    }
    
    // เป็น method ที่เก็บค่าตำแหน่งของเหรียญ และ Steve ใน World 3
    private void EntitiesOfWorld3() {
        //Food 
        
        
        addEntity(new Food(handler, 64, 64));
        addEntity(new Food(handler, 110 , 64));
        addEntity(new Food(handler, 164 , 64 ));
        addEntity(new Food(handler, 228 , 64 ));
        addEntity(new Food(handler, 292 , 64 ));
        addEntity(new Food(handler, 356 , 64 ));
        addEntity(new Food(handler, 420 , 64 ));
        addEntity(new Food(handler, 484 , 64 ));
        addEntity(new Food(handler, 548 , 64 ));
        addEntity(new Food(handler, 612 , 64 ));
        addEntity(new Food(handler, 676 , 64 ));
        addEntity(new Food(handler, 740 , 64 ));
        addEntity(new Food(handler, 804 , 64 ));
        addEntity(new Food(handler, 868 , 64 ));
        addEntity(new Food(handler, 932 , 64 ));
        addEntity(new Food(handler, 996 , 64 ));
        addEntity(new Food(handler, 1064 , 64 ));
        addEntity(new Food(handler, 1128 , 64 ));
        addEntity(new Food(handler, 1192 , 64 ));
        addEntity(new Food(handler, 1256 , 64 ));
        addEntity(new Food(handler, 1320 , 64 ));
        addEntity(new Food(handler, 1384 , 64 ));
        addEntity(new Food(handler, 1448 , 64 ));
        addEntity(new Food(handler, 1512 , 64 ));
        addEntity(new Food(handler, 1576 , 64 ));
        addEntity(new Food(handler, 1640 , 64 ));
        addEntity(new Food(handler, 1704 , 64 ));
        addEntity(new Food(handler, 1788 , 64 ));
        
        addEntity(new Food(handler, 64 , 128 ));
        addEntity(new Food(handler, 834 , 128 ));
        addEntity(new Food(handler, 898 , 128 ));
        addEntity(new Food(handler, 962 , 128 ));
        addEntity(new Food(handler, 1036, 128 ));
        addEntity(new Food(handler, 1788, 128 ));
        
        
        addEntity(new Food(handler, 64 , 192 ));
        addEntity(new Food(handler, 184 , 192 ));
        addEntity(new Food(handler, 228 , 192 ));
        addEntity(new Food(handler, 292 , 192 ));
        addEntity(new Food(handler, 356 , 192 ));
        addEntity(new Food(handler, 420 , 192 ));
        addEntity(new Food(handler, 484 , 192 ));
        addEntity(new Food(handler, 548 , 192 ));
        addEntity(new Food(handler, 612 , 192 ));
        addEntity(new Food(handler, 676 , 192));
        addEntity(new Food(handler, 740 , 192 ));
        addEntity(new Food(handler, 804 , 192 ));
        addEntity(new Food(handler, 868 , 192 ));
        addEntity(new Food(handler, 932 , 192 ));
        addEntity(new Food(handler, 996 , 192 ));
        addEntity(new Food(handler, 1064 , 192 ));
        addEntity(new Food(handler, 1128 , 192 ));
        addEntity(new Food(handler, 1192 , 192 ));
        addEntity(new Food(handler, 1256 , 192 ));
        addEntity(new Food(handler, 1320 , 192 ));
        addEntity(new Food(handler, 1384 , 192 ));
        addEntity(new Food(handler, 1448 , 192 ));
        addEntity(new Food(handler, 1512 , 192 ));
        addEntity(new Food(handler, 1576 , 192 ));
        addEntity(new Food(handler, 1630 , 192 ));
        addEntity(new Food(handler, 1680 , 192 ));
        addEntity(new Food(handler, 1788 , 192 ));
        
        addEntity(new Food(handler, 64 , 256 ));
        addEntity(new Food(handler, 184 , 256 ));
        addEntity(new Food(handler, 238 , 256 ));
        addEntity(new Food(handler, 292 , 256 ));
        addEntity(new Food(handler, 356 , 256 ));
        addEntity(new Food(handler, 420 , 256 ));
        addEntity(new Food(handler, 484 , 256 ));
        addEntity(new Food(handler, 548 , 256 ));
        addEntity(new Food(handler, 612 , 256 ));
        addEntity(new Food(handler, 676 , 256));
        addEntity(new Food(handler, 740 , 256 ));
        addEntity(new Food(handler, 804 , 256 ));
        addEntity(new Food(handler, 868 , 256 ));
        addEntity(new Food(handler, 932 , 256 ));
        addEntity(new Food(handler, 996 , 256 ));
        addEntity(new Food(handler, 1064 , 256 ));
        addEntity(new Food(handler, 1128 , 256 ));
        addEntity(new Food(handler, 1192 , 256 ));
        addEntity(new Food(handler, 1256 , 256 ));
        addEntity(new Food(handler, 1320 , 256 ));
        addEntity(new Food(handler, 1384 , 256 ));
        addEntity(new Food(handler, 1448 , 256 ));
        addEntity(new Food(handler, 1512 , 256 ));
        addEntity(new Food(handler, 1576 , 256 ));
        addEntity(new Food(handler, 1630 , 256 ));
        addEntity(new Food(handler, 1680 , 256 ));
        addEntity(new Food(handler, 1788 , 256 ));
        
        
        addEntity(new Food(handler, 64 , 448 ));
        addEntity(new Food(handler, 128 , 448 ));
        addEntity(new Food(handler, 184 , 448 ));
        addEntity(new Food(handler, 238 , 448 ));
        addEntity(new Food(handler, 390 , 448 ));
        addEntity(new Food(handler, 704 , 448 ));
        addEntity(new Food(handler, 768 , 448 ));
        addEntity(new Food(handler, 1088 , 448 ));
        addEntity(new Food(handler, 1152 , 448 ));
        addEntity(new Food(handler, 1468 , 448 ));
        addEntity(new Food(handler, 1630 , 448 ));
        addEntity(new Food(handler, 1680 , 448 ));
        addEntity(new Food(handler, 1734 , 448 ));
        addEntity(new Food(handler, 1788 , 448 ));
        
        
        addEntity(new Food(handler, 64 , 512 ));
        addEntity(new Food(handler, 184 , 512 ));
        addEntity(new Food(handler, 238 , 512 ));
        addEntity(new Food(handler, 390 , 512 ));
        addEntity(new Food(handler, 704 , 512 ));
        addEntity(new Food(handler, 768 , 512 ));
        addEntity(new Food(handler, 1088 , 512 ));
        addEntity(new Food(handler, 1152 , 512 ));
        addEntity(new Food(handler, 1468 , 512 ));
        addEntity(new Food(handler, 1630 , 512 ));
        addEntity(new Food(handler, 1680 , 512 ));
        addEntity(new Food(handler, 1788 , 512 ));
        
        
        addEntity(new Food(handler, 64 , 576 ));
        addEntity(new Food(handler, 184 , 576 ));
        addEntity(new Food(handler, 238 , 576 ));
        addEntity(new Food(handler, 390 , 576 ));
        addEntity(new Food(handler, 704 , 576 ));
        addEntity(new Food(handler, 768 , 576 ));
        addEntity(new Food(handler, 1088 , 576 ));
        addEntity(new Food(handler, 1152 , 576 ));
        addEntity(new Food(handler, 1468 , 576 ));
        addEntity(new Food(handler, 1630 , 576 ));
        addEntity(new Food(handler, 1680 , 576 ));
        addEntity(new Food(handler, 1788 , 576 ));
        
        
        addEntity(new Food(handler, 64 , 640 ));
        addEntity(new Food(handler, 184 , 640 ));
        addEntity(new Food(handler, 238 , 640 ));
        addEntity(new Food(handler, 390 , 640 ));
        addEntity(new Food(handler, 704 , 640 ));
        addEntity(new Food(handler, 768 , 640 ));
        addEntity(new Food(handler, 1088 , 640 ));
        addEntity(new Food(handler, 1152 , 640 ));
        addEntity(new Food(handler, 1468 , 640 ));
        addEntity(new Food(handler, 1630 , 640 ));
        addEntity(new Food(handler, 1680 , 640 ));
        addEntity(new Food(handler, 1788 , 640));
        
        
        addEntity(new Food(handler, 64 , 704 ));
        addEntity(new Food(handler, 184 , 704 ));
        addEntity(new Food(handler, 238 , 704 ));
        addEntity(new Food(handler, 390 , 704 ));
        addEntity(new Food(handler, 704 , 704 ));
        addEntity(new Food(handler, 768 , 704 ));
        addEntity(new Food(handler, 1088 , 704 ));
        addEntity(new Food(handler, 1152 , 704 ));
        addEntity(new Food(handler, 1468 , 704 ));
        addEntity(new Food(handler, 1630 , 704 ));
        addEntity(new Food(handler, 1680 , 704 ));
        addEntity(new Food(handler, 1788 , 704));
        
        
        addEntity(new Food(handler, 64 , 768 ));
        addEntity(new Food(handler, 184 , 768 ));
        addEntity(new Food(handler, 238 , 768 ));
        addEntity(new Food(handler, 390 , 768 ));
        addEntity(new Food(handler, 1468 , 768 ));
        addEntity(new Food(handler, 1630 , 768 ));
        addEntity(new Food(handler, 1680 , 768 ));
        addEntity(new Food(handler, 1788 , 768));
        
        
        
        
        
        addEntity(new Food(handler, 64 ,1088 ));
        addEntity(new Food(handler, 184 , 1088 ));
        addEntity(new Food(handler, 238 , 1088 ));
        addEntity(new Food(handler, 390 , 1088 ));
        addEntity(new Food(handler, 512 , 1088 ));
        addEntity(new Food(handler, 576 , 1088 ));
        addEntity(new Food(handler, 896 , 1088 ));
        addEntity(new Food(handler, 960 , 1088 ));
        addEntity(new Food(handler, 1280 , 1088 ));
        addEntity(new Food(handler, 1354 , 1088 ));
        addEntity(new Food(handler, 1468 , 1088 ));
        addEntity(new Food(handler, 1630 , 1088 ));
        addEntity(new Food(handler, 1680 , 1088 ));
        addEntity(new Food(handler, 1788 , 1088));
        
        
        addEntity(new Food(handler, 64 ,1152 ));
        addEntity(new Food(handler, 184 , 1152 ));
        addEntity(new Food(handler, 238 , 1152 ));
        addEntity(new Food(handler, 390 , 1152 ));
        addEntity(new Food(handler, 512 , 1152 ));
        addEntity(new Food(handler, 576 , 1152 ));
        addEntity(new Food(handler, 896 , 1152 ));
        addEntity(new Food(handler, 960 , 1152 ));
        addEntity(new Food(handler, 1280 , 1152 ));
        addEntity(new Food(handler, 1354 , 1152 ));
        addEntity(new Food(handler, 1468 , 1152 ));
        addEntity(new Food(handler, 1630 , 1152 ));
        addEntity(new Food(handler, 1680 , 1152 ));
        addEntity(new Food(handler, 1788 , 1152 ));
        
        
        addEntity(new Food(handler, 64 ,1216 ));
        addEntity(new Food(handler, 184 , 1216 ));
        addEntity(new Food(handler, 238 , 1216 ));
        addEntity(new Food(handler, 390 , 1216 ));
        addEntity(new Food(handler, 512 , 1216 ));
        addEntity(new Food(handler, 576 , 1216 ));
        addEntity(new Food(handler, 896 , 1216 ));
        addEntity(new Food(handler, 960 , 1216 ));
        addEntity(new Food(handler, 1280 , 1216 ));
        addEntity(new Food(handler, 1354 , 1216 ));
        addEntity(new Food(handler, 1468 , 1216 ));
        addEntity(new Food(handler, 1630 , 1216 ));
        addEntity(new Food(handler, 1680 , 1216 ));
        addEntity(new Food(handler, 1788 , 1216 ));
        
        addEntity(new Food(handler, 64 ,1280 ));
        addEntity(new Food(handler, 184 , 1280 ));
        addEntity(new Food(handler, 238 , 1280 ));
        addEntity(new Food(handler, 390 , 1280 ));
        addEntity(new Food(handler, 512 , 1280 ));
        addEntity(new Food(handler, 576 , 1280 ));
        addEntity(new Food(handler, 896 , 1280 ));
        addEntity(new Food(handler, 960 , 1280 ));
        addEntity(new Food(handler, 1280 , 1280 ));
        addEntity(new Food(handler, 1354 , 1280 ));
        addEntity(new Food(handler, 1468 , 1280 ));
        addEntity(new Food(handler, 1630 , 1280 ));
        addEntity(new Food(handler, 1680 , 1280 ));
        addEntity(new Food(handler, 1788 , 1280 ));
        
        
        addEntity(new Food(handler, 64 ,1344 ));
        addEntity(new Food(handler, 184 , 1344 ));
        addEntity(new Food(handler, 238 , 1344 ));
        addEntity(new Food(handler, 390 , 1344 ));
        addEntity(new Food(handler, 512 , 1344 ));
        addEntity(new Food(handler, 576 , 1344 ));
        addEntity(new Food(handler, 896 , 1344 ));
        addEntity(new Food(handler, 960 , 1344 ));
        addEntity(new Food(handler, 1280 , 1344 ));
        addEntity(new Food(handler, 1354 , 1344 ));
        addEntity(new Food(handler, 1468 , 1344 ));
        addEntity(new Food(handler, 1630 , 1344 ));
        addEntity(new Food(handler, 1680 , 1344 ));
        addEntity(new Food(handler, 1788 , 1344 ));
        
        
         addEntity(new Food(handler, 64 , 1408 ));
        addEntity(new Food(handler, 184 , 1408 ));
        addEntity(new Food(handler, 238 , 1408 ));
        addEntity(new Food(handler, 390 , 1408 ));
        addEntity(new Food(handler, 1468 , 1408 ));
        addEntity(new Food(handler, 1630 , 1408 ));
        addEntity(new Food(handler, 1680 , 1408 ));
        addEntity(new Food(handler, 1788 , 1408 ));
        
        
        addEntity(new Food(handler, 64 , 1600 ));
        addEntity(new Food(handler, 184 , 1600 ));
        addEntity(new Food(handler, 238 , 1600 ));
        addEntity(new Food(handler, 292 , 1600 ));
        addEntity(new Food(handler, 356 , 1600 ));
        addEntity(new Food(handler, 420 , 1600 ));
        addEntity(new Food(handler, 484 , 1600 ));
        addEntity(new Food(handler, 548 , 1600 ));
        addEntity(new Food(handler, 612 , 1600 ));
        addEntity(new Food(handler, 676 , 1600));
        addEntity(new Food(handler, 740 , 1600 ));
        addEntity(new Food(handler, 804 , 1600 ));
        addEntity(new Food(handler, 868 , 1600 ));
        addEntity(new Food(handler, 932 , 1600 ));
        addEntity(new Food(handler, 996 , 1600 ));
        addEntity(new Food(handler, 1064 , 1600 ));
        addEntity(new Food(handler, 1128 , 1600 ));
        addEntity(new Food(handler, 1192 , 1600 ));
        addEntity(new Food(handler, 1256 , 1600 ));
        addEntity(new Food(handler, 1320 , 1600 ));
        addEntity(new Food(handler, 1384 , 1600 ));
        addEntity(new Food(handler, 1448 , 1600));
        addEntity(new Food(handler, 1512 , 1600 ));
        addEntity(new Food(handler, 1576 , 1600 ));
        addEntity(new Food(handler, 1630 , 1600 ));
        addEntity(new Food(handler, 1680 , 1600 ));
        addEntity(new Food(handler, 1788 , 1600 ));
        
        
        addEntity(new Food(handler, 64 , 1664 ));
        addEntity(new Food(handler, 184 , 1664 ));
        addEntity(new Food(handler, 238 , 1664 ));
        addEntity(new Food(handler, 292 , 1664 ));
        addEntity(new Food(handler, 356 , 1664 ));
        addEntity(new Food(handler, 420 , 1664 ));
        addEntity(new Food(handler, 484 , 1664 ));
        addEntity(new Food(handler, 548 , 1664 ));
        addEntity(new Food(handler, 612 , 1664 ));
        addEntity(new Food(handler, 676 , 1664));
        addEntity(new Food(handler, 740 , 1664 ));
        addEntity(new Food(handler, 804 , 1664 ));
        addEntity(new Food(handler, 868 , 1664 ));
        addEntity(new Food(handler, 932 , 1664 ));
        addEntity(new Food(handler, 996 , 1664 ));
        addEntity(new Food(handler, 1064 , 1664 ));
        addEntity(new Food(handler, 1128 , 1664 ));
        addEntity(new Food(handler, 1192 , 1664 ));
        addEntity(new Food(handler, 1256 , 1664 ));
        addEntity(new Food(handler, 1320 , 1664 ));
        addEntity(new Food(handler, 1384 , 1664 ));
        addEntity(new Food(handler, 1448 , 1664 ));
        addEntity(new Food(handler, 1512 , 1664 ));
        addEntity(new Food(handler, 1576 , 1664 ));
        addEntity(new Food(handler, 1630 , 1664 ));
        addEntity(new Food(handler, 1680 , 1664 ));
        addEntity(new Food(handler, 1788 , 1664 ));
        
        addEntity(new Food(handler, 64 , 1728 ));
        addEntity(new Food(handler, 834 , 1728 ));
        addEntity(new Food(handler, 898 , 1728 ));
        addEntity(new Food(handler, 962 , 1728 ));
        addEntity(new Food(handler, 1036, 1728 ));
        addEntity(new Food(handler, 1788, 1728 ));
        
        
        addEntity(new Food(handler, 64, 1792));
        addEntity(new Food(handler, 110 , 1792));
        addEntity(new Food(handler, 164 , 1792 ));
        addEntity(new Food(handler, 228 , 1792 ));
        addEntity(new Food(handler, 292 , 1792 ));
        addEntity(new Food(handler, 356 , 1792 ));
        addEntity(new Food(handler, 420 , 1792 ));
        addEntity(new Food(handler, 484 , 1792 ));
        addEntity(new Food(handler, 548 , 1792 ));
        addEntity(new Food(handler, 612 , 1792 ));
        addEntity(new Food(handler, 676 , 1792 ));
        addEntity(new Food(handler, 740 , 1792 ));
        addEntity(new Food(handler, 804 , 1792 ));
        addEntity(new Food(handler, 868 , 1792 ));
        addEntity(new Food(handler, 932 , 1792 ));
        addEntity(new Food(handler, 996 , 1792 ));
        addEntity(new Food(handler, 1064 , 1792 ));
        addEntity(new Food(handler, 1128 , 1792 ));
        addEntity(new Food(handler, 1192 , 1792 ));
        addEntity(new Food(handler, 1256 , 1792 ));
        addEntity(new Food(handler, 1320 , 1792 ));
        addEntity(new Food(handler, 1384 , 1792 ));
        addEntity(new Food(handler, 1448 , 1792 ));
        addEntity(new Food(handler, 1512 , 1792 ));
        addEntity(new Food(handler, 1576 , 1792 ));
        addEntity(new Food(handler, 1640 , 1792 ));
        addEntity(new Food(handler, 1704 , 1792 ));
        addEntity(new Food(handler, 1788 , 1792));
       

    //Beasts
        addEntity(new Beast(handler, 1792 , 64 ));
        addEntity(new Beast(handler, 192, 192 ));
        addEntity(new Beast(handler, 1600, 256));
        addEntity(new Beast(handler, 1408, 384));
        addEntity(new Beast(handler, 384, 832));
        addEntity(new Beast(handler , 1024 , 1024 ));
       addEntity(new Beast(handler , 384 , 1472 ));
        addEntity(new Beast(handler , 1600 , 1600 ));
        addEntity(new Beast(handler , 192 , 1664 ));
        addEntity(new Beast(handler , 64 , 1792 ));
        addEntity(new BeastUp(handler , 64 , 1792 ));
        addEntity(new BeastUp(handler , 192 , 1600 ));
        addEntity(new BeastUp(handler , 384 , 384 ));
        addEntity(new BeastUp(handler , 1600 , 384 ));
        addEntity(new BeastUp(handler , 1472 , 1408 ));
        addEntity(new BeastUp(handler , 1792 , 64 ));
        
    }
}
