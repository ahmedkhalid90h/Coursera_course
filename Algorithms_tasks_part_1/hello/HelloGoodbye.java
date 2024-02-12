/* 
 * print Hello your two name
 * print Goodbye your two name
 * run file  -> javac fileName
 * run file excuted  -> java file created
 */

public class HelloGoodbye {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two names as arguments.");
            return;
        }
        System.out.println("Hello " + args[0] + " and " + args[1] + ".");
        System.out.println("Goodbye " + args[0] + " and " + args[1] + ".");
    }
}
