package pattern.structural.bridge;

class Square implements Shape {
    private Renderer renderer;

    public Square(Renderer renderer) {
        this.renderer = renderer;
    }

    public void draw() {
        System.out.print("Square: ");
        renderer.renderShape();
    }
}
