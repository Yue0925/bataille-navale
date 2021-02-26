package ensta.board;

import ensta.ship.*;

/**
 * TestBoard
 */

public class TestBoard {
    public static void main(String[] args) {
        Board myBoard = new Board("myBoard");
        //myBoard.print();

        BattleShip shipB = new BattleShip();
        Carrier shipC = new Carrier();
        Destroyer shipD = new Destroyer();

        try {
            //myBoard.putShip(shipB, 0, 0);
            myBoard.putShip(shipB, 5, 5);
            myBoard.putShip(shipC, 10, 10);
            //myBoard.putShip(shipD, 10, 10);
            myBoard.putShip(shipD, 9, 10);

            System.out.println("hit status" + myBoard.sendHit(3, 3));
            myBoard.sendHit(5, 5);
            myBoard.sendHit(5, 5);

        } catch (Exception e) {
            System.out.println(e);
        }
        myBoard.print();
    }
    
}