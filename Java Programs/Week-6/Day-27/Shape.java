/* Assignment 3: Hierarchical Inheritance
Create a superclass called "Shape" with the following attributes:
String color
double radius
double length
double width */
class Rectangle
  {
    void color()
    {
      String color="Green";
      System.out.println("The Color of the Shape is "+color);
    }
  }
class Radius extends Rectangle
  {
    void measure()
    {
      int radius=20;
      System.out.println("Radius of the shape is "+radius+" cm");
    }
  }
class Measure extends Rectangle
  {
    void len()
    {
      int length=40;
      System.out.println("The Length of of the Shape is "+length);
    }
    void bre()
    {
      int breadth=20;
      System.out.println("The Breadth of the shape is "+breadth);
    }
  }
class Shape
  {
    public static void main(String[]args)
    {
      Measure m=new Measure();
      Radius r=new Radius();
      r.color();
      r.measure();
      m.len();
      m.bre();
  }
  }