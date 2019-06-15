import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        String input;
        boolean red_eyes = false;

        do{
            System.out.println("Are your eyes red?");
            input = new Scanner (System.in).nextLine();
            if (input.equalsIgnoreCase("y") ||
                    input.equalsIgnoreCase("yes")){
                System.out.println("Get some sleep!");
                red_eyes = true;
            }
            if (red_eyes == false){

                System.out.println("You look great!");
                System.out.println("Do you want to continue? \nType 'n' to quit.");
                input = new Scanner(System.in).nextLine();
                red_eyes = false;
            }
            if (red_eyes) {
                System.out.println("Do you want to continue? \nType 'n' to quit.");
                input = new Scanner(System.in).nextLine();
                red_eyes = false;
            }
        }while (!input.equalsIgnoreCase("n"));
    }
}
