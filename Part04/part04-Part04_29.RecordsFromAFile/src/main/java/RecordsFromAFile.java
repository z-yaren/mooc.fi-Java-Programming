
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fileName = scanner.nextLine();

        try (Scanner scan = new Scanner(Paths.get(fileName))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                String ageString = "";

                if (age > 1 || age == 0) {
                    ageString = " years";
                } else {
                    ageString = " year";
                }

                System.out.println(name + ", " + "age: " + age + ageString);

            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
