package ensta.ship;

import ensta.utils.*;

/**
 * Carrier
 */
public class Carrier extends AbstractShip {

    /**
     * Constructor
     * @param orientation
     */
    Carrier(Orientation orientation){
        super("Carrier", 'c', 5, orientation);
    }

    /**
     * Constructor defaut to east
     */
    Carrier(){
        this(Orientation.EAST);
    }
}