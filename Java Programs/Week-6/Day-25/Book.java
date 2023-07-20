/* Create a class called "Book" with instance variables for storing the book title, author, and publication year. Implement a method named initializeBook that takes arguments for each variable and initializes the object. Display the details of the book using a separate method */
class Book
  {
    String bname;
    String bauthor;
    int year;
      public void intilizeBook(String n,String a,int y)
        {
       bname=n;
        bauthor=a;
        year=y;
        }
      public void display()
        {
        System.out.println("The Book Name is "+bname);
        System.out.println("The Book Author is "+bauthor);
        System.out.println("Published year is "+year);
          System.out.println();
        }
      public static void main(String[]args)
        {
        Book b1=new Book();
        Book b2=new Book();
        Book b3=new Book();
        b1.intilizeBook("Core java","Richard Jhones",1990);
        b2.intilizeBook("Python","Williums",2010);
        b3.intilizeBook("Oracle","Harry",2015);
        b1.display();
        b2.display();
        b3.display();
        }
    }