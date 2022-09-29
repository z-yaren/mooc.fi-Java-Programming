
import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while(true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                break;
            } else {
                count++;
            }
        }
        System.out.println("Number of numbers: " + count);
    }
}
