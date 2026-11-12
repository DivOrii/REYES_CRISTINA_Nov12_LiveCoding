
import java.util.Scanner;

public class Reyes_Problem1 {
 public static int sumOfDigits(int number) {

        if (number == 0) {
            return 0;
        }

        return (number % 10) + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Invalid Input, please try again!!");
        } else {
            System.out.println(sumOfDigits(number));
        }

    }

  
}
