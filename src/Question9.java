/*24019362
 * Sekao Ramatlapeng
 * Lab 6 Question 9*/

/*In one program, demonstrate both concepts: include two overloaded methods with the same name in one class, and a method
overridden in a subclass of that class*/

public class Question9 {
    public static void main(String[] args) {

        Shape shape = new Shape();

        // OVERLOADING: same method name "area", different parameters
        System.out.println(shape.area(4));       // square version
        System.out.println(shape.area(5, 3));     // rectangle version

        // OVERRIDING: subclass changes the inherited method's behavior
        shape.describe();        // "This is a generic shape"

        Circle circle = new Circle();
        circle.describe();       // "This is a circle" (overridden version)
    }
}
