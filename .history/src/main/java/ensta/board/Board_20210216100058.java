package ensta.board;

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
     * @return boolean[][]
     */
    public boolean[][] getHits() {
        return hits;
    }

    
    /** 
     * @return char[][]
     */
    public char[][] getShips() {
        return ships;
    }

    
    /** 
     * @return String
     */
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
                if(ships[i-1][j-1] != '\0'){
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
                if(hits[i-1][j-1] == true){
                    System.out.print(" x ");
                }else{
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }


}