package ensta.game;
import ensta.board.*;
import ensta.ship.*;

/**
 * TestGame
 */
public class TestGame {

    public static void main(String[] args) {
        Board board = new Board("board");
        List<AbstractShip> ships = Arrays.asList(new Destroyer(), new Submarine(), 
        new Submarine(), new BattleShip(), new Carrier());

        BattleShipsAI ai = new BattleShipsAI(board, board);
        

    }
}