class Odd1to100
  {
    public static void main(String[]args)
    {
      int i=1;
      System.out.println("The Odd Numbers Between 1 to 100");
      while(i<=100)
        {
          if(i%2!=0)
          {
            System.out.print(i+"\t");
          }
          i++;
        }
    }
  }