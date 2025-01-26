package zoo;

public class Koala extends Animal {

    // Constructor to initialize the Koala's name
    public Koala(String name) {
        super(name);
    }

    // Overrides the abstract method to provide the Koala's sound
    @Override
    public void makeSound() {
        System.out.println("Snore");
    }
}
