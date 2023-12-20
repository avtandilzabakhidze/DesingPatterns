package pattern.creational.factoryMethod;

public class RandomAnimalFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
