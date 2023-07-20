import java.util.*;
class Rectangle
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      double l,b;
      System.out.println("Enter Length");
      l=sc.nextDouble();
      System.out.println("Enter Breadth");
      b=sc.nextDouble();
      double peri=2*(l+b);
      double area=l*b;
      System.out.println("Perimeter of rectangle"+peri);
      System.out.println("Area of Rectamngle"+area);
    }
  }