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
        this(name, 10);
    }

    public boolean[][] getHits() {
        return hits;
    }

    public char[][] getShips() {
        return ships;
    }

    public String getName() {
        return name;
    }

    public void setHits(boolean[][] hits) {
        this.hits = hits;
    }

    public void setName(String name) {
        this.name = name;
    }

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