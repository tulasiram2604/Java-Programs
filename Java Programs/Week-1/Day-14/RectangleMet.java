import java.util.*;
class RectangleMet
  {
    public static void areaRec(int l,int b)
    {
      int area=l*b;
      System.out.println("Area of Rectangle is : "+area);
    }
    public static void periRec(int l,int b)
    {
      int peri=2*(l+b);
      System.out.println("Perimeter of the rectangle is :"+peri);
    }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length:");
      int l=sc.nextInt();
      System.out.println("Enter The Breadth :");
      int b=sc.nextInt();
      areaRec(l, b);
      periRec(l, b);
    }
  }