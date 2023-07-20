import java.util.*;
class Rectangle
  {
    int length;
    int width;
    public void display()
    {
      System.out.println("The Perimeter of rectangle "+(2*(length+width)));
      System.out.println("The Area of rectangle "+(length*width));
    }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      Rectangle r=new Rectangle();
      System.out.println("Enter Length");
      r.length=sc.nextInt();
      System.out.println("Enter Width");
      r.width=sc.nextInt();
      r.display();
    }
  }