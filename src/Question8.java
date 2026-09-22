/*24019362
 * Sekao Ramatlapeng
 * Lab 6 Question 8*/

/*Write a class called Animal with a method speak() that prints a generic message, and a subclass called Cat that overrides speak()
to print something cat-specific.*/

public class Question8 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak(); // "The animal makes a sound"

        Cat cat = new Cat();
        cat.speak(); // "The cat says Meow"
    }
}
