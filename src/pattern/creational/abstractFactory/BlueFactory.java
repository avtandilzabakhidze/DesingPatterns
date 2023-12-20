package pattern.creational.abstractFactory;

public class BlueFactory implements ColorFactory{
    @Override
    public Color createColor() {
        return new Blue();
    }
}
