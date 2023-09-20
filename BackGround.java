import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackGround extends World
{

    /**
     * Constructor for objects of class BackGround.
     * 
     */
    public BackGround()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Mobil mobil = new Mobil();
        addObject(mobil,86,524);
        Tong tong = new Tong();
        addObject(tong,341,512);
        Tong tong2 = new Tong();
        addObject(tong2,537,514);
        Tong tong3 = new Tong();
        addObject(tong3,445,176);
        Tong tong4 = new Tong();
        addObject(tong4,444,352);
        Tong tong5 = new Tong();
        addObject(tong5,619,249);
        Tong tong6 = new Tong();
        addObject(tong6,245,264);
        Tong tong7 = new Tong();
        addObject(tong7,241,70);
        Tong tong8 = new Tong();
        addObject(tong8,717,357);
        Tong tong9 = new Tong();
        addObject(tong9,104,381);
        Tong tong10 = new Tong();
        addObject(tong10,703,74);
    }
}
