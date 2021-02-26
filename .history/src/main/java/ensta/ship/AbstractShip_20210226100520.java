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
    private int strikCount;

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
        strikCount = 0;
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

    /**
     * Increment the number of attacted strikes 
     */
    public void addStrike() throws Exception{
        if(isSunk())
            throw new Exception("The number of Strike is enough and the ship is sunk already");
        else 
            strikCount++;
    }

    /**
     * A ship is sunk iff the number of strikes attacked equals it's size
     * @return whether the ship is sunk
     */
    public boolean isSunk(){
        return strikCount == getSize();
    }
}