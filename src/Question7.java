/*24019362
 * Sekao Ramatlapeng
 * Lab 6 Question 7*/


public class Question7 {
    // doubles the parameter inside the method
    public static void tryToDouble(int number) {
        number = number * 2; // only changes the local copy
        System.out.println("Inside method: " + number);
    }

    public static void main(String[] args) {
        int myNumber = 10;

        tryToDouble(myNumber); // pass the value of myNumber

        System.out.println("Outside method: " + myNumber); // still 10!
    }
}
