package Week05.Animals;

class AnimalFactory {
    public Animals createAnimals(String type) {
        Animals animal = null;

        if(type.equals("Dog")) {
            animal = new Dog();
        } else if (type.equals("Cat")) {
            animal = new Cat();
        }
        return animal;
    }
}

abstract class AnimalLand {
//    AnimalFactory factory;
//
//    public AnimalLand(AnimalFactory factory) {
//        this.factory = factory;
//    }

    Animals orderAnimal(String type) {
        Animals animal;

        animal = createAnimals(type);

        animal.speak();

        return animal;
    }

    abstract Animals createAnimals(String type);
}

class SeoulAnimalLand extends AnimalLand{
    @Override
    Animals createAnimals(String type) {
        if(type.equals("Dog")) {
            return new SeoulDog();
        } else if (type.equals("Cat")) {
            return new Cat();
        } return null;
    }
}

public class Main {
    public static void main(String[] args) {
        AnimalLand seoulAnimalLand = new SeoulAnimalLand();
        seoulAnimalLand.orderAnimal("Dog");
    }
}
