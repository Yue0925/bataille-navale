package ensta.ship;

/**
 * AbstractShip
 */
public  abstract class AbstractShip {
    /**
     * Attributs
     */
    protected char lable;
    protected String name;
    protected int size;
    protected Orientation orientation;

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
    
    
}