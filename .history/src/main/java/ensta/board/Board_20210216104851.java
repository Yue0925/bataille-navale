package ensta.board;

import ensta.ship.AbstractShip;

/**
 * Board
 */

public class Board implements IBoard {
    /**
     * Attributs
     */
    private String name;
    private char ships [][];
    private boolean hits [][];

    /**
     * Constructor of Board
     * @param name
     * @param size
     */
    Board(String name, int size){
        this.name = name;
        ships = new char[size][size];
        hits = new boolean[size][size];
    }
    
    /**
     * Constructor with grid's defaut size of 10
     * @param name
     */
    Board(String name){
        this(name, 10);
    }

    /** 
     * Les getters
     */

    public boolean[][] getHits() {
        return hits;
    }
    public char[][] getShips() {
        return ships;
    }
    public String getName() {
        return name;
    }
   
    /** 
     * Les setters
     */

    public void setHits(boolean[][] hits) {
        this.hits = hits;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setShips(char[][] ships) {
        this.ships = ships;
    }

    /**
     * Overload the interface's methode
     * @return the size of the grids contained in the Board
     */
    public int getSize(){
        return ships[0].length;
    }

    /**
     * Overload the interface's methode
     * If the given position is not vaild, puting is failed and the game continues
     */
    public void putShip(AbstractShip ship, int x, int y){
        int s = getSize();
        try {
            if(x<1 || y<1 || x>s || y>s)
                throw new IllegalArgumentException("Your position chosed is ("+x+","+y+"), but both coordonates should between"+
            1+" and "+s);
            else
                ships[x][y] = ship.getLable();
        } catch (IllegalArgumentException e) {
           System.out.println("Puting ship is failed, the game continues.");
        }   
    }

    /**
     * Overload the interface's methode
     * No ship will be out of board, if the position is invalid, return false by defaut 
     * and the game continues.
     */
    public boolean hasShip(int x, int y){
        int s = getSize();
        try {
            if(x<1 || y<1 || x>s || y>s)
                throw new IllegalArgumentException("The position chosed ("+x+","+y+") is out of range, both coordonates should between"+
            1+" and "+s);
            else
                return (ships[x][y] != '\0');
        } catch (IllegalArgumentException e) {
           System.out.println("No ship will be out of board, the game continues.");
           return false;
        }
    }

    /**
     * Overload the interface's methode
     * Hit cannot be affected out of board, if the given position is invalid,
     * nothing happens and the game goes on.
     */
    public void setHit(boolean hit, int x, int y){
        int s = getSize();
        try {
            if(x<1 || y<1 || x>s || y>s)
                throw new IllegalArgumentException("The position chosed ("+x+","+y+") is out of range, both coordonates should between"+
            1+" and "+s);
            else
                hits[x][y] = hit;// or true ?
        } catch (IllegalArgumentException e) {
           System.out.println("So the hit missed, the game continues.");
        }
    }

    /**
     * Overload the interface's methode
     * No hit will be out of the board, if the given position is invalid,
     * nothing happens and return false by defaut, the game goes on.
     */
    public Boolean getHit(int x, int y){
        int s = getSize();
        try {
            if(x<1 || y<1 || x>s || y>s)
                throw new IllegalArgumentException("The position chosed ("+x+","+y+") is out of range, both coordonates should between"+
            1+" and "+s);
            else
                return hits[x][y];
        } catch (IllegalArgumentException e) {
           System.out.println("No hit will be out of the board, the game continues.");
           return false;
        }
    }

    /**
     * Print two grids in terminal
     */
    public void print(){
        int len = ships.length +1;

        System.out.println("Navires:");
        System.out.print(" ");
        for(int i=1; i<len; i++){ System.out.print(" " + i + " ");}
        System.out.println();
        for(int i=1; i<len; i++){
            System.out.print(i);
            for(int j=1; j<len; j++){ 
                if(hasShip(i-1, j-1)){
                    System.out.print(" " + ships[i-1][j-1]+" ");
                }else{
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println("Frappes:");
        System.out.print(" ");
        for(int i=1; i<len; i++){ System.out.print(" " + i + " ");}
        System.out.println();
        for(int i=1; i<len; i++){
            System.out.print(i);
            for(int j=1; j<len; j++){ 
                if(getHit(i-1, j-1) == true){
                    System.out.print(" x ");
                }else{
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }


}