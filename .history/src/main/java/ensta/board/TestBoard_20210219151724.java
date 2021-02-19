package ensta.board;

import ensta.ship.AbstractShip;
import ensta.ship.BattleShip;

/**
 * TestBoard
 */

public class TestBoard {
    public static void main(String[] args) {
        Board myBoard = new Board("myBoard");
        myBoard.print();

        BattleShip ship = new BattleShip();
        
    }
    
}