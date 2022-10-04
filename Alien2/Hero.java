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
        moveHero();
        // Add your action code here.
        //move(7);
        //if (getX()==599)
            //setLocation(0, getY());
    }
    
    public void moveHero(){
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-3);
            //move(2);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+3);
            //move(-2);
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+3, getY());
            //turn(2);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-3, getY());
            //turn(-2);
        }
    }
}
