package ensta.game;
import java.awt.List;

import ensta.board.*;
import ensta.ship.*;
import ensta.utils.*;

/**
 * TestGame
 */
public class TestGame {
    private static void sleep(int ms) { 
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) { 
            e.printStackTrace();
        }
     }

    public static void main(String[] args) {
        Board board = new Board("board");
        List<AbstractShip> ships = Arrays.asList(new Destroyer(), new Submarine(), 
        new Submarine(), new BattleShip(), new Carrier());

        BattleShipsAI ai = new BattleShipsAI(board, board);
        int shipsDownCount = ships.getSize();
        int[] coords = new int [2];
        Hit hit = null;

        while (shipsDownCount > 0) {
            hit = ai.sendHit(coords);
            System.out.println("coords: (" + coords[0] + ", " + coords[1] + "), hit status: " + hit);
        }


    }
}