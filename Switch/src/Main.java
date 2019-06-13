import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String months;

        do {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter the number of days in a month to display the months.");


            int num;
            num = keyboard.nextInt();



            switch (num) {
                case 31:
                    months = "January, March, May, July, August, October, December";
                    break;
                case 30:
                    months = "September, April, June, November";
                    break;
                case 29:
                    months = "February: if it is a leap year.";
                    break;
                case 28:
                    months = "February";
                    break;
                default:
                    months = num + " Is invalid." + " Enter a valid number of days in a months.";
                    break;
            }
            System.out.println(months);

            System.out.println("Do you want to enter another number (Y/N)?");
            months = keyboard.next();
        }while (months.equalsIgnoreCase("Y"));

    }


}
