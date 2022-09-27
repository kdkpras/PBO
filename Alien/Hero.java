import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        edge();
        //if(getX()==590)
          //setLocation(0, getY());
        // Add your action code here.
        // act dipanggil 60  frame per detik
    }
    
    public void edge(){
        move(3);
        if(getX()==590)
          setLocation(0, getY());
    }
}
