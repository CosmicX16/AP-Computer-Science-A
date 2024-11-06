import java.util.*;

public class q1
{
    public static void main(String[] args)
    {
        
        
        sampleMethod();
    }
    public static void sampleMethod()
    {
        Scanner scn = new Scanner(System.in);
        int guess = 0;
        int count = 0;
        int val = (int)(Math.random()*100)+1;
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        while(guess != val){
        count++;
        System.out.println("Your guess: ");
        guess = scn.nextInt();
        if(guess == val) System.out.println("You guessed it! It took you "+ count+" tries!");
        else if(guess > val) System.out.println("Nope, that guess is too high.");
        else System.out.println("Nope, that guess is too low.");
        }   
    }
}
