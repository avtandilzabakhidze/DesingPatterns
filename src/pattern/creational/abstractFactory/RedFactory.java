package pattern.creational.abstractFactory;

public class RedFactory implements ColorFactory{
    @Override
    public Color createColor() {
        return new Red();
    }
}
