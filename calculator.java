 class MathOperations {
    public static void main(String[] args) {
        // Define two numbers
        int num1 = 10;
        int num2 = 5;

        // Perform addition
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Perform subtraction
        int difference = num1 - num2;
        System.out.println("Difference: " + difference);

        // Perform multiplication
        int product = num1 * num2;
        System.out.println("Product: " + product);

        // Perform division
        if (num2 != 0) {
            double quotient = (double) num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}
