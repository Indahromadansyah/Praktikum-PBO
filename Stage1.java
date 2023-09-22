import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Stage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage1 extends PlatfromStage
{
   int gravity = 1;
     
   public void setGravity(int gravity){
       this.gravity = gravity;
    }
    
   public int getGravity(){
        return this.gravity;
    }
    
   public Stage1()
    {
        Player butterfly = new Player();
        this.addObject(butterfly, 300, 200);
        this.gravity = 1;
        Player butterfly2 = new Player();
        this.addObject(butterfly2, 500, 0);
        Player butterfly3 = new Player();
        this.addObject(butterfly3, 400, 0);
        
        Buildings rumah = new Buildings();
        this.addObject(rumah, 10, 30);
    }
    
    public void act(){
        List<Characters> allChars = this.getObjects(Characters.class);
        for(Characters chara : allChars){
            int xPoss = chara.getX();
            int yPoss = chara.getY();
            chara.setLocation(xPoss, yPoss+this.gravity); 
        }
   }
}
