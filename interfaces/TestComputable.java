public class TestComputable {
    public static void main(String[] args) {
        // Calling printResult method with a lambda expression that adds two numbers
        printResult((x, y) -> x + y);
    }

    // Method to print the result of a Computable operation
    public static void printResult(Computable compIn) {
        // Computing and printing the result of the operation with inputs 10 and 5
        System.out.println(compIn.compute(10, 5));
    }
}
