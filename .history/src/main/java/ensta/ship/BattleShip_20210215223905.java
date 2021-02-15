package ensta.ship;
import ensta.utils.*;

/**
 * BattleShip
 */
public class BattleShip extends AbstractShip {

    /**
     * Constructor
     * @param orientation
     */
    BattleShip(Orientation orientation){
        super("BattleShip", 'b', 4, orientation);
    }

    /**
     * Constructor defaut to east
     */
    BattleShip(){
        this(Orientation.EAST);
    }
}