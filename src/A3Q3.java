
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make city
        City kw = new City();
        
        // Make walls in city
        new Wall(kw,0,0,Direction.NORTH);
        new Wall(kw,0,0,Direction.WEST);
        new Wall(kw,1,0,Direction.WEST);
        new Wall(kw,2,0,Direction.WEST);
        new Wall(kw,2,0,Direction.SOUTH);
        new Wall(kw,2,1,Direction.SOUTH);
        new Wall(kw,2,2,Direction.SOUTH);
        new Wall(kw,2,3,Direction.SOUTH);
        new Wall(kw,2,3,Direction.EAST);
        new Wall(kw,1,3,Direction.EAST);
        new Wall(kw,0,3,Direction.EAST);
        new Wall(kw,0,3,Direction.NORTH);
        new Wall(kw,0,2,Direction.NORTH);
        
        //make karel
        Robot karel = new Robot(kw,1,1,Direction.SOUTH);
        
        //escape plan
        while(karel.frontIsClear()){
            if(karel.frontIsClear()){
                
            }
        }
        
    }
}
