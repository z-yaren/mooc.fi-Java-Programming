
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give the first number:");
        int numberOne = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int numberTwo = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        int numberThree = Integer.valueOf(scanner.nextLine());

        double calcAverage = 1.0 * (numberOne + numberTwo + numberThree) /3;

        System.out.println("The average is " + calcAverage);

    }
}
