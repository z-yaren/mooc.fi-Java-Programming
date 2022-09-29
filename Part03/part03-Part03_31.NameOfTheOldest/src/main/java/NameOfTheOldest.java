
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentAge = 0;
        int oldestAge = 0;
        String name = "";

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] arrayStrings = input.split(",");
            currentAge = Integer.valueOf(arrayStrings[1]);

            if (oldestAge < currentAge) {
                oldestAge = currentAge;
                name = arrayStrings[0];
            }

        }

        System.out.println("Name of the oldest: " + name);

    }
}
