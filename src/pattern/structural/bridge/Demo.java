package pattern.structural.bridge;

public class Demo {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer);
        circle.draw();

        Shape square = new Square(rasterRenderer);
        square.draw();
    }
}
