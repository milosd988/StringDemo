import java.util.Scanner;

public class ReadUserInputWithString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your favorite color? ");
        String theColor = scanner.nextLine();

        System.out.print("What is your hobby? ");
        String theHobby = scanner.nextLine();

        System.out.println("Your favorite color is: " + theColor);
        System.out.println("Your hobby is: " + theHobby);

        scanner.close();


    }
}
