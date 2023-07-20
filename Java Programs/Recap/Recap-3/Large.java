import java.util.*;
class Large
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int temp=0;
      System.out.println("enter the size of the array");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      for(int i=0;i<size;i++)
        {
          for(int j=i+1;j<size;j++)
            {
              if(arr[i]>arr[j])
              {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              }
            }
        }
      System.out.println("after sorting array elements");
      for(int i=0;i<size;i++)
        {
          System.out.println(arr[i]);
        }
      System.out.println("Second Largest Element In array "+arr[size-2]);
    }

  }