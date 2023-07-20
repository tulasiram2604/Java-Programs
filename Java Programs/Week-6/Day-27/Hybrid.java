class GrandFather
  {
    void qualities()
      {
        System.out.println("GrandFather");
      }
  }
    class Father extends GrandFather
      {
        void quality()
        {
        System.out.println("Father");
      }
      }
class Son extends Father
      {
        void features()
        {
        System.out.println("Son");
      }
      }
class Daughter extends Father
      {
        void daughter()
        {
        System.out.println("Daughter");
      }
      }
    class Hybrid
      {
    public static void main(String[]args)
    {
      Son s=new Son();
      Daughter d=new Daughter();
      s.features();
      d.qualities();
      d.quality();
    }
  }