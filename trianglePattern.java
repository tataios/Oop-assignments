class TrianglePattern {
    public static void main(String[] args) {
        // Define the height of the triangle
        int height = 5; // Change this value to adjust the height of the triangle

        // Outer loop for rows
        for (int i = 1; i <= height; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print asterisk and space
            }
            System.out.println(); // Move to the next line
        }
    }
}