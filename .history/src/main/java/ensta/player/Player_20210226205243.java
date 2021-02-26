package ensta.player;
import java.io.Serializable;
import java.util.List;

import ensta.board.*;
import ensta.ship.*;
import ensta.utils.*;

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
            s.setOrientation(Orientation.matchOrientation(res.orientation));
            try {
                board.putShip(s, res.x, res.y);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                i--;
            }
            ++i;
            done = i == 5;
            board.print();
        } while (!done);
    }

    public Hit sendHit(int[] coords) {
        boolean done = false;
        Hit hit = null;

        do {
            System.out.println("où frapper?");
            InputHelper.CoordInput hitInput = InputHelper.readCoordInput();
            try {
                coords[0] = hitInput.y; 
                coords[1] = hitInput.x;
                hit = opponentBoard.sendHit(hitInput.y, hitInput.x);
                done = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                done = false;
            }
            opponentBoard.print();
            board.print();
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
