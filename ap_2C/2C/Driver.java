import java.util.*;
public class Driver
{
   public static void main (String[] args) {
       Scanner scn = new Scanner(System.in);
       //OrderedPair tests
       OrderedPair x1y1 = new OrderedPair();
       OrderedPair x2y2 = new OrderedPair(2,4);


       System.out.println("default constructor object toString(): "+x1y1.toString());
       System.out.println("specified constructor object toString(): "+x2y2.toString());
       System.out.println("default constructor getX() and getY(): "+ x1y1.getX()+" and " +x1y1.getY());
       System.out.println("specified constructor object getX() and getY(): "+x2y2.getX()+" and "+x2y2.getY());
       //Formulas test
       Formulas form1 = new Formulas();
       System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b and c:\na:");
       double a = scn.nextDouble();
       System.out.println("b:");
       double b = scn.nextDouble();
       System.out.println("c:");
       double c = scn.nextDouble();
       System.out.println("The solutions for "+a+"x^2 + "+b+" + "+c+"1 are "+ form1.findQuadraticRoots(a,b,c).toString());
       System.out.println("SLOPE FORMULA: Find the slope between points (x1,y1) and (x2,y2)\nx1:");
       double x1 = scn.nextDouble();
       System.out.println("y1:");
       double y1 = scn.nextDouble();
       System.out.println("x2:");
       double x2 = scn.nextDouble();
       System.out.println("y2:");
       double y2 = scn.nextDouble();
       OrderedPair xy1 = new OrderedPair(x1,y1);
       OrderedPair xy2 = new OrderedPair(x2,y2);
       System.out.println("A line between "+xy1.toString()+" and "+xy2.toString()+" has a slope of "+form1.findSlope(xy1,xy2));
       System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2)\nx1:");
       x1 = scn.nextDouble();
       System.out.println("y1:");
       y1 = scn.nextDouble();
       System.out.println("x2:");
       x2 = scn.nextDouble();
       System.out.println("y2:");
       y2 = scn.nextDouble();
       xy1 = new OrderedPair(x1,y1);
       xy2 = new OrderedPair(x2,y2);
       System.out.println("The midpoint between "+xy1.toString()+" and "+xy2.toString()+" is "+form1.findMidpoint(xy1,xy2));
       System.out.println("SUM OF AN ARITHMETIC SERIES\nNumber of terms:");
       int k  = scn.nextInt();
       System.out.println("Starts with:");
       x1 = scn.nextDouble();
       System.out.println("Increases by:");
       double d = scn.nextDouble();
       System.out.println("The sum of the first "+ x1+" terms of an arithmetic series that starts with "+x1+" and increases by "+d+" is "+form1.findArithmeticSeriesSum(x1,d,k));
       System.out.println("SUM OF A GEOMETRIC SERIES\n" + "Number of terms: ");
       k = scn.nextInt();
       System.out.println("Starts with:");
       x1 = scn.nextDouble();
       System.out.println("Rate of growth: ");
       a = scn.nextDouble();
       System.out.println("The sum of the first "+k+" terms of a finite geometric series that starts with "+x1+" and increases by a rate of "+a+" is "+form1.findGeometricSeriesSum(a,x1,k));
       System.out.println("DIE ROLLER\n" + "How many sides does your die have? ");
       k = scn.nextInt();
       System.out.println("Rolling a "+k+"-sided die... you got a "+form1.rollDie(k)+"!");
   }
}


