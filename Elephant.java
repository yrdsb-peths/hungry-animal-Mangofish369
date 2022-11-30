import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{ 
    public void act() 
    {
       if(Greenfoot.isKeyDown("a")){
            move(-10);
       }
        
       if(Greenfoot.isKeyDown("d")){
            move(10);
       }
       
       consume();
       
       /* 
        * move(speed);
        * if(Greenfoot.isKeyDown("key")){ }
        * int x = Greenfoot.getRandomNumber(limit);  
        * if(isAtEdge()){ }
        */
    }    
    
    // Eat pear when in contact and spawn a new one
    public void consume(){
        if(isTouching(Pear.class)){
            removeTouching(Pear.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnPear();
        }
    }
}
