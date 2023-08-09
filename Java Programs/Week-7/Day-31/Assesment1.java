/* Assignment 1: Shape Interface Create an interface called Shape with the following methods:
calculateArea(): Abstract method that calculates and returns the area of the shape.calculatePerimeter(): Abstract method that calculates and returns the perimeter of the shape.getDescription(): Abstract method that returns a String describing the shape.
Now, create classes Circle, Rectangle, and Triangle, implementing the Shape interface. Write appropriate code to calculate the area and perimeter for each shape and provide a description. */
import java.util.*;
interface Shape
  {
    Scanner sc=new Scanner(System.in);
      void calculateArea();
      void calculatePerimeter();
      void getDescription();
  }
class Circle implements Shape
  {
     int radius=sc.nextInt();
    public void calculateArea()
    {      
       System.out.println("Area of Circle is is "+(2*3.174*radius));
    }
    public void calculatePerimeter()
      {
      System.out.println("Perimeter of the Rectangele "+(2*3.174*radius*radius));
    }
     public void getDescription()
    {
      System.out.println("Shape of the Object Circle"+"\n");
    }
  }
class Rectangle implements Shape
  {
     int l=sc.nextInt();
      int b=sc.nextInt();
    public void calculateArea()
    {      
       System.out.println("Area of rectangle is is "+(l*b));
    }
    public void calculatePerimeter()
      {
      System.out.println("Perimeter of the Rectangele"+(2*(l+b)));
    }
     public void getDescription()
    {
      System.out.println("Shape of the Object Rectangle"+"\n");
    }
  }
class Triangle implements Shape
  {
    public void calculateArea()
    {      
        System.out.println("Enter The Dimensions of Triangle to calculate Area");
     System.out.println("Enter The Height Of Triangle");
     int h=sc.nextInt();
     System.out.println("Enter The Base of Triangle");
       int b=sc.nextInt();
       float area=(h*b)/2;
       System.out.println("Area of Triangle is "+area);
    }
    public void calculatePerimeter()
      {
       System.out.println("Enter The Dimensions of Triangle to calculate Perimeter");
     System.out.println("Enter The 1st Side of Triangle");
     int side1=sc.nextInt();
     System.out.println("Enter The 2nd Side of Triangle");
       int side2=sc.nextInt();
         System.out.println("Enter The 3rd Side of Triangle");
       int side3=sc.nextInt();;
       float perimeter=side1+side2+side3;
       System.out.println("Perimeter of Triangle is is "+perimeter);
    }
     public void getDescription()
    {
      System.out.println("Shape of the Object Triangle"+"\n");
    }
  }
class Assesment1
  {
    public static void main(String args[])
    {
      System.out.println("Enter the Radius of the Circle");
      Shape ce=new Circle();
      System.out.println("Enter the Length and Breadth of the Rectangle");
      Shape re=new Rectangle();
      Shape te=new Triangle();
      ce.calculateArea();
      ce.calculatePerimeter();
      ce.getDescription();
      re.calculateArea();
      re.calculatePerimeter();
      re.getDescription();
      te.calculateArea();
      te.calculatePerimeter();
      te.getDescription();
    }
  }