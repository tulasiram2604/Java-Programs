import java.util.*;
class MulTable
{
  public static void main(String[]args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Number you want in a Table");
    int m=s.nextInt();
    int i=0;
    while(i<=20)
      {
        int r=m*i;
        System.out.println(+m+"*"+i+"="+r);
        i++;
      }
  }
}