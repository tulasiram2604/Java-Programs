class Student
  {
    String name;
    int rollno;
    char grade;
    Student(String name,int rollno,char grade)
    {
      System.out.println("Student name "+name);
      System.out.println("Student Roll no "+rollno);
      System.out.println("Student Grade "+grade+"\n");
    }
    public static void main(String[]args)
    {
      Student s1=new Student("Ram",81,'A');
      Student s2=new Student("Ganesh",64,'A');
      Student s3=new Student("Sai",25,'B');
      Student s4=new Student("Santhosh",30,'C');
    }
  }