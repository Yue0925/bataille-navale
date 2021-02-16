package ensta.utils;

public enum ShipsType{
    DESTROYER ("Destroyer", 'D', 2),
    SUBMARINE("Submarine", 'S', 3),
    BATTLESHIP("BattleShip", 'B', 4),
    AIRCRAFTCARRIER("Carrier", 'C', 5);

    /**
     * Attributs
     */
    private String fullName;
    private char label;
    private int size;

    /**
     * Constructor
     * @param fullName
     * @param label
     * @param size
     */
    ShipsType(String fullName, char label, int size){
        this.fullName = fullName;
        this.label = label;
        this.size = size;
    }

    /**
     * Les getters
     */
    public int getSize() {
        return size;
    }
    public String getFullName() {
        return fullName;
    }
    public char getLabel() {
        return label;
    }
}