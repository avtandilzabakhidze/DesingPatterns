package pattern.creational.prototype;

public class Demo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        Shape clonedCircle = circle.clone();
        Shape clonedRectangle = rectangle.clone();

        clonedCircle.draw();
        clonedRectangle.draw();
    }
}