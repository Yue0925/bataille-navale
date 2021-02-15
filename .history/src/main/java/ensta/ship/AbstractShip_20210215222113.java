package ensta.ship;

import ensta.utils.*;

/**
 * AbstractShip
 */
public  abstract class AbstractShip {
    /**
     * Attributs
     */
    private ShipsLabel lable;
    private ShipsType name;
    private int size;
    private Orientation orientation;

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
    
    public ShipsLabel getLable() {
        return lable;
    }

    public ShipsType getName() {
        return name;
    }
    public Orientation getOrientation() {
        return orientation;
    }
    public int getSize() {
        return size;
    }
}