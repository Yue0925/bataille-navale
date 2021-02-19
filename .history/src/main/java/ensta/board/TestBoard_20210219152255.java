package ensta.board;

import ensta.ship.*;

/**
 * TestBoard
 */

public class TestBoard {
    public static void main(String[] args) {
        Board myBoard = new Board("myBoard");
        myBoard.print();

        BattleShip shipB = new BattleShip();
        Carrier shipC = new Carrier();

        try {
            myBoard.putShip(shipB, 0, 0);
            myBoard.putShip(shipC, 10, 10);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}