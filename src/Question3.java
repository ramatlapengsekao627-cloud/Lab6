/*24019362
 * Sekao Ramatlapeng
 * Lab 6 Question 3*/

/*Write a void method called printBanner() that prints a decorative line of text, and a separate method called getBanner() that
returns the same line as a String instead of printing it*/

public class Question3 {
    // prints a decorative line directly
    public static void printBanner() {
        System.out.println("HALLOOO");
    }

    // returns the same line as a String instead of printing it
    public static String getBanner() {
        return "HALLOOOO";
    }

    public static void main(String[] args) {
        printBanner(); // prints directly

        String banner = getBanner(); // stores the returned String
        System.out.println(banner);  // print it ourselves
    }
}
