public class Main {
    public static void main(String[] args) {
        // Test cases
        System.out.println(MathOperations.mathFunction(1, 2, 3));    // Output: "+"
        System.out.println(MathOperations.mathFunction(2, 2, 4));    // Output: "+*"
        System.out.println(MathOperations.mathFunction(3, -3, -9));  // Output: "*"
        System.out.println(MathOperations.mathFunction(1, 2, -1));   // Output: "-"
        System.out.println(MathOperations.mathFunction(3, 3, 1));    // Output: "/"
        System.out.println(MathOperations.mathFunction(7, 1, 11));   // Output: "None"
    }
}

