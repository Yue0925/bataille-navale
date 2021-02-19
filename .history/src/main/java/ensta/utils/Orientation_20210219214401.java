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

    /**
     * Constructor
     * @param sign
     */
    Orientation(String sign){
        this.sign = sign;
    }

    /**
     * Get the symbol of Orientation
     * @return
     */
    public String getSign() {
        return sign;
    }

    /**
     * 
     * @param sign
     * @return
     */
    public static Orientation matchOrientation(String sign){
        for(Orientation o: Orientation.values()){
            if(o.getSign().equals(sign))
                return o;
        }
        return null;
    }
}