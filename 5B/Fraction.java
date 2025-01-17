import java.util.*;

public class Fraction
{
    // instance variables - replace the example below with your own
    private int num;
    private int denom;

    /**
     * Constructor for objects of class Fraction
     */
    public Fraction()
    {
        num = (int)(Math.random()*9 +1);
        denom = (int)(Math.random()*9 +1);
        if(denom == num) denom = (int)(Math.random()*9 +1);
    }
    public Fraction(int n, int d){
        num = n;
        if(d == 0) System.out.println("Error: denominator cannot be 0");
        else{
        denom = d;
        }
        
    }
    public Fraction(String s){
        String[] split = s.split("/");
        num = Integer.parseInt(split[0]);
        denom = Integer.parseInt(split[1]);
        if(denom == 0){
            System.out.println("Error: denominator cannot be 0");
            denom = 1;
        }
        

    }
    public Fraction(Fraction f){
        num = f.getNum();
        denom = f.getDenom();
        
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getNum()
    {
        return num;
    }
    public int getDenom(){
        return denom;
    }
    public String toString(){
        return num+"/"+denom;
    }
    public double toDouble(){
        return (double) num/denom;
        
    }
    public void setNum(int n){
        this.num = n;
    }
    public void setDenom(int n){
        this.denom = n;
    }
    
    
    public void reduce(){
        while(true){
            num = num/gcf();
            denom = denom/gcf();
            if(gcf() ==1 ) break;
        }
    }
    private int gcf(){
        int a = getNum();
        int b = getDenom();
        int c = -1;
        while(true){
            if(a==b) return b;
            if(a>b) a = a-b;
            else b = b-a;
        }
        
    }
    
    public Fraction multiply(Fraction f2){
        Fraction newF = new Fraction(getNum()*f2.getNum(), getDenom()*f2.getDenom());
        return newF;
    }
    public Fraction divide(Fraction f2){
        return new Fraction(getNum()*f2.getDenom(),f2.getNum()*getDenom());
    }
    public Fraction add(Fraction f1, Fraction f2){
        int num1 = f1.getNum()*f2.getDenom() + f2.getNum()*f1.getDenom();
        int num2 = f1.getDenom()*f2.getDenom();
        return new Fraction(num1,num2);
    }
    public Fraction subtract(Fraction f2){
        int num1 = getNum()*f2.getDenom() - f2.getNum()*getDenom();
        int num2 = getDenom()*f2.getDenom();
        //System.out.println(num1+" "+num2);
        Fraction f = new Fraction(num1,num2);
        f.reduce();
        return f;
    }
}
