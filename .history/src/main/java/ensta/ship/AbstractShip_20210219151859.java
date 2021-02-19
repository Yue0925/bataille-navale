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
    public AbstractShip(String name, char lable, int size, Orientation orientation){
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
    public char getLable() {
        return lable;
    }

    public String getName() {
        return name;
    }
    public Orientation getOrientation() {
        return orientation;
    }
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Ship's Type: " + name + ", label:" + 
        lable + ", size: " + size + ", orientation: " + orientation;
    }
}