package pattern.structural.bridge;

class Circle implements Shape {
    private Renderer renderer;

    public Circle(Renderer renderer) {
        this.renderer = renderer;
    }

    public void draw() {
        System.out.print("Circle: ");
        renderer.renderShape();
    }
}
