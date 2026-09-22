/*24019362
 * Sekao Ramatlapeng
 * Lab 6 Question 2*/

/*Write a static method called circleArea(double radius) that returns the area of a circle with that radius, then call it from main
with at least two different values.*/

public class Question2 {
    // returns the area of a circle with the given radius
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println(circleArea(5));   // area with radius 5
        System.out.println(circleArea(2.5)); // area with radius 2.5
    }
}
