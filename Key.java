import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    
    private boolean isDown; 
    private String key; 
    private String sound; 
    /**
     * Create a new key.
     */
    public Key()
    {
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        if(!isDown && Greenfoot.isKeyDown("Key"))
        {
            setImage("white-key-down.png");
            play();
            isDown=true; 
        }
        if(isDown && !Greenfoot.isKeyDown("Key"))
        {
            setImage("white-key.png");
            isDown=false; 
        }
    }
    
    public void play()
    {
        Greenfoot.playSound("sound");
    }
    
    public Key(String keyName, String soundFile)
    {
        key=keyName;
        sound=soundFile; 
    }
    
}