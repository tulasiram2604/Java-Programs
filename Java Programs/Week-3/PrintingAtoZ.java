class PrintingAtoZ
  {
    public static void main(String[]args)
    {
      char ch='a';
      System.out.println("Printing The Alphabets From A to Z");
      while(ch<='z')
        {
          System.out.print(ch+"\t");
          ch++;
        }
    }
  }