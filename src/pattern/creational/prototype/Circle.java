package pattern.creational.prototype;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public Shape clone() {
       return new Circle();
    }
}