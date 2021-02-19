package ensta.utils;

public enum Orientation{
    NORTH("n"), 
    SOUTH("s"), 
    EAST("e"), 
    WEST("w");

    /**
     * Attributs
     */
    private String sign;

    Orientation(String sign){
        this.sign = sign;
    }
}