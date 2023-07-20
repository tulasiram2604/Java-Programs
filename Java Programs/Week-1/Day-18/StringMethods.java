class StringMethods
  {
    public static void main(String[]args)
    {
      String str1="Hi iam Ram";
      String str2="";
      boolean s1=str1.endsWith("R");
       boolean s2=str1.endsWith("m");
      boolean s3=str2.isEmpty();
      String s4=str2.replace("","Tulasi Ram");
      System.out.println(s1);
       System.out.println(s2);
      System.out.println(s3);
      System.out.println("The String S2 Replace with new String is "+s4);
          }
  }