class Animal
  {
    void king()
      {
        System.out.println("Lion is King of the Forest");
      }
  }
    class Tiger extends Animal
      {
        void wild()
        {
        System.out.println("Tiger is one of the Wildest animals");
      }
      }
class Cheetah extends Tiger
      {
        void speed()
        {
        System.out.println("Cheetah is fastest wild animal");
      }
      }
class Elephant extends Cheetah
      {
        void big()
        {
        System.out.println("Elephant is the big animals in forest");
      }
      }
    class MultiLevel
      {
    public static void main(String[]args)
    {
      Elephant e=new Elephant();
      e.wild();
      e.king();
      e.speed();
      e.big();
    }
  }