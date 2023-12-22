package pattern.structural.bridge;

class RasterRenderer implements Renderer {
    public void renderShape() {
        System.out.println("Rendering shape in Raster");
    }
}