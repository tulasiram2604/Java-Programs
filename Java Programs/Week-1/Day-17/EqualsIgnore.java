class EqualsIgnore
  {
    public static void main(String[]args)
    {
      String s1="hai";
      String s2="hai";
      String s3="Hai";
      String s4="Ram";
      System.out.println(s1.equals(s2));
      System.out.println(s1.equals(s3));
      System.out.println(s1.equals(s4));
      System.out.println(s1.equalsIgnoreCase(s3));
    }
  }