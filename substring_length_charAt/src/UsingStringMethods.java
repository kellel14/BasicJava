import java.util.Scanner;

public class UsingStringMethods {

    public static void main(String[] args) {

//        String text = "Hello World!";
//        String another = "Today is going to be a beautiful day!";
//
//        System.out.println("Using .length(): " );
//        System.out.println("The amount of characters in this word is : " + text.length());
//        System.out.println("The amount of characters in this other word is : " + another.length());
//
//        System.out.println("Using .substring(): " );
//        System.out.println("The section of word from index 0-5 is : " + text.substring(0,5));
//        System.out.println("The section of word from index 5-10 is : " + another.substring(5,10));
//
//        System.out.println("Using .charAt(): " );
//        System.out.println("The character at index 1 is : " + text.charAt(1));
//        System.out.println("The character at index 10 is : " + another.charAt(10));
//    }


        int num;
        String word = "";
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a word: ");
        word = keyboard.next();

        System.out.println("Enter a number as an index: ");
        num = keyboard.nextInt();


        System.out.println("The length of alphabet is: " + word.length());
        System.out.println("The substring from 0 to " + num + " is: " + word.substring(0,num));

    }


}