
public class SingletonTest {
    public static void main(String[] args) {
        // Get first instance
        Logger logger1 = Logger.getInstance();
        logger1.log("First log message.");

        // Get second instance
        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message.");

        // Check if both references point to the same object
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("Different instances! Singleton failed.");
        }
    }
}
