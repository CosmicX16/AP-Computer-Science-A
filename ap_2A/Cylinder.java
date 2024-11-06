
/**
Christopher Xie's project
September 23 2024
Problem Set 2A
 */
public class Cylinder
{
    // instance variables - replace the example below with your own
    private double height;
    private Circle base = new Circle();
    
    public Cylinder()
    {
       this.height = 1;
       this.base = new Circle(1);
    }
    public Cylinder(double r, double h){
        this.height = h;
        this.base = new Circle(r);
    }
    public String toString()
    {
        return("Hello, I am a circle with a radius of "+ this.getRadius()+" and a height of "+this.height);
    }
    public double getRadius(){
        return this.base.getRadius();
    }
    public double getHeight(){
        return this.height;
    }
    public double surfaceArea(){
        double d = this.base.area()*2;
        double f = this.base.circumference()*this.height;
        return (d+f);
    }
    public double volume(){
        double d = this.base.area();
        return(d*this.height);
    }
}
