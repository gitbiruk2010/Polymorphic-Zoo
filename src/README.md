# Polymorphic Zoo

## Description
The **Polymorphic Zoo** is a Java program that demonstrates the concept of polymorphism and method overloading using a zoo scenario. This program features animals that can make unique sounds and repeat their sounds a specified number of times. The main goal is to showcase how polymorphism allows us to invoke methods on objects of different classes through a shared base class.

## Features
- **Polymorphism**: The program uses an abstract `Animal` class and derived classes (`Hyena`, `Koala`, `Sheep`) to demonstrate method overriding.
- **Method Overloading**: Implements an overloaded version of the `makeSound` method to repeat an animal's sound multiple times.
- **Edge Case Handling**: Tests unusual inputs like zero or very high repetitions.

## How to Run
1. Clone or download the project to your local machine.
2. Open the project in your favorite Java IDE (e.g., IntelliJ IDEA).
3. Ensure the folder structure matches the one specified above.
4. Compile and run `Main.java`.

## Example Output
```
--- Normal Test Cases ---
Animal: Hyena
Laugh


Animal: Koala
Snore


Animal: Sheep
Baaaaa


--- Edge Test Cases ---
Snore
Baaaaa
Baaaaa
Baaaaa
Baaaaa
Baaaaa

Process finished with exit code 0
```

## How It Works
### Abstract Class: `Animal`
- The `Animal` class defines:
    - An abstract method `makeSound()` to enforce implementation of a unique sound for each animal.
    - An overloaded `makeSound(int times)` method to repeat the sound multiple times.
    - A `getName()` method to retrieve the animal's name.

### Derived Classes
1. **Hyena**:
    - **Sound**: "Laugh"
2. **Koala**:
    - **Sound**: "Snore"
3. **Sheep**:
    - **Sound**: "Baaa"

Each class overrides the `makeSound()` method to provide a unique implementation for the animal's sound.

## Requirements
- **Java Version**: JDK 8 or later.
- **IDE**: IntelliJ IDEA or any other Java IDE.
