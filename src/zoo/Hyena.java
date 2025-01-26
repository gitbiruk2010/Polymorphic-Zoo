package zoo;

public class Hyena extends Animal {

    // Constructor to initialize the Hyena's name
    public Hyena(String name) {
        super(name);
    }

    // Overrides the abstract method
    @Override
    public void makeSound() {
        System.out.println("Laugh");
    }
}
