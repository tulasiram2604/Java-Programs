class Shape
  {
    void display()
    {
      System.out.println("Square Shape");
    }
    void area(int side)
    {
      System.out.println("Area of the Square Shape "+(side*side));
    }
  }
class Rectangle extends Shape
  {
    void display()
    {
      System.out.println("Rectangle Shape");
    }
    void area(int length,int breadth)
    {
      System.out.println("Area of the Rectangle Shape "+(length*breadth));
    }
  }
class Triangle extends Rectangle
  {
    void display()
    {
      System.out.println("Triangle Shape");
    }
    void area(int base,int height)
    {
      System.out.println("Area of the Triangle Shape "+((base*height)/2));
    }
  }
class Shapes
  {
    public static void main(String[]args)
    {
      Shape sc=new Shape();
      sc.display();
      sc.area(6);
      Shape sr=new Rectangle();
      sr.display();
      sr.area(8,4);
      Rectangle st=new Triangle();
      st.display();
      st.area(5,6);
        }
  }