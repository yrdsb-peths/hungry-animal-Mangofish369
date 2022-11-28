import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{ 
    public void act() 
    {
        // Add your action code here.
        move(4);
        
        if(isAtEdge()){
            turn(180);
        }
    }    
}
