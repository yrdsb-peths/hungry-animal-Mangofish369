import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    Label levelLabel;
    int level = 1;
    int numOfPears = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        // Make our Elephant
        Elephant elephant = new Elephant();
        addObject(elephant, 0,300);
        
        // Label
        scoreLabel = new Label("Score: "+score,60);
        addObject(scoreLabel, 100, 40);
        
        levelLabel = new Label("Speed: "+level,60);
        addObject(levelLabel, 100, 90);
        // Make Pear
        spawnPear();
    } 
    //Increase score
    public void increaseScore(){
        score++;
        scoreLabel.setValue("Score: "+score);
    }
    
    public void increaseLeve(){
        
    }
    
    // Spawn pear at random x location
        public void spawnPear(){
            Pear pear = new Pear();
            pear.setSpeed(level);
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = 10;
            addObject(pear,x, y);
            numOfPears++;
            if(numOfPears % 5 == 0){
                level+= 1;
                levelLabel.setValue("Speed: "+level);
            }
    }
    
    //End Game
    public void gameOver(){
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300,200);
    }
}
