import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        while (true) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your grade: ");
            int score = scanner.nextInt();
            scanner.nextLine();
            char grade ='X';

            if (score <= 100) {
                switch (score / 10) {
                    case 10:
                    case 9:
                        grade = 'A';
                        break;
                    case 8:
                        grade = 'B';
                        break;
                    case 7:
                        grade = 'C';
                        break;
                    case 6:
                        grade = 'D';
                        break;

                    default:
                        grade = 'F';
                        break;
                }
            }
            System.out.println("Your grade for score " + score + " is " + grade );
        }
    }
}