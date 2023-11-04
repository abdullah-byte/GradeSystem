import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Please enter your grade: ");
        int grade = scanner.nextInt();

        if (grade >= 90 && grade <= 100){
            System.out.println("Your grade for " + grade +" is A");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("Your grade for "+ grade + " is B");
        }else if (grade >= 70 && grade < 80){
            System.out.println("Your grade for "+ grade + " is C");
        }else if (grade >= 60 && grade < 70){
            System.out.println("Your grade for "+ grade + " is D");
        }else if (grade >= 0 && grade < 60){
            System.out.println("Your grade for "+ grade + " is F");
        }else {
            System.out.println("Invalid input");
        }


    }
}