package ensta.ship;

import ensta.utils.*;

/**
 * Destroyer
 */
public class Destroyer extends AbstractShip {

    /**
     * Constructor
     * @param orientation
     */
    Destroyer(Orientation orientation){
        super("Destroyer", 'D', 2, orientation);
    }

    Destroyer(){
        super("Destroyer", 'D', 2, Orientation.EAST);
    }
}