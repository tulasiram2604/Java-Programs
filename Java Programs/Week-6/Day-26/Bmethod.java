import java.util.Scanner;
class Bmethod
  {
    String bookname;
    String author;
    int year;
    int id;
  public void bookDetails(String bn, String a,int y,int i)
    {
      bookname=bn;
      author=a;
      year=y;
      id=i;
    }
    public void displayDetails()
    {
   System.out.println("bookname: "+bookname+"author: "+author+"year: "+year);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Bmethod b[]=new Bmethod[3];
      for(int i=0;i<b.length;i++)
        {
         b[i]=new Bmethod();
         System.out.println("enter book "+(i+1));
         System.out.println("enter book name ");
         String bname=sc.next();
         System.out.println("enter book author ");
         String bauthor=sc.next();
         System.out.println("enter book year ");
         int byear=sc.nextInt();
         System.out.println("enter book id ");
         int bid=sc.nextInt();
         b[i].bookDetails(bname,bauthor,byear,bid);
        }
      for(int i=0;i<b.length;i++)
        {
          b[i].displayDetails();
        }
    }
  }