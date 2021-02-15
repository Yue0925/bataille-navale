package ensta;

/**
 * Board
 */

public class Board {
    private String name;
    private char ships [][];
    private boolean hits [][];

    Board(String name, int size){
        this.name = name;
        ships = new char[size][size];
        hits = new boolean[size][size];
    }
    
    Board(String name){
        Board(name, 10);
    }

    public void print(){
        int len = ++ships.length;

    }
}