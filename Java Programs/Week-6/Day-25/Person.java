class Person
  {
    String pname;
    int age;
    String address;
    Person(String pname,int age,String address)
    {
      System.out.println("The Persons name is "+pname);
      System.out.println("The Persons Age is "+age);
      System.out.println("The Address Of the Person is "+address+"\n");
    }
    public static void main(String[]args)
    {
      Person p=new Person("Ram",23,"Kothapet,Vijayawada");
      Person p1=new Person("Sai",24,"Krishnalanka, Vijayawada");
      Person p2=new Person("Ganesh",23,"Gannavaram,Vijayawada");
    }
  }