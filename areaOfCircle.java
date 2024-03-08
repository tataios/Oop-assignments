import java.util.Scanner;

 class CircleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Use Math.PI constant for accurate value
        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle is: " + area);
    }
}