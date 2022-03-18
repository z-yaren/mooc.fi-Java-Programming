
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (counter == 0 && number <= 0) {
                System.out.println("Cannot calculate the average");
            }

            if (number == 0) {
                break;
            }

            if (counter >= 0 && number > 0) {
                counter = counter + 1;
                sum = sum + number;
            }
        }

        double average = (sum * 1.0) / counter;
        System.out.println("Average of the numbers: " + average);


    }
}