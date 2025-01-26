package zoo;

public class Sheep extends Animal {

    // Constructor to initialize the Sheep's name
    public Sheep(String name) {
        super(name);
    }

    // Overrides the abstract method
    @Override
    public void makeSound() {
        System.out.println("Baa");
    }
}
