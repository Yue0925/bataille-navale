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
        super(ShipsType.AIRCRAFTCARRIER.getFullName(), ShipsType.AIRCRAFTCARRIER.getLabel()
        , ShipsType.AIRCRAFTCARRIER.getSize(), orientation);
    }

    /**
     * Constructor defaut to east
     */
    Carrier(){
        this(Orientation.EAST);
    }
}