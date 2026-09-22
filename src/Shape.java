
public class Shape {

    // overload #1 - takes one parameter
    public double area(double side) {
        return side * side; // treats it as a square
    }

    // overload #2 - same method name, different parameters
    public double area(double length, double width) {
        return length * width; // treats it as a rectangle
    }

    // generic message, to be overridden by subclass
    public void describe() {
        System.out.println("This is a generic shape");
    }
}
