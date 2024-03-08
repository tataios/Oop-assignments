import java.util.Scanner;

 class MinutesToSeconds {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of minutes
        System.out.print("Enter the number of minutes: ");

        // Read the input as an integer
        int minutes = scanner.nextInt();

        // Close the Scanner object
        scanner.close();

        // Convert minutes to seconds
        int seconds = minutes * 60;

        // Display the result
        System.out.println(minutes + " minutes is equal to " + seconds + " seconds.");
    }
}