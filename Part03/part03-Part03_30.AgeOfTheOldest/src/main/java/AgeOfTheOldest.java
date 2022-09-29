
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentAge = 0;
        int oldestAge = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] arrayStrings = input.split(",");
            currentAge = Integer.valueOf(arrayStrings[1]);

            if (oldestAge < currentAge) {
                oldestAge = currentAge;
            }

        }

        System.out.println("Age of the oldest: " + oldestAge);

    }
}
