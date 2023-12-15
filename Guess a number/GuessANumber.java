import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random randomNumber = new Random();
        int computerNumber = randomNumber.nextInt(100);
        System.out.println("Try to guess a number: ");

        while (true) {
            String input = scanner.nextLine();
            boolean isValid = false;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) >= 48 && input.charAt(i) <= 57)
                    isValid = true;
                else {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                int number = Integer.parseInt(input);
                if (number == computerNumber) {
                    System.out.println("Congratulation! You guessed a number!");
                    break;
                }
                //        else if (number < computerNumber) {
                //           System.out.println("The number is too low. Try again: ");
                //       } else System.out.println("The number is too high. Try again: ");


                else if (number > computerNumber + 10 || number < computerNumber - 10) {
                    System.out.println("It is COLD");
                } else System.out.println("It is HOT");

            } else System.out.println("This is wrong input. Try again: ");

        }
    }
}