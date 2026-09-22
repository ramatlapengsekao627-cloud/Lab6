/*24019362
 * Sekao Ramatlapeng
 * Lab 6 Question 6*/

/*Write a class called Calculator with a static method add(int a, int b), and an instance method multiply(int a, int b) that uses a
private instance field called callCount, incremented every time multiply() is called.*/

public class Calculator {
    private int callCount = 0; // tracks how many times multiply() has been called

    // static method - called on the class itself, doesn't need an object
    public static int add(int a, int b) {
        return a + b;
    }

    // instance method - needs an object, since it uses an instance field
    public int multiply(int a, int b) {
        callCount++; // increase count every time this method runs
        return a * b;
    }

    // getter to check how many times multiply() was called
    public int getCallCount() {
        return callCount;
    }
}
