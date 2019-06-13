import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String choice;
        int examScore;

        do {

            System.out.println("Please enter your exam score");
            examScore = scanner.nextInt();

            if (examScore >= 97 ) {
                System.out.println("Great job! Your grade is A+ ");
            } else if (examScore >= 94 && examScore <= 96) {
                System.out.println("Great job! Your grade is A ");
            } else if (examScore >= 90 && examScore <= 93) {
                System.out.println("Great job! Your grade is A- ");
            } else if (examScore >= 87 && examScore <= 89) {
                System.out.println("Good job! Your grade is B+ ");
            } else if (examScore >= 84 && examScore <= 86) {
                System.out.println("Good job! Your grade is B ");
            } else if (examScore >= 80 && examScore <= 83) {
                System.out.println("Good job. Your grade is B- ");
            } else if (examScore >= 77 && examScore <= 79) {
                System.out.println("Your grade is C+ ");
            } else if (examScore >= 74 && examScore <= 76) {
                System.out.println("Your grade is C ");
            } else if (examScore >= 70 && examScore <= 73) {
                System.out.println("Your grade is C- ");
            } else if (examScore >= 60 && examScore <= 69) {
                System.out.println("Your grade is D ");
            } else if (examScore < 60) {
                System.out.println("Go back to school, study harder, try again next time.");
            }

            System.out.println("Do you want to enter another score (Y/N)?");
            choice = scanner.next();


        } while (choice.equalsIgnoreCase("Y"));

    }
}