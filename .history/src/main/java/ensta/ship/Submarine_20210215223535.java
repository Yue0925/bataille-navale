package ensta.ship;
import ensta.utils.*;

/**
 * Submarine
 */
public class Submarine extends AbstractShip {

    /**
     * Constructor
     * @param orientation
     */
    Submarine(Orientation orientation){
        super("Submarine", 's', 3, orientation);
    }

    Submarine(){
        this(Orientation.EAST);
    }
    
}
