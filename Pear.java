import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Pear extends Actor
{

    public void act()
    {
        setLocation(getX(), getY()+2);
        
        //If the fruit falls, game over
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight()){
            world.gameOver();
            world.removeObject(this);
        }
    }    
}
