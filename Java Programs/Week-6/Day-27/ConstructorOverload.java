class ConstructorOverload
  {
    ConstructorOverload()
    {
      System.out.println("this is no-args constructor");
    }
    ConstructorOverload(int x)
    {
      System.out.println(x);
    }
ConstructorOverload(int y,int z)
    {
      System.out.println(y+z);
    }   
    public static void main(String args[])
    {
      ConstructorOverload obj=new ConstructorOverload();
      ConstructorOverload obj1=new ConstructorOverload(12);
       ConstructorOverload obj2=new ConstructorOverload(5,6);
      
      
    }
  }