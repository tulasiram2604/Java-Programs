class Animal
  {
    void king()
      {
        System.out.println("Lion");
      }
  }
    class Tiger extends Animal
      {
        void wild()
        {
        System.out.println("Tiger");
      }
      }
class Cheetah extends Animal
      {
        void speed()
        {
        System.out.println("Cheetah");
      }
      }
    class Hierarchical
      {
    public static void main(String[]args)
    {
      Cheetah c=new Cheetah();
      Tiger t=new Tiger();
      c.speed();
      c.king();
      t.wild();
    }
  }