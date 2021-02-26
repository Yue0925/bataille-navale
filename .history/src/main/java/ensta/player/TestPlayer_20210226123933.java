package ensta.player;

import ensta.ship.*;
import ensta.board.*;
import java.util.List;
import java.util.Arrays;

/**
 * TestPlayer
 */
public class TestPlayer {

    public static void main(String[] args) {
        Board myBoard = new Board("myBoard");
        Board enemyBoard = new Board("enemyBoard");

        List<AbstractShip> ships = Arrays.asList(new Destroyer(), new Submarine(), 
        new Submarine(), new BattleShip(), new Carrier());

        Player player = new Player(myBoard, enemyBoard, ships);
        player.putShips();

        int [] coords;
        player.sendHit(coords);
    }
}