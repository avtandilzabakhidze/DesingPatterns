package pattern.creational.factoryMethod;

public class CatAnimalFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
