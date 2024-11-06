

public class OrderedPair
{
    
    double X;
    double Y;

    public OrderedPair()
    {
        X = 0;
        Y =0;
    }
    public OrderedPair(double x, double y){
        X = x;
        Y = y;
    }
    public String toString(){
        return "("+X+" , "+Y+")";
    }
    public double getX(){
        return X;
    }
    public double getY(){
        return Y;
    }
}
