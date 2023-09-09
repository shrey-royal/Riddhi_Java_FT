class Animal {
    Animal giveBirth() {
        System.out.println("Animal giving birth");
        return new Animal();
    }
}

class Dog extends Animal {
    @Override
    Dog giveBirth() {
        System.out.println("Dog giving birth");
        return new Dog();
    }
}

public class CovariantRT {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        // Animal baby = animal.giveBirth();

        // Dog dog = new Dog();
        // Dog puppy = dog.giveBirth();

        Animal animal = new Dog();
        Animal baby = animal.giveBirth();
        System.out.println(baby);
    }
}
