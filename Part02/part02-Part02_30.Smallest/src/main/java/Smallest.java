
public class Smallest {

    public static int smallest(int number1, int number2) {

        while (true){
            if (number1 > number2){
                return number2;
            } else {
                return number1;
            }
        }
        
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}

