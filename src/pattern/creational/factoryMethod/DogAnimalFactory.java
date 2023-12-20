package pattern.creational.factoryMethod;

public class DogAnimalFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
