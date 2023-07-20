class Shapes
  {
    void area()
    {
      int side=8;
      int area=side*side;
      System.out.println("Area of Square "+area);
    }
  }
class Rectangle extends Shapes
  {
    void area()
    {
      int length=20;
      int breadth=30;
      int area=length*breadth;
      System.out.println("Area of Rectangle "+area);
    }
  }
class Triangle extends Rectangle
  {
    void area()
    {
      float base=5;
      float height=2;
      float area=(base*height)/2;
      System.out.println("Area of Triangle "+area);
    }
  }
class Area
  {
    public static void main(String[]args)
    {
      Shapes s=new Shapes();
      s.area();
      Shapes se=new Rectangle();
      se.area();
      Rectangle r=new Triangle();
      r.area();    
    }
  }