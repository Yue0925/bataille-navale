package ensta.ship;

import ensta.utils.*;

/**
 * AbstractShip
 */
public  abstract class AbstractShip {
    /**
     * Attributs
     */
    protected ShipsLabel lable;
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
    AbstractShip(ShipsType name, ShipsLabel lable, int size, Orientation orientation){
        this.name = name;
        this.lable = lable;
        this.size = size;
        this.orientation = orientation;
    }
    
    /**
     * Mutateur de l'orientation
     * @param orientation
     */
    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }
    
}