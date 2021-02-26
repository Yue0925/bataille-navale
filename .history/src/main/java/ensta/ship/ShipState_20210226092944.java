package ensta.ship;

import ensta.utils.*;

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
     * Constructor
     * @param ship to be referenced
     */
    public ShipState(AbstractShip ship){
        this.ship = ship;
        struck = false;
    }

    /**
     * 
     */
    public void addStrike(){
        ship.addStrike();
        struck = true;
    }

    /**
     * @return if this ship is attacked
     */
    public boolean isStruck(){
        return struck;
    }

    /**
     * Return the label of this ship on red is the ship is attacked
     */
    @Override
    public String toString() {
        return isStruck()? ColorUtil.colorize(ship.getLable(), ColorUtil.Color.RED) : ""+ship.getLable();
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