import java.util.function.Predicate;

// This class demonstrates the usage of Java Predicate functional interface
public class TestComputableVersion3 {
    // Main method, entry point of the program
    public static void main(String[] args) {
        // Invoking printResult method with a lambda expression
        printResult(x -> x.equals("Hello world"));
    }
    
    // Method to print the result of the predicate test
    public static void printResult(Predicate<String> compIn) { 
        // Testing the Predicate with a string and printing the result
        System.out.println(compIn.test("Hello universe"));
    }
}
