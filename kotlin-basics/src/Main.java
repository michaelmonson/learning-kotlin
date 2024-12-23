import java.util.logging.Logger;

public class Main {

    Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        //NOTE:  Standard outputs should not be used directly to log anything
//        System.out.println("Hello, World!");

        logger.info("Hello World");  // Compliant, output via logger
    }
}