
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city
        City kw = new City();
        //make things
        new Thing(kw,0,0,Direction.EAST);
        new Thing(kw,0,0,Direction.EAST);
        new Thing(kw,0,0,Direction.EAST);
        new Thing(kw,0,0,Direction.EAST);
        new Thing(kw,0,0,Direction.EAST);
        new Thing(kw,0,0,Direction.EAST);
        new Thing(kw,0,0,Direction.EAST);
        new Thing(kw,0,0,Direction.EAST);
        new Thing(kw,0,0,Direction.EAST);
        new Thing(kw,0,0,Direction.EAST);
        
       //make robot
        Robot karel = new Robot(kw,0,0,Direction.EAST);
        
        //make robot pick up things
        int pickThing = 10;
        while(pickThing > 0){
            karel.pickThing();
            pickThing--;
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.putThing();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
        }
        karel.move();
        
    }
}
