

public class Formulas
{

    public OrderedPair findQuadraticRoots (double a, double b, double c){
        double disc = Math.pow(b,2) - 4*a*c;
        double r1 = (-b + Math.sqrt(disc))/2.0*a;
        double r2 =  (-b - Math.sqrt(disc))/2.0*a;
        System.out.println(disc+" "+r1+" "+r2);
        return new OrderedPair(r1,r2);
    }
    public double findSlope (OrderedPair A, OrderedPair B){
        double dy = B.getY() - A.getY();
        double dx= B.getX() - A.getX();
        return dy/dx;
    }
    public OrderedPair findMidpoint (OrderedPair A, OrderedPair B){
        double avgx = (A.getX() + B.getX())/2;
        double avgy = (A.getY() +B.getY())/2;
        return new OrderedPair(avgx,avgy);
    }
    public double findArithmeticSeriesSum (double a, double d, int k){
        double s = (k/2)*((2*a) + d*(k-1));
        return s;
    }
    public double findGeometricSeriesSum (double a, double r, int k){
        double s = a*((1- Math.pow(r,k))/(1-r));
        return s;
    }
    public int rollDie (int sides){
        return ((int) (Math.random() * sides)) +1;
    }
}
