package ensta.player;
import java.io.Serializable;
import java.util.List;

import ensta.board.*;
import ensta.ship.*;
import ensta.utils.*;
import ensta.*;

public class Player {
    /* **
     * Attributs
     */
    protected Board board;
    protected Board opponentBoard;
    protected int destroyedCount;
    protected AbstractShip[] ships;
    protected boolean lose;

    /* **
     * Constructeur
     */
    public Player(Board board, Board opponentBoard, List<AbstractShip> ships) {
        this.board = board;
        this.ships = ships.toArray(new AbstractShip[0]);
        this.opponentBoard = opponentBoard;
    }

    /* **
     * Méthodes
     */

    /**
     * Read keyboard input to get ships coordinates. Place ships on given coodrinates.
     */
    public void putShips() {
        boolean done = false;
        int i = 0;

        do {
            AbstractShip s = ships[i];
            String msg = String.format("placer %d : %s(%d)", i + 1, s.getName(), s.getSize()); //getLength()
            System.out.println(msg);
            InputHelper.ShipInput res = InputHelper.readShipInput();

            switch (res.orientation) {
                case "n":
                    s.setOrientation(Orientation.NORTH);
                    break;
                case "s":
                    s.setOrientation(Orientation.SOUTH);
                    break;
                case "e":
                    s.setOrientation(Orientation.EAST);
                    break;
                case "w":
                    s.setOrientation(Orientation.WEST);
                    break;
                default:
                    //throw 
                    break;
            }

            try {
                System.out.println("putship x: "+res.x+", y: "+res.y);
                board.putShip(s, res.x, res.y);
            } catch (Exception e) {
                System.out.println("Please entry another position!");
                i--;
            }
            ++i;
            done = i == 5;
            board.print();
        } while (!done);
    }

    public Hit sendHit(int[] coords) {
        boolean done = true;
        Hit hit = null;

        do {
            System.out.println("où frapper?");
            InputHelper.CoordInput hitInput = InputHelper.readCoordInput();
            // TODO call sendHit on this.opponentBoard

            // TODO : Game expects sendHit to return BOTH hit result & hit coords.
            // return hit is obvious. But how to return coords at the same time ?
        } while (!done);

        return hit;
    }

    public AbstractShip[] getShips() {
        return ships;
    }

    public void setShips(AbstractShip[] ships) {
        this.ships = ships;
    }
}
