package ensta.ship;

import ensta.utils.*;

/**
 * Carrier
 */
public class Carrier extends AbstractShip {

    Carrier(Orientation orientation){
        super("Carrier", 'c', 5, orientation);
    }
}