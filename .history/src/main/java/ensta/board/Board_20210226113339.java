package ensta.board;

import ensta.ship.*;
import ensta.utils.ColorUtil;
import ensta.utils.Hit;

/**
 * Board
 */

public class Board implements IBoard {
    /**
     * Attributs
     */
    private String name;
    private ShipState ships [][];
    private Boolean hits [][];

    /**
     * Constructor of Board
     * @param name
     * @param size
     */
    public Board(String name, int size){
        this.name = name;
        ships = new ShipState[size][size];
        hits = new Boolean[size][size];
    }
    
    /**
     * Constructor with grid's defaut size of 10
     * @param name
     */
    public Board(String name){
        this(name, 10);
    }

    /** 
     * Les getters
     */

    public Boolean[][] getHits() {
        return hits;
    }
    public ShipState[][] getShips() {
        return ships;
    }
    public String getName() {
        return name;
    }
   
    /** 
     * Les setters
     */

    public void setHits(Boolean[][] hits) {
        this.hits = hits;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setShips(ShipState[][] ships) {
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
     * If the given position is not vaild, or a ship already exists, throw erreors
     */
    public void putShip(AbstractShip ship, int x, int y) throws Exception{
        int s = getSize();

        if(x<1 || y<1 || x>s || y>s){
            throw new IllegalArgumentException("Your position chosed is ("+x+","+y+"), but both coordonates should between"+
        1+" and "+s);
        }
        if(hasShip(x, y)){
            throw new BoardException("A ship already exists at ("+x+","+y+"), ships cannot insersect.");
        }
        ships[x-1][y-1] = new ShipState(ship);
    }

    /**
     * Overload the interface's methode
     * No ship will be out of board, if the position is invalid, return false by defaut, throw error
     */
    public boolean hasShip(int x, int y) throws IllegalArgumentException{
        int s = getSize();
        if(x<1 || y<1 || x>s || y>s){
            throw new IllegalArgumentException("The position chosed ("+x+","+y+") is out of range, both coordonates should between"+
        1+" and "+s);
        }
        return !(ships[x-1][y-1] == null || ships[x-1][y-1].isSunk());
    }

    /**
     * Overload the interface's methode
     * Hit cannot be affected out of board, if the given position is invalid, throw error
     */
    public void setHit(boolean hit, int x, int y) throws IllegalArgumentException{
        int s = getSize();
        if(x<1 || y<1 || x>s || y>s){
            throw new IllegalArgumentException("The position chosed ("+x+","+y+") is out of range, both coordonates should between"+
        1+" and "+s);
        }
        hits[x-1][y-1] = Boolean.valueOf(hit);
    }

    /**
     * Overload the interface's methode
     * No hit will be out of the board, if the given position is invalid,
     * nothing happens and return false by defaut, the game goes on.
     */
    public Boolean getHit(int x, int y) throws IllegalArgumentException{
        int s = getSize();
        if(x<1 || y<1 || x>s || y>s){
            throw new IllegalArgumentException("The position chosed ("+x+","+y+") is out of range, both coordonates should between"+
        1+" and "+s);
        }
        return hits[x-1][y-1];
    }

    /**
     * Overload the interface's methode
     * if the ship is sunk, then both ship and hit shoulb dispear in grids
     */
    public Hit sendHit(int x, int y){
        if(!hasShip(x, y)){
            setHit(false, x, y);
            return Hit.MISS;
        }
        setHit(true, x, y);
        ships[x-1][y-1].addStrike();
        if(ships[x-1][y-1].isSunk()){
            System.out.println(ships[x-1][y-1].getShip().getLable() + " coulé");
            hits[x-1][y-1] = null;
            return Hit.fromInt(ships[x-1][y-1].getShip().getSize());
        }
        return Hit.STIKE;
    }

    /**
     * Print two grids in terminal
     */
    public void print(){
        int len = ships.length +1;
        printBoardIndice(len-1);
        for(int i=1; i<len; i++){
            System.out.print(i);
            printLineShips(len, i);
            System.out.print(" ");
            printLineHits(len, i);
            System.out.println();
        }
    }

    /**
     * Print indices in the border
     * @param len
     */
    public void printBoardIndice(int len){
        System.out.print(" Navires:"  + String.format("%" + (3 * ships[0].length - 7) + "s", ""));
        System.out.print(" Frappes:"  + String.format("%" + (3 * ships[0].length - 7) + "s", ""));
        System.out.println();
        System.out.print(" ");
        for(int i=0; i<len; i++){ System.out.print(" " + (char)(65 + i) + " ");}
        System.out.print(" ");
        for(int i=0; i<len; i++){ System.out.print(" " + (char)(65 + i) + " ");}
        System.out.println();
    }

    /**
     * Print ships of line i
     * @param len
     */
    public void printLineShips(int len, int i){
        for(int j=1; j<len; j++){ 
            if(hasShip(i, j)){
                System.out.print(" " + ships[i-1][j-1]+" ");
            }else{
                System.out.print(" . ");
            }
        }    
    }

    /**
     * Print hits of line i
     * @param len
     */
    public void printLineHits(int len, int i){
        for(int j=1; j<len; j++){ 
            if(getHit(i, j) == null){
                System.out.print(" . ");
            }else{
                System.out.print(" " + (getHit(i, j).booleanValue()? ColorUtil.colorize("X", ColorUtil.Color.RED): 
                ColorUtil.colorize("X", ColorUtil.Color.WHITE) )+ " ");
            }
        }
    }

}