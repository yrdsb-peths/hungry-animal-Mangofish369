import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
    
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    
    String direction = "right";
    public Elephant(){
        for(int i = 0; i< idleRight.length; i++){
            idleRight[i] = new GreenfootImage("images/elephant_idle/idle"+ i +".png");
            idleRight[i].scale(100,70);
        }
        
        for(int i = 0; i<idleLeft.length; i++){
            idleLeft[i] = new GreenfootImage("images/elephant_idle/idle"+ i +".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(90,60);
        }    
        setImage(idleRight[0]);
    }    
    public void act() 
    {
       if(Greenfoot.isKeyDown("a")){
            direction = "left";
            move(-10);
       }
        
       if(Greenfoot.isKeyDown("d")){
            direction = "right";
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
        if(direction.equals("right")){
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex+1) % idleRight.length;
        }
        
        else{
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex+1) % idleLeft.length;
        }
        
        
    }    
}
