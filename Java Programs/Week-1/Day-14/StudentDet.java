import java.util.Scanner;
class StudentDet
  {
    public static void studentDetails(String name,int rno)
    {
    System.out.println("The Student Name is: "+name+" Roll No : "+rno);
    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Student Name");
      String sname=sc.nextLine();
      System.out.println("Enter Student Roll No");
     int srno=sc.nextInt();
      studentDetails("Ram",81);
      studentDetails("Sai",75);
      studentDetails(sname,srno);
    }
  }