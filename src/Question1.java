/*24019362
 * Sekao Ramatlapeng
 * Lab 6 Question 1*/

/*Write a program called Question1.java containing a static method isEven(int n) that returns true if n is even and false otherwise.
Call it a few times from main and print the results*/

public class Question1 {
    // returns true if n is even, false otherwise
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(4));  // true
        System.out.println(isEven(7));  // false
        System.out.println(isEven(0));  // true
        System.out.println(isEven(-3)); // false
    }
}
