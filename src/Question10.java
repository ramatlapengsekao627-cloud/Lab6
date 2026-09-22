/*24019362
 * Sekao Ramatlapeng
 * Lab 6 Question 10*/

/*Write a class called Rectangle with static methods area(double length, double width) and perimeter(double length, double
width). Write a main method that reads a length and width from the user and prints both results*/

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // ask the user for the length
        System.out.print("Enter length: ");
        double length = keyboard.nextDouble();

        // ask the user for the width
        System.out.print("Enter width: ");
        double width = keyboard.nextDouble();

        // call the static methods on Rectangle and print the results
        System.out.println("Area: " + Rectangle.area(length, width));
        System.out.println("Perimeter: " + Rectangle.perimeter(length, width));
    }
}
