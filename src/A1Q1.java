
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create City 
        City kw = new City();
      
        //Make walls and things for city
        new Wall(kw,1,4,Direction.EAST);
        new Thing(kw,1,4,Direction.EAST);
        new Thing(kw,1,3,Direction.EAST);
       
        //Make Robot
        Robot karel = new Robot(kw,1,0,Direction.EAST);
        
        //algorithm
        while(karel.frontIsClear()){
            if(karel.canPickThing()){
                break;
            }else{
                karel.move();
            }
        }
    }
}
