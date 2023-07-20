import java.util.*;
class AreaSquareMet
  {
    public static void areaSquare(int side)
    {
      int area=side*side;
      System.out.println("Area Of The Square is"+area);
    }
    public static void perimeterSquare(int side){
    int peri=4*side;
    System.out.println("Perimeter of the Square is"+peri);
  }
public static void main(String[]args)
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Side Of The Square");
  int side=sc.nextInt();
  areaSquare(side);
  perimeterSquare(side);
  }
}