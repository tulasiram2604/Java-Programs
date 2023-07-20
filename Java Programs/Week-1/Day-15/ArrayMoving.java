import java.util.*;
class ArrayMoving
  {
    public static void arrayCopy(int arr1[],int arr2[])
    {
      for(int i=0;i<arr1.length;i++)
        {
          arr2[i]=arr1[i];
        }
        System.out.println("Array 2 Elements are");
      for(int i=0;i<arr2.length;i++)
        {
         System.out.println(arr2[i]+"");
        }
    }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The Elements In 1st Array");
      int a[]=new int[6];
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      arrayCopy(a,a);
    }
  }