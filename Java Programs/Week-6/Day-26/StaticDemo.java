class StaticDemo
  {
    String studentName;
    int studentRollno;
    static String clgname="kbn";
   
    public static void main(String args[])
    {
     StaticDemo sd=new StaticDemo();
      sd.studentName="Ram";
      sd.studentRollno=81;
      StaticDemo sd1=new StaticDemo();
      sd1.studentName="Sai";
      sd1.studentRollno=47;
      System.out.println(sd.studentName+" "+sd.studentRollno+" "+clgname);
      System.out.println(sd1.studentName+" "+sd1.studentRollno+" "+clgname);
     
    }
  }