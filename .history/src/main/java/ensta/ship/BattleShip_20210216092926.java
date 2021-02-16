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
        super(ShipsType.BATTLESHIP.getFullName(), ShipsType.BATTLESHIP.getLabel(),
         ShipsType.BATTLESHIP.getSize(), orientation);
    }

    /**
     * Constructor defaut to east
     */
    BattleShip(){
        this(Orientation.EAST);
    }
}