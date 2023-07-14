//WAP using switch case which will display the option of all operators
package assignment;
import java.util.Scanner;
public class switchcase {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an operator:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulo (%)");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (choice) {
        case 1:
            // Addition operation
            result = num1 + num2;
            System.out.println("Addition Result: " + result);
            break;
        case 2:
            // Subtraction operation
            result = num1 - num2;
            System.out.println("Subtraction Result: " + result);
            break;
        case 3:
            // Multiplication operation
            result = num1 * num2;
            System.out.println("Multiplication Result: " + result);
            break;
        case 4:
            // Division operation
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Division Result: " + result);
            } else {
                System.out.println("Cannot divide by zero!");
            }
            break;
        case 5:
            // Modulo operation
            result = num1 % num2;
            System.out.println("Modulo Result: " + result);
            break;
        default:
            // Invalid choice
            System.out.println("Invalid choice!");
            break;
    }


        scanner.close();
    }
}
