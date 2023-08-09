abstract class Shape
{
    abstract void calculateArea();
}
class Rectangle extends Shape
{
public void calculateArea()
   {
       int l=10,b=20;
       int area=l*b;
       System.out.println("Area of rectangle is is"+area);
   }
}
  class Square extends Shape
{
public void calculateArea()
   {
       int side=6;
       int area=side*side;
       System.out.println("Area of Square is is"+area);
   }
}
  class Triangle extends Shape
{
public void calculateArea()
   {
       int h=9,b=4;
       float area=(h*b)/2;
       System.out.println("Area of Triangle is is"+area);
   }
}
  class ShapeEx
    {
   public static void main(String args[])
   {
     Shape re=new Rectangle();
     Shape sq=new Square();
      Shape tr=new Triangle();
      re.calculateArea();
     sq.calculateArea();
     tr.calculateArea();
   }
   }