
/**
Christopher Xie's project
September 23 2024
Problem Set 2A
 */
public class Driver
{
    public static void main (String[] args) {
    //testing Circle class
    //first Circle object
    System.out.println("Creating a circle with the default constructor!");
    Circle c1 = new Circle();
    System.out.println(c1.toString());
    System.out.println("getRadius() --> "+c1.getRadius()+" units");
    System.out.println("circumference() --> "+c1.circumference()+" units");
    System.out.println("area() --> "+c1.area()+" units^2");
    //Second Circle object
    System.out.println("Creating a circle with a parameterized constructor!");
    Circle c2 = new Circle(5.0);
    System.out.println(c2.toString());
    System.out.println("getRadius() --> "+c2.getRadius()+" units");
    System.out.println("circumference() --> "+c2.circumference()+" units");
    System.out.println("area() --> "+c2.area()+" units^2");    
    //testing the Cylinder class
    //first Cylinder Object
    System.out.println("Creating a cylinder with the default constructor!");
    Cylinder cy1 = new Cylinder();
    System.out.println("Hello, I am a cylinder with radius 1 and height 1");
    System.out.println("value of getRadius = "+cy1.getRadius());
    System.out.println("value of getHeight = "+cy1.getHeight());
    System.out.println("value of surfaceArea = "+cy1.surfaceArea());
    System.out.println("value of volume = "+cy1.volume());
    System.out.println("Creating a cylinder with a parametrized constructor!");
    Cylinder cy2 = new Cylinder(2,5);
    System.out.println("Hello, I am a cylinder with radius 2 and height 5");
    System.out.println("value of getRadius = "+cy2.getRadius());
    System.out.println("value of getHeight = "+cy2.getHeight());
    System.out.println("value of surfaceArea = "+cy2.surfaceArea());
    System.out.println("value of volume = "+cy2.volume());
    }
}
