import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        // Make our Elephant
        Elephant elephant = new Elephant();
        addObject(elephant, 0,300);
        
        // Label
        scoreLabel = new Label(0,60);
        addObject(scoreLabel, 40, 40);
        // Make Pear
        spawnPear();
    } 
    //Increase score
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
    }
    
    // Spawn pear at random x location
        public void spawnPear(){
            Pear pear = new Pear();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = 10;
            addObject(pear,x, y);
    }
    
    //End Game
    public void gameOver(){
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300,200);
    }
}
