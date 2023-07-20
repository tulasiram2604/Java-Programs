/*In this assignment, you are required to create a class called Calculator that implements method overloading for addition. The Calculator class should have three different methods named add, each with a different number of parameters:
add(a, b): This method should take two integer parameters and return their sum.
add(a, b, c): This method should take three integer parameters and return their sum.
add(a, b, c, d): This method should take four integer parameters and return their sum.
Your task is to write the Calculator class and demonstrate the use of these methods by calling each of them with appropriate arguments and printing the results. */
 
class Calculator
  {
    void calculate(int a,int b)
    {
      System.out.println("The Sum of 2 Values is "+(a+b));
    }
    void calculate(float a,float b)
    {
      System.out.println("The Subtract of 2 Values is "+(a-b));
    }
    void calculate(double a,double b)
    {
      System.out.println("The Multiplication of 2 Values is "+(a*b));
    }
    void calculate(long a,long b)
    {
      System.out.println("The Division of 2 Values is "+(a/b));
    }
  }
class Calculate
  {
    public static void main(String args[])
    {
      Calculator cl=new Calculator();
      cl.calculate(20,40);
      cl.calculate(20.0,40.5);
      cl.calculate(40,80);
      cl.calculate(40l,4l);
    }
  }