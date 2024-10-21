import java.util.*;
public class questionOne{

public static void main (String args[]){

	Scanner scn = new Scanner(System.in);       
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
	int guessNum = (int)(Math.random()*100)+1;
	int iterate = 1;
	boolean isGuessed = false;
	while(!isGuessed){
		
		int temp = scn.nextInt();
		if(temp == guessNum) System.out.println("You guessed it! It took you "+iterate+" tries.");
		else {
			iterate ++;
			if(temp > guessNum) System.out.println("Nope, that guess is too high.");
			else System.out.println("Nope, that guess is too low.");
			System.out.println("Your guess: ");

		}

	}

}
public static void guessNumber(){
	
	






















}


}