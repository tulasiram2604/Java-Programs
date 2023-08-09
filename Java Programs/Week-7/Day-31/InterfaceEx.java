interface Calculator
  {
      void addition(int a,int b);
      void subtraction(int a,int b);
      void multplication(int a,int b);
      void division(int a,int b);
  }
class Arithmetic implements Calculator
  {
    public void addition(int a,int b)
    {
      System.out.println(a+b);
    }
    public void subtraction(int a,int b)
    {
      System.out.println(a-b);
    }
     public void multplication(int a,int b)
    {
      System.out.println(a*b);
    }
    public void division(int a,int b)
    {
      System.out.println(a/b);
    }
  }
 
class InterfaceEx
  {
    public static void main(String args[])
    {
      Calculator calc=new Arithmetic();        calc.addition(23,45);
      calc.subtraction(67,56);
      calc.multplication(2,12);
      calc.division(45,5);
    }
  }