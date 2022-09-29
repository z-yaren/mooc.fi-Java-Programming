
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.valueOf(scanner.nextLine());
        int secondtNum = Integer.valueOf(scanner.nextLine());

        if (firstNum > secondtNum) {
            System.out.println(firstNum + " is greater than " + secondtNum);
        } else if (firstNum < secondtNum) {
            System.out.println(firstNum + " is smaller than " + secondtNum);
        } else {
            System.out.println(firstNum + " is equal to " + secondtNum);
        }

    }
}
