import java.util.*;
class SumNatural
{
  public static void main(String[]args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("The Sum OF 1 to N Natural numbers is");
    int n=s.nextInt();
    int i=1,sum=0;
    while(i<=n)
      {
        sum=sum+i;
        i++;
      }
    System.out.println("The Sum Of"+n+" Natural Numbers is : "+sum);
  }
}