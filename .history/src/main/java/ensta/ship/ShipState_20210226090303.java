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
        
    }

    /**
     * 
     * @return
     */
    public boolean isStruck(){
        return struck;
    }

    /**
     * 
     */
    @Override
    public String toString() {
        return ship.getLable();
    }

    /**
     * 
     * @return
     */
    public boolean isSunk(){
        return ship.isSunk();
    }

    public AbstractShip getShip(){
        return ship;
    }
}