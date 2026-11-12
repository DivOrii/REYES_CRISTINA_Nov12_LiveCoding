import java.util.Scanner;

public class Reyes_Problem2 {

    // Method to calculate the Greatest Common Divisor using recursion
    public static int calculatedGCD(int firstInputNumber, int secondInputNumber) {

        // Base case: return the first number when the second number is zero
        if (secondInputNumber == 0) {
            return firstInputNumber;
        }

        // Recursive case: repeat using the remainder
        return calculatedGCD(secondInputNumber, firstInputNumber % secondInputNumber);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read numbers separated by non-numeric characters
        input.useDelimiter("[^0-9-]");

        int firstInputNumber = input.nextInt();
        int secondInputNumber = input.nextInt();

        // Check if both numbers are zero
        if (firstInputNumber == 0 && secondInputNumber == 0) {
            System.out.println("Undefied");
        } else {
            // Display the calculated GCD
            System.out.println(calculatedGCD(firstInputNumber, secondInputNumber));
        }

        input.close();
    }
}
