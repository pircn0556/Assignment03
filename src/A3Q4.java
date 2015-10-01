
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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make city for Robot
        City kw = new City();
        
        // Make walls in kw
        new Wall(kw, 1,1, Direction.NORTH);
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,2,1,Direction.WEST);
        new Wall(kw,2,1,Direction.SOUTH);
        new Wall(kw,2,2,Direction.SOUTH);
        new Wall(kw,2,2,Direction.EAST);
        new Wall(kw,1,2,Direction.EAST);
        new Wall(kw,1,2,Direction.NORTH);
        
        //make Robot
        Robot karel = new Robot(kw,0,2,Direction.WEST);
        
        int square = 4;
        while(square>0){
            if(karel.frontIsClear()){
                karel.move();
                karel.move();
                karel.turnLeft();
            }else{
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
                karel.turnLeft();
                karel.move();
                square--;
            }

        }
    }
}
