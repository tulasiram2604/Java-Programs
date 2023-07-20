class Shape
  {
    void display()
    {
      System.out.println("To find Area of Square");
    }
    void display(int side)
    {
      System.out.println("Side of the Square "+side);
    }
    void display(int side,String a)
    {
      int area=side*side;
      System.out.println("Area of Square "+area);
    }
  }
class Square
  {
    public static void main(String[]args)
    {
      Shape s=new Shape();
      s.display();
      s.display(5);
      s.display(5,"a");
    }
  }