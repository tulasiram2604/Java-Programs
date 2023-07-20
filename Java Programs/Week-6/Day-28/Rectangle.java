class Shape
  {
    void display()
    {
      System.out.println("To find Area of Rectangle");
    }
    void display(int length,int breadth)
    {
      System.out.println("Length of the Rectangle "+length);
      System.out.println("Breadth of the Rectangle "+breadth);
    }
    void display(int length,int breadth,String a)
    {
      int area=length*breadth;
      System.out.println("Area of Rectangle "+area);
    }
  }
class Rectangle
  {
    public static void main(String[]args)
    {
      Shape s=new Shape();
      s.display();
      s.display(20,15);
      s.display(20,15,"a");
    }
  }