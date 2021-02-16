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
        super(ShipsType.DESTROYER.getFullName(), ShipsType.DESTROYER.getLabel()
        , ShipsType.DESTROYER.getSize(), orientation);
    }

    /**
     * Constructor defaut to east
     */
    Destroyer(){
        this(Orientation.EAST);
    }
}