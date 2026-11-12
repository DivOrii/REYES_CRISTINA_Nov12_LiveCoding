import java.util.Scanner;

public class Reyes_Problem3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String line = input.nextLine();

          // Clean the input by removing brackets and spaces
        line = line.replace("{", "").replace("}", "").replace(" ", "");

        // Split the input into separate values
        String[] numbers = line.split(",");

        // Store each converted number in an array
        int[] values = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            values[i] = Integer.parseInt(numbers[i]);
        }

        // Print the sum, highest value, and even number count
        System.out.println();
        System.out.println(arraySum(values, 0) + ", "
                + findMaximum(values, 0) + ", "
                + countEven(values, 0));

        input.close();
    }

      // Gets the total of all numbers in the array
    public static int arraySum(int[] values, int index) {

         // Stop when every array element has been checked
        if (index == values.length) {
            return 0;
        }

        // Add the current value to the sum of the remaining elements
        return values[index] + arraySum(values, index + 1);
    }

    // Method to find the largest element
    public static int findMaximum(int[] values, int index) {

        // Base case
        if (index == values.length - 1) {
            return values[index];
        }

        // Recursive case
        int maximum = findMaximum(values, index + 1);

        if (values[index] > maximum) {
            return values[index];
        } else {
            return maximum;
        }
    }

    // Method to count even elements
    public static int countEven(int[] values, int index) {

        // Base case
        if (index == values.length) {
            return 0;
        }

         // Counts how many even numbers are in the array
        if (values[index] % 2 == 0) {
            return 1 + countEven(values, index + 1);
        } else {
            return countEven(values, index + 1);
        }
    }
}