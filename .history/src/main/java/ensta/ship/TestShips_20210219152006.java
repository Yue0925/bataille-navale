package ensta.ship;

import ensta.utils.*;

/**
 * TestShips
 */
public class TestShips {

    public static void main(String[] args) {
        BattleShip bs = new BattleShip();
        Carrier c = new Carrier();
        Destroyer d = new Destroyer();
        Submarine s = new Submarine();

        System.out.println(bs);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
    }
}