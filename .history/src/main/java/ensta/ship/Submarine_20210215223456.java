package ensta.ship;
import ensta.utils.*;

/**
 * Submarine
 */
public class Submarine extends AbstractShip {

    Submarine(Orientation orientation){
        super("Submarine", 's', 3, orientation);
    }

    Submarine(){
        Submarine(Orientation.EAST);
    }
    
}
