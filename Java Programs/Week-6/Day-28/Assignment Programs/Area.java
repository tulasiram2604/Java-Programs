/* Create a class Shape with a method area that returns 0. Derive two classes Circle and Square from Shape. Override the area method in both derived classes to calculate and return the area of a circle and a square, respectively. Allow the user to input the required parameters (e.g., radius for a circle, side length for a square) */
import java.util.*;
class Shapes
  {
    void area()
    {
      System.out.println("Area of Circle nad Square is");
    }
  }
class Circle extends Shapes
  {
    Scanner sc=new Scanner(System.in);
  void area()
    {
      System.out.println("Enter the radius of circle");
      float radius=sc.nextFloat();
      System.out.println(" Area of the Circle is "+(3.14+radius*radius));
    }
  }
class Square extends Shapes
  {
    Scanner sc=new Scanner(System.in);
    void area()
    {
      System.out.println("Enter the side of a Square");
      int side=sc.nextInt();
      System.out.println("Area of Square is "+(side*side));
    }
  }
class Area
  {
    public static void main(String [] args)
    {
      Shapes s=new Shapes();
      Shapes sc=new Circle();
      Shapes sr=new Square();
      s.area();
      sc.area();
      sr.area();
    }
  }