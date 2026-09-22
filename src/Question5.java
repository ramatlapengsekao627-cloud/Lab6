/*24019362
 * Sekao Ramatlapeng
 * Lab 6 Question 5*/

/*Write two overloaded methods called displayInfo — one that takes just a String name, and one that takes a String name and an
int age, printing an appropriate message for each.*/

public class Question5 {
    // takes just a name
    public static void displayInfo(String name) {
        System.out.println("Name: " + name);
    }

    // takes a name and an age
    public static void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        displayInfo("Sekao");        // calls the 1-parameter version
        displayInfo("Sekao", 21);    // calls the 2-parameter version
    }
}
