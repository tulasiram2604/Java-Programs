class Student 
{
    int rno;
    String sname;
    String address;
    public String toString()
    {
        return rno+"\n"+sname+"\n"+address;
    }
    public static void main(String[] args) 
  {
            Student st=new Student();
            st.rno=281;
            st.sname="Ram";
            st.address="One Town,Vijayawada";
            System.out.println(st);
          
    }
}