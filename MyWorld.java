import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        // Make our Elephant
        Elephant elephant = new Elephant();
        addObject(elephant, 0,200);
        
        // Make Pear
        spawnPear();
    } 
    
    // Spawn pear at random x location
        public void spawnPear(){
            Pear pear = new Pear();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = 10;
            addObject(pear,x, y);
    }
}
