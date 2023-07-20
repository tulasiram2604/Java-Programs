class CompareString
  {
    public static void main(String[]args)
    {
      String s1="hi";
      String s2="bye";
      String s3="hi";
      String s4="welcome";
      System.out.println("s1>s2"+s1.compareTo(s2));
      System.out.println("s1=s3"+s1.compareTo(s3));
      System.out.println("s1<s4"+s1.compareTo(s4));
    }
  }