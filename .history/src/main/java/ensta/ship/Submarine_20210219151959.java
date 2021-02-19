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
    public Submarine(Orientation orientation){
        super(ShipsType.SUBMARINE.getFullName(), ShipsType.SUBMARINE.getLabel()
        , ShipsType.SUBMARINE.getSize(), orientation);
    }

    /**
     * COnstructor defaut to east
     */
    public Submarine(){
        this(Orientation.EAST);
    }
    
}
