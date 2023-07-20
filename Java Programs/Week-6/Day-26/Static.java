class Static
  {
    static int x=1;
    int y=1;
    Static()
    {
      x++;
      y++;
      System.out.println("x value is"+x);
      System.out.println("y value is"+y);
      
    }
    public static void main(String args[])
    {
      Static c1=new Static();
      Static c2=new Static();
      Static c3=new Static();
    }
  }