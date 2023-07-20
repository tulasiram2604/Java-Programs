class Animal
  {
    void king()
      {
        System.out.println("Lion");
      }
  }
    class Tiger
      {
        void king()
        {
        System.out.println("Tiger");
      }
      }
class Cheetah extends Animal,Tiger
      {
        void speed()
        {
        System.out.println("Cheetah");
      }
      }
    class Multiple
      {
    public static void main(String[]args)
    {
      Cheetah c=new Cheetah();
      c.king();
      c.speed();
    }
  }