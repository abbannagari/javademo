public class factorial {

    public static void main(String[] args) {
        int number = 5; // Change this number to calculate factorial of a different number

        // Iterative approach
        long iterativeResult = calculateFactorialIterative(number);
        System.out.println("Factorial of " + number + " (iterative) is: " + iterativeResult);

        // Recursive approach
        long recursiveResult = calculateFactorialRecursive(number);
        System.out.println("Factorial of " + number + " (recursive) is: " + recursiveResult);
    }

    // Iterative method to calculate factorial
    public static long calculateFactorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive method to calculate factorial
    public static long calculateFactorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        if (n == 0) {
            return 1; // Base case: 0! = 1
        } else {
            return n * calculateFactorialRecursive(n - 1); // Recursive case
        }
    }
}
