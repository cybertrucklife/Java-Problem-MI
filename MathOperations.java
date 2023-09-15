public class MathOperations {
    public static String mathFunction(int Number1, int Number2, int Number3) {
        // Check if addition (+) makes the statement true
        if (Number1 + Number2 == Number3) {
            return "+";
        }

        // Check if subtraction (-) makes the statement true
        if (Number1 - Number2 == Number3) {
            return "-";
        }

        // Check if multiplication (*) makes the statement true
        if (Number1 * Number2 == Number3) {
            return "*";
        }

        // Check if division (/) makes the statement true, and Number2 is not 0
        if (Number2 != 0 && Number1 / Number2 == Number3) {
            return "/";
        }

        // If none of the above conditions are met, return "None"
        return "None";
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(mathFunction(1, 2, 3));    // Output: "+"
        System.out.println(mathFunction(2, 2, 4));    // Output: "+*"
        System.out.println(mathFunction(3, -3, -9));  // Output: "*"
        System.out.println(mathFunction(1, 2, -1));   // Output: "-"
        System.out.println(mathFunction(3, 3, 1));    // Output: "/"
        System.out.println(mathFunction(7, 1, 11));   // Output: "None"
    }
}
