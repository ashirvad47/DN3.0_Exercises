
public class LoggerTest {
    public static void main(String[] args) {
        // Get the instance of the Logger class
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Verify that both logger1 and logger2 refer to the same instance
        System.out.println("logger1 == logger2: " + (logger1 == logger2));

        // Test logging functionality
        logger1.log("This is a log message");
        logger2.log("This is another log message");
    }
}
