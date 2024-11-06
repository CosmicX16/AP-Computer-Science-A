
/**
Christopher Xie's project
September 23 2024
Problem Set 2A
 */
public class Circle
{
    
    private double radius;

    
    public Circle()
    {
        radius = 1;
        
    }
    
    public Circle(double n){
        radius = n;
    }
       
    public String toString(){
        return("Hello, I am a circle with a radius of "+radius);
    }
    public double getRadius(){
        return this.radius;
    }
    public double circumference(){
        double num = 2*Math.PI*this.radius;
        return num;
    }
    public double area(){
        double num = Math.PI*this.radius*this.radius*0.5;
        return num;
    }
}
