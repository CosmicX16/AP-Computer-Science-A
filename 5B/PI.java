
/**
 * Write a description of class PI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PI
{

    public static void main(String args[]){
        approxPI();  

        
    }
    public static void approxPI(){
        Fraction a = new Fraction();
        Fraction MILU = new Fraction(355,113);
        final double EPSILON = Math.abs( Math.PI - MILU.toDouble() );
        while(!(Math.abs(Math.PI - a.toDouble()) < EPSILON)){

            if(Math.PI - a.toDouble() > EPSILON){
                a.setNum(a.getNum()+1);
            }
            else {

                a.setDenom(a.getDenom()+1);
                System.out.println(a);
            }

        }
        System.out.println(a);

    }

}
