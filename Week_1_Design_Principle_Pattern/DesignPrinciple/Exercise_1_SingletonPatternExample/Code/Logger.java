package Week_1_Design_Principle_Pattern.DesignPrinciple.Exercise_1_SingletonPatternExample.Code;

public class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("Logger instance created.");

    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Example method to demonstrate logging
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
