package ensta;

/**
 * Board
 */

public class Board {
    /**
     * Attributs
     */
    private String name;
    private char ships [][];
    private boolean hits [][];

    /**
     * Constructor
     * @param name
     * @param size
     */
    Board(String name, int size){
        this.name = name;
        ships = new char[size][size];
        hits = new boolean[size][size];
    }
    
    /**
     * Constructor
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
     * @param hits
     */
    public void setHits(boolean[][] hits) {
        this.hits = hits;
    }

    
    /** 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    
    /** 
     * @param ships
     */
    public void setShips(char[][] ships) {
        this.ships = ships;
    }

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