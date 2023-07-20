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
    class Single
      {
    public static void main(String[]args)
    {
      Tiger ta=new Tiger();
      ta.king();
      ta.wild();
    }
  }