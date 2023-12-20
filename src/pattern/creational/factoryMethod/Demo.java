package pattern.creational.factoryMethod;

public class Demo {
    public static void main(String[] args) {
        CatAnimalFactory catAnimalFactory = new CatAnimalFactory();
        Animal animal = catAnimalFactory.createAnimal();
        animal.Name();

        DogAnimalFactory dogAnimalFactory = new DogAnimalFactory();
        Animal animal1 = dogAnimalFactory.createAnimal();
        animal1.Name();
    }
}
