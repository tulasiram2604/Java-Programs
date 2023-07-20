import java.util.*;
class Book
  {
    String bname;
    int bid;
    String author;
    int year;
    public void display()
    {
      System.out.println("The Book Name is "+bname);
      System.out.println("The Book Id is "+bid);
      System.out.println("The Book Author is "+author);
      System.out.println("Year of Published "+year+"\n");
    }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      Book b[]=new Book[4];
      for(int i=0;i<b.length;i++)
        {
          System.out.println("Enter "+(i+1)+" Book Details");
          b[i]=new Book();
          System.out.println("Enter Book Name");
          b[i].bname=sc.next();
          System.out.println("Enter Book Id");
          b[i].bid=sc.nextInt();
          System.out.println("Enter Author name");
          b[i].author=sc.next();
          System.out.println("Enter the year of Published");
          b[i].year=sc.nextInt();
        }
      for(int i=0;i<b.length;i++)
        {
          b[i].display();
        }
    }
  }