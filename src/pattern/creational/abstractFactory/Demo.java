package pattern.creational.abstractFactory;

public class Demo {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();

        ColorFactory redFactory = new RedFactory();
        Color red = redFactory.createColor();
    }
}
