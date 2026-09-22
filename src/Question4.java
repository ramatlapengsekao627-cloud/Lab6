/*24019362
 * Sekao Ramatlapeng
 * Lab 6 Question 4*/

/*Write three overloaded methods called combine — one that takes two int parameters and adds them, one that takes two String
parameters and joins them, and one that takes two double parameters and adds them.*/

public class Question4 {
    // adds two ints
    public static int combine(int a, int b) {
        return a + b;
    }

    // joins two Strings
    public static String combine(String a, String b) {
        return a + b;
    }

    // adds two doubles
    public static double combine(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(combine(3, 5)); // calls int version
        System.out.println(combine("Hello, ", "World")); // calls String version
        System.out.println(combine(2.5, 4.1));// calls double version
    }
}
