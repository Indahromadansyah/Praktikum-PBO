import greenfoot.*;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Characters
{
    
    public void act(){
    int xPoss = this.getX();
    int yPoss = this.getY();
    World world = this.getWorld();
    this.move(1);
    
    if (Greenfoot.isKeyDown("space")){
        this.setLocation(xPoss, yPoss - 4);
    }
    
    if (xPoss == world.getWidth() - 1){
        this.setLocation(0, yPoss);
    }
    
    if (yPoss == world.getHeight()- 1) {
        this.setLocation(xPoss, 0);
    }
    
    }
}

    

