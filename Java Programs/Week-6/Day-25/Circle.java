class Circle
  {
    int radius;
    Circle(int radius)
    {
      System.out.println("The Radius of the circle is "+radius+"\n");
    }
    public static void main(String[]args)
    {
      Circle c1=new Circle(21);
      Circle c2=new Circle(15);
      Circle c3=new Circle(30);
    }
  }