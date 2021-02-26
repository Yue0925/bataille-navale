package ensta.ship;

/**
 * ShipState
 */
public class ShipState {

    private AbstractShip ship;
    private boolean struck;


    public void addStrike(){

    }

    public boolean isStruck(){
        return struck;
    }

    @Override
    public String toString() {
        return ship.getLable();
    }
}