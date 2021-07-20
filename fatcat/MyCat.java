import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
        // Cada uno de los comentarios
        sleep(2);   // Dormir un poco.
        // Bailar si el gato esta aburrido
        if (isBored()) {
            dance();
        }
        // Comer si tiene hambre
        if(isHungry()) {
            eat();
        }
        
        if (isAlone()) {
            sleep(10);
        } else {
            shoutHooray();
        }
        //eat();
        //dance();
        //sleep(10);
        //eat();
        //eat();
        //dance();
    }    
}
