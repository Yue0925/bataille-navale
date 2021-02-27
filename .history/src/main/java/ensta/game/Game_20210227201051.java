package ensta.game;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import ensta.player.*;
import ensta.utils.*;
import ensta.board.*;
import ensta.ship.*;

public class Game {

    /* ***
     * Constante
     */
    public static final File SAVE_FILE = new File("savegame.dat");

    /* ***
     * Attributs
     */
    private Player player1;
    private Player player2;
    private Scanner sin;
    private boolean modeTwoPlayers;

    /* ***
     * Constructeurs
     */
    public Game() {}

    /**
     * Choose one player or two players
     */
    private void chooseMode(){
        boolean done = false;
        do {
            System.out.println("Mode two players? [y/n]");
            String mode = sin.nextLine();
            if(mode.equals("y")){
                modeTwoPlayers = true;
                done = true;
            }else if(mode.equals("n")){
                modeTwoPlayers = false;
                done = true;
            }else{
                System.out.println("Plese respond y or n.");
            }
        } while (!done);

    }
    
    public Game init() {
        if (!loadSave()) {
            // init attributes
            sin = new Scanner(System.in);
            chooseMode();
            System.out.println("entre ton nom:");
            String name = sin.nextLine();
            Board b1 = new Board(name);

            if(modeTwoPlayers){
                System.out.println("entre ton nom pour player2:");
                name = sin.nextLine();
            }else{
                name = "AI";
            }
            Board b2 = new Board(name);

            player1 = new Player(b1, b2, createDefaultShips());
            if(modeTwoPlayers){
                player2 = new Player(b2, b1, createDefaultShips());
            }else{
                player2 = new AIPlayer(b2, b1, createDefaultShips());
            }
            
            b1.print();
            // place player ships
            player1.putShips();
            if(modeTwoPlayers){ b2.print(); }
            player2.putShips();
        }
        return this;
    }

    /* ***
     * Méthodes
     */
    public void run() {
        int[] coords = new int[2];
        Board b1 = player1.getBoard();
        Board b2 = player2.getBoard();
        Hit hit;

        // main loop
        System.out.println("Game begins!!!");
        b1.print();
        boolean done = false;
        do {
            b2.print();
            System.out.print("Turn of: " + b1.getName() + " ");
            hit = player1.sendHit(coords); // send hit and set hit
            boolean strike = hit != Hit.MISS; // true if different from MISS

            done = updateScore();
            //b1.print();
            System.out.println(makeHitMessage(false /* outgoing hit */, coords, hit));

            save();

            if (!done && !strike) { // strike miss
                b1.print();
                do {
                    System.out.print("Turn of: " + b2.getName() + " ");
                    hit = player2.sendHit(coords);
                    strike = hit != Hit.MISS;
                    /*
                    if (strike) {
                        b1.print();
                    }
                    */
                    System.out.println(makeHitMessage(true /* incoming hit */, coords, hit));
                    done = updateScore();

                    if (!done) {
                        save();
                    }
                } while(strike && !done);
            }

        } while (!done);

        SAVE_FILE.delete();
        System.out.println(String.format("joueur %d gagne", player1.isLose() ? 2 : 1));
        sin.close();
    }


    private void save() {
        /*
        try {
            // TODO bonus 2 : uncomment
            //  if (!SAVE_FILE.exists()) {
            //      SAVE_FILE.getAbsoluteFile().getParentFile().mkdirs();
            //  }

            // TODO bonus 2 : serialize players

        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }

    private boolean loadSave() {
        /*
        if (SAVE_FILE.exists()) {
            try {
                // TODO bonus 2 : deserialize players

                return true;
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        */
        return false;
    }

    private boolean updateScore() {
        for (Player player : new Player[]{player1, player2}) {
            int destroyed = 0;
            for (AbstractShip ship : player.getShips()) {
                if (ship.isSunk()) {
                    destroyed++;
                }
            }

            player.setDestroyedCount(destroyed);
            player.setLose(destroyed == player.getShips().length);
            if (player.isLose()) {
                return true;
            }
        }
        return false;
    }

    private String makeHitMessage(boolean incoming, int[] coords, Hit hit) {
        String msg;
        ColorUtil.Color color = ColorUtil.Color.RESET;
        switch (hit) {
            case MISS:
                msg = hit.toString();
                break;
            case STIKE:
                msg = hit.toString();
                color = ColorUtil.Color.RED;
                break;
            default:
                msg = hit.toString() + " coulé";
                color = ColorUtil.Color.RED;
        }
        msg = String.format("%s Frappe en %c%d : %s", incoming ? "<=" : "=>",
                ((char) ('A' + coords[1] -1)),
                (coords[0]), msg);
        return ColorUtil.colorize(msg, color);
    }

    private static List<AbstractShip> createDefaultShips() {
        return Arrays.asList(new AbstractShip[]{new Destroyer(), new Submarine(), new Submarine(), new BattleShip(), new Carrier()});
    }

    public static void main(String args[]) {
        new Game().init().run();
    }
}
