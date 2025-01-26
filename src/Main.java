// importing the necessary library
import zoo.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create objects for each type of animal
        Animal hyena = new Hyena("Hyena");
        Animal koala = new Koala("Koala");
        Animal sheep = new Sheep("Sheep");

        // Add the animals to a zoo collection
        List<Animal> zoo = new ArrayList<>();
        zoo.add(hyena);
        zoo.add(koala);
        zoo.add(sheep);

        // Pre-defined test cases

        // Normal Test Cases
        System.out.println("Normal Test Cases");
        for (Animal animal : zoo) {
            System.out.println("Animal: " + animal.getName());
            animal.makeSound(); // Make the animal's sound
            animal.makeSound(10); //overloaded method
            System.out.println();
        }

        // Edge Test Cases
        System.out.println("Edge Test Cases");
        hyena.makeSound(2); // Zero times --- no output
        koala.makeSound(1);  // One time
        sheep.makeSound(5);  // Five times
    }
}
