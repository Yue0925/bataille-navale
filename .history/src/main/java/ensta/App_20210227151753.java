package ensta;

import ensta.game.*;
import ensta.player.*;
import ensta.utils.*;
import ensta.board.*;
import ensta.ship.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Game game = new Game();
        game = game.init();
        game.run();
    }
}
