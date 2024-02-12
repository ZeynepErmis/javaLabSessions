import java.util.function.Predicate;

// This class demonstrates the usage of Java Predicate functional interface with Integer type
public class TestComputableVersion2 {
    // Main method, entry point of the program
    public static void main(String[] args) {
        // Invoking printResult method with a lambda expression testing whether x is greater than 5
        printResult(x -> x > 5);
    }
    
    // Method to print the result of the predicate test
    public static void printResult(Predicate<Integer> compIn) { 
        // Testing the Predicate with integer 7 and printing the result
        System.out.println(compIn.test(7));
    }
}
