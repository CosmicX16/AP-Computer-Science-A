import java.util.*;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private int x;

    public static void main(String args[]){
        fractionGame();

        
    }

    public static void fractionGame(){
        Scanner s = new Scanner(System.in);
        int counter = 0;
        int losses = 0;
        int wins = 0;
        boolean quit = false;
        while(true){
            Fraction a = new Fraction();
            Fraction b = new Fraction();
            if(a.toDouble() < b.toDouble()){
                Fraction temp = new Fraction(a);
                a = b;
                b = temp;
            }
            Fraction product = a.subtract(b);
            product.reduce();
            System.out.println(a +" - "+ b + " = ");
            String in = s.nextLine();
            if(in.equals("quit")) break;
            Fraction guess = new Fraction(in);
            if(!equalsTo(product,guess)){
                losses++;
                System.out.println("Wrong, answer is "+product);
            }else{
                wins++;
                System.out.println("Correct");
            }
        }
        System.out.println("You had "+wins+" wins and "+losses+" losses, and total accuracy was "+ (int)((new Fraction(wins,losses+wins)).toDouble()*100) +" percent!");
    }
    static private boolean equalsTo(Fraction f1, Fraction f2){
        return (f1.getNum() == f2.getNum() && f1.getDenom() == f2.getDenom());
    }
}
