import java.util.*;
public class Driver
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringTools sTools = new StringTools();

        System.out.println("lastLetter test cases:");
        System.out.println("Enter a word with at least one character: ");
        String answer1 = input.nextLine();
        System.out.println("The last letter is " + sTools.lastLetter(answer1));
        System.out.println("---------------------");
        System.out.println("formatPhoneNumber test cases:");
        System.out.println("Enter a 10-digit String of numbers: ");
        String answer2 = input.nextLine();
        System.out.println("The formatted number is " + sTools.formatPhoneNumber(answer2));
        System.out.println("---------------------");
        System.out.println("middleThree test cases:");
        System.out.println("Enter a String at least 3 characters long, and the length is an odd number: ");
        String answer3 = input.nextLine();
        System.out.println("The middle 3 characters are " + sTools.middleThree(answer3));
        System.out.println("---------------------");
        System.out.println("swapLastTwo test cases:");
        System.out.println("Enter a String at least 2 characters long: ");
        String answer4 = input.nextLine();
        System.out.println("The new String is " + sTools.swapLastTwo(answer4));
        System.out.println("---------------------");
        System.out.println("frontAgain test cases:");

        System.out.println("Enter a String at least n characters long: ");
        String answer5 = input.nextLine();
        System.out.println("Enter an int n: ");
        int n = input.nextInt();
        System.out.println("First n letters and last n letters returns as " + sTools.frontAgain(answer5,n));
        System.out.println("---------------------");
    }
}


