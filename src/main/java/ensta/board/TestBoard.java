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
            myBoard.putShip(shipB, 1, 1);
            myBoard.putShip(shipC, 5, 5);
            //myBoard.putShip(shipD, 5, 10);
            myBoard.putShip(shipD, 8, 9);
            myBoard.print();
            System.out.println("hit status: " + myBoard.sendHit(3, 3));
            myBoard.print();
            System.out.println("hit status: " + myBoard.sendHit(8, 10));
            myBoard.print();
            System.out.println("hit status: " + myBoard.sendHit(8, 9));
            myBoard.print();
            System.out.println("hit status: " + myBoard.sendHit(5, 5));
            myBoard.print();
            System.out.println("hit status: " + myBoard.sendHit(1, 2));
            myBoard.print();
            System.out.println("hit status: " + myBoard.sendHit(1, 3));
            myBoard.print();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}