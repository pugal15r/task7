package handle;

import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        try {
            // Perform division
            int result = num1 / num2;
            // Display the result
            System.out.println("The result of " + num1 + " divided by " + num2 + " is " + result);
        } catch (ArithmeticException e) {
            // Handle the case where num2 is zero
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
