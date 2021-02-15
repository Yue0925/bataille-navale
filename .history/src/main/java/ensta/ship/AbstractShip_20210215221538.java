package ensta.ship;

import ensta.utils.*;

/**
 * AbstractShip
 */
public  abstract class AbstractShip {
    /**
     * Attributs
     */
    protected SipsLabl lable;
    protected ShipsType name;
    protected int size;
    protected Orientation orientation;

    /**
     * Constructor
     * @param ShipsType
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