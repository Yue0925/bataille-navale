package ensta.ship;
import ensta.utils.*;

/**
 * BattleShip
 */
public class BattleShip extends AbstractShip {

    /**
     * COnstructor
     * @param orientation
     */
    BattleShip(Orientation orientation){
        super("BattleShip", 'b', 4, orientation);
    }

    BattleShip(){
        this(Orientation.EAST);
    }
}