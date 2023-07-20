import java.util.*;
class ArrDeletion
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array size");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("enter the array index you want to Delete");
      int pos=sc.nextInt();
      for(int i=pos;i<size-1;i++)
            arr[i]=arr[i+1];
      System.out.println("After Deleting the elements");
      for(int i=0;i<size-1;i++)
        {
          System.out.println(arr[i]);
        }
   }
  }