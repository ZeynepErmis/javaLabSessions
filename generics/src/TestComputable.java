// This class demonstrates the usage of the Computable interface with a lambda expression.
public class TestComputable {
    // Main method, entry point of the program
    public static void main(String[] args) {
        // Invoking printResult method with a lambda expression that computes the sum of two integers
        printResult((x, y) -> x + y);
    }
    
    
    // Method to print the result of the computable operation
    public static void printResult(Computable<Integer> compIn) {
        // Computing and printing the result of the operation with inputs 3 and 4
        System.out.println(compIn.compute(3, 4));
    }
}
