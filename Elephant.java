import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
    
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] idle = new GreenfootImage[8];
    
    public Elephant(){
        for(int i = 0; i< idle.length; i++){
            idle[i] = new GreenfootImage("images/elephant_idle/idle"+ i +".png");
        }
        setImage(idle[0]);
    }    
    public void act() 
    {
       if(Greenfoot.isKeyDown("a")){
            move(-10);
       }
        
       if(Greenfoot.isKeyDown("d")){
            move(10);
       }
       
       
       consume();
       
       animateElephant();
    }    
    
    // Eat pear when in contact and spawn a new one
    public void consume(){
        if(isTouching(Pear.class)){
            removeTouching(Pear.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnPear();
            world.increaseScore();
            elephantSound.play();
        }
    }
    
    int imageIndex = 0;
    public void animateElephant(){
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex+1) % idle.length;
    }    
}
