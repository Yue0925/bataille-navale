package ensta.ship;

import ensta.utils.*;

/**
 * AbstractShip
 */
public  abstract class AbstractShip {
    /**
     * Attributs
     */
    private char lable;
    private String name;
    private int size;
    private Orientation orientation;

    /**
     * Constructor
     * @param name
     * @param lable
     * @param size
     * @param orientation
     */
    AbstractShip(String name, char lable, int size, Orientation orientation){
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
    
    /**
     * Les accèsseurs
     */
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