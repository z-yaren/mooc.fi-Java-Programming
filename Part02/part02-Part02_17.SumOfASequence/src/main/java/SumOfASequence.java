
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Last number?");

        int number = Integer.valueOf(scanner.nextLine());

        System.out.println("The sum is " + (number * (number + 1) /2));
    }
}
