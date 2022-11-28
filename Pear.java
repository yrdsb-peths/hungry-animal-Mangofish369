import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Pear extends Actor
{

    public void act() 
    {
        // Add your action code here.
        setLocation(getX(),getY() +3);
        for(int i = 0;i<3;i++){
            int direction = 0;
            if(isAtEdge() && getY() == 0){
                direction = 3;
            }
            else if (isAtEdge() && getY() == 400){
                direction = -3;
            }
            setLocation(getX(),getY()+direction);
        }
    }    
}
