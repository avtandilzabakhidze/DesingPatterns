package pattern.creational.builder;

public class Demo {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.addGarden()
                .addRoom(new Room("Bedroom", 150))
                .addRoom(new Room("Living Room", 250));

        System.out.println(builder);
    }
}
