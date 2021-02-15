package ensta.ship;
import ensta.utils.*;

/**
 * BattleShip
 */
public class BattleShip extends AbstractShip {

    BattleShip(Orientation orientation){
        super("BattleShip", 'b', 4, orientation);
    }

    BattleShip(){
        this(Orientation.EAST);
    }
}