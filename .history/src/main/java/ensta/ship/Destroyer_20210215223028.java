package ensta.ship;

import ensta.utils.*;

/**
 * Destroyer
 */
public class Destroyer extends AbstractShip {

    Destroyer(Orientation orientation){
        super("Destroyer", 'D', 0, orientation)
    }
}