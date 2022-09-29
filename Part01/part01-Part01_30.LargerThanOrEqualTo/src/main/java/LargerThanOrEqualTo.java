
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scan.nextLine());

        System.out.println("Give the second number:");
        int secondtNum = Integer.valueOf(scan.nextLine());

        if (firstNum == secondtNum) {
            System.out.println("The numbers are equal!");
        } else if (firstNum > secondtNum) {
            System.out.println("Greater number is: " + firstNum);
        } else {
            System.out.println("Greater number is: " + secondtNum);
        }

    }
}
