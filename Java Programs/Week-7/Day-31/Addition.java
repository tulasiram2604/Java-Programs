abstract class Arithmetic
{
    void display()
    {
        System.out.println("here we are displaying all arithmetic operations");
    }
    abstract void calculate();
}
class Addition extends Arithmetic
{
public void calculate()
   {
       int a=10,b=20;
       int c=a+b;
       System.out.println("addition is"+c);
   }
   public static void main(String args[])
   {
      Arithmetic arithmetic =new Addition();
      arithmetic.display();
      arithmetic.calculate();
   }
}