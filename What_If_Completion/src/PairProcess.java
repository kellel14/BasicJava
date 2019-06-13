import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {

        String cont;
        int num1, num2, sum, avg;
        do {


            Scanner keyboard = new Scanner(System.in);

            System.out.print("First number? : ");

            num1 = keyboard.nextInt();

            System.out.print("Second number? : ");

            num2 = keyboard.nextInt();

            sum = num1 + num2;

//            System.out.println( sum );

            avg = sum / 2;

            if (sum > 200) {
                System.out.println("*" + sum);
//                if (sum < 1000) {
//                    System.out.println("~" + sum);
//                }
//
            }
            System.out.println("The average is " + avg);

            System.out.println("Do you want to enter another number (Y/N)?");
            cont = keyboard.next();

        }while (cont.equalsIgnoreCase("Y")) ;

    }
}