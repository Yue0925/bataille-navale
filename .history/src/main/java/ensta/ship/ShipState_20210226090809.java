package ensta.ship;

/**
 * ShipState
 */
public class ShipState {

    /**
     * Attributs
     */
    private AbstractShip ship;
    private boolean struck;

    /**
     * 
     */
    public void addStrike(){
        //TODO
        struck = true;
    }

    /**
     * 
     * @return
     */
    public boolean isStruck(){
        return struck;
    }

    /**
     * Return the label of this ship on red is the ship is attacked
     */
    @Override
    public String toString() {
        return ship.getLable();
    }

    /**
     * @return if the ship is totaly sunk
     */
    public boolean isSunk(){
        return ship.isSunk();
    }

    /**
     * getter
     * @return the ship referenced
     */
    public AbstractShip getShip(){
        return ship;
    }
}