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
        int len = ships.length +1;

        System.out.println("Navires:");
        System.out.print(" ");
        for(int i=1; i<len; i++){ System.out.print(" " + i + " ");}
        System.out.println();
        for(int i=1; i<len; i++){
            System.out.print(i);
            for(int j=1; j<len; j++){ 
                if(ships[i-1][j-1] == ""){
                    System.out.print(" " + ships[i-1][j-1]+" ");
                }else{
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }
}