package ensta.ship;

import ensta.utils.*;

/**
 * AbstractShip
 */
public  abstract class AbstractShip {
    /**
     * Attributs
     */
    protected char lable;
    protected ShipsType name;
    protected int size;
    protected Orientation orientation;

    /**
     * Constructor
     * @param name
     * @param lable
     * @param size
     * @param orientation
     */
    AbstractShip(ShipsType name, char lable, int size, Orientation orientation){
        this.name = name;
        this.lable = lable;
        this.size = size;
        this.orientation = orientation;
    }
    
    
}