class StringPrblm
  {
    public static void main(String[] args)
    {
      String s1="Tulasi Ram";
      String s2="HI THIS IS RAM";
      String s3="Ram";
      String s4="Tulasi Ram";
      System.out.println("The length of the String is : "+s1.length());
       System.out.println("concatinate s3 and s2"+s3.concat(s2));
      System.out.println("concatinate s1 and s4"+s1.concat(s4));
      System.out.println("s1 equals to s4"+(s1==s4));
      System.out.println("s1 equals to s4"+(s2==s3));
      System.out.println("s1 equals s4 "+s1.equals(s4));
    }
  }