package pattern.creational.builder;


public class Room {
    private final String name;
    private final int area;

    public Room(String name, int area) {
        this.name = name;
        this.area = area;
    }

    @Override
    public String toString() {
        return name + " with an area of " + area + " sq.ft.";
    }
}