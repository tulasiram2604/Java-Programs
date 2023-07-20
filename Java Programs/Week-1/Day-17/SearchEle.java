import java.util.*;
class SearchEle
  {
    public static void searchElement(int a[],int key)
    {
      int i;
      int count=0;
      for(i=0;i<a.length;i++)
        {
          if(a[i]==key)
          {
            count++;
            break;
          }
        }
      if(count>0)
      {
        System.out.println("element is foud at"+i+"th index");
      }
      else
        System.out.println("Eleement is not found");
    }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int a[]={12,45,78,63,45,52};
      System.out.println("Enter the key value to search");
      int key=sc.nextInt();
      searchElement(a,key);
    }
  }