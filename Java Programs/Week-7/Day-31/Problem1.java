/* Assignment 1: Shape Hierarchy
Create an abstract class called "Shape" that has the following abstract methods:
get_area(): Returns the area of the shape.
get_perimeter(): Returns the perimeter of the shape.
Create concrete classes Circle, Rectangle, and Triangle that inherit from the abstract class "Shape." Implement the required methods for each class.
Write a program to:
Create instances of Circle, Rectangle, and Triangle.
Prompt the user to enter dimensions for each shape.
Calculate and display the area and perimeter of each shape. */
import java.util.*;
abstract class Shape
{
  Scanner sc=new Scanner(System.in);
    abstract void get_Area();
  abstract void get_Perimeter();
}
class Rectangle extends Shape
{
public void get_Area()
   {
     System.out.println("Enter The Dimensions of Rectangle to Calculate Area");
     System.out.println("Enter The Length of Rectangle");
     int l=sc.nextInt();
     System.out.println("Enter The Breadth of Rectangle");
       int b=sc.nextInt();
       int area=l*b;
       System.out.println("Area of rectangle is is "+area);
   }
  public void get_Perimeter()
  {
         System.out.println("Enter The Dimensions of Rectangle to calculate Perimeter");
     System.out.println("Enter The Length of Rectangle");
     int l=sc.nextInt();
     System.out.println("Enter The Breadth of Rectangle");
       int b=sc.nextInt();
       int perimeter=2*(l+b);
       System.out.println("Perimeter of rectangle is is "+perimeter);
  }
}
  class Circle extends Shape
{
public void get_Area()
   {
     System.out.println("Enter Dimension to Calculate Area Of Circle");
     System.out.println("Enter The Radius Of circle");
       double radius=sc.nextDouble();
       double area=2*3.174*radius;
       System.out.println("Area of Circle is is "+area);
   }
  public void get_Perimeter()
  {
       System.out.println("Enter Dimension to Calculate Perimeter Of Circle");
     System.out.println("Enter The Radius Of circle");
       double radius=sc.nextDouble();
       double perimeter=2*3.174*radius*radius;
       System.out.println("Perimeter of Circle is is "+perimeter);
  }
}
  class Triangle extends Shape
{
public void get_Area()
   {
      System.out.println("Enter The Dimensions of Triangle to calculate Area");
     System.out.println("Enter The Height Of Triangle");
     int h=sc.nextInt();
     System.out.println("Enter The Base of Triangle");
       int b=sc.nextInt();
       float area=(h*b)/2;
       System.out.println("Area of Triangle is "+area);
   }
  public void get_Perimeter()
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
}
  class Problem1
    {
   public static void main(String args[])
   {
     Shape re=new Rectangle();
     Shape cr=new Circle();
      Shape tr=new Triangle();
     cr.get_Area(); 
     cr.get_Perimeter();
     re.get_Area();
     re.get_Perimeter();
     tr.get_Area();
     tr.get_Perimeter();
   }
    }