package pattern.creational.prototype;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public Shape clone() {
        return new Rectangle();
    }
}