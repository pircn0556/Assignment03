
import becker.robots.City;
import becker.robots.Direction;
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City kw = new City();

        //create escape room
        new Wall(kw, 0, 0, Direction.NORTH);
        new Wall(kw, 0, 0, Direction.WEST);
        new Wall(kw, 1, 0, Direction.WEST);
        new Wall(kw, 2, 0, Direction.WEST);
        new Wall(kw, 2, 0, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 1, 3, Direction.EAST);
        new Wall(kw, 0, 3, Direction.EAST);
        new Wall(kw, 0, 3, Direction.NORTH);
        new Wall(kw, 0, 2, Direction.NORTH);
        new Wall(kw, 0, 1, Direction.NORTH);

        //create litter
        new Thing(kw, 0, 1, Direction.EAST);
        new Thing(kw, 1, 1, Direction.EAST);
        new Thing(kw, 2, 0, Direction.EAST);
        new Thing(kw, 1, 2, Direction.EAST);
        new Thing(kw, 1, 3, Direction.EAST);
        new Thing(kw, 2, 3, Direction.EAST);

        //make karel
        Robot karel = new Robot(kw, 0, 0, Direction.EAST);

        //make him pick up litter
        while (true) {
            if (karel.canPickThing()) {
                karel.pickThing();
            }
            if (karel.frontIsClear()) {
                karel.move();
            } else {
                if (karel.getDirection() == Direction.WEST) {
                    karel.turnLeft();
                    karel.move();
                    karel.turnLeft();
                } else {
                    if (karel.getDirection() == Direction.EAST) {
                        karel.turnLeft();
                        karel.turnLeft();
                        karel.turnLeft();
                        karel.move();
                        karel.turnLeft();
                        karel.turnLeft();
                        karel.turnLeft();
                    }

                }

            }

        }
    }
}
