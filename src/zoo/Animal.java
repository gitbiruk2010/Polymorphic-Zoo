// package for the zoo
package zoo;

public abstract class Animal {
    protected String name; // Name of the animal

    // Constructor to initialize the name
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method by subclasses
    public abstract void makeSound();

    // Overloaded method to repeat the sound multiple times
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            makeSound();
        }
    }

    // Getter method to retrieve the name of the animal
    public String getName() {
        return name;
    }
}
