import java.util.*;
class ArrInsertion
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
      System.out.println("enter the element you want to insert");
      int m=sc.nextInt();
      int arr1[]=new int[size+1];
      System.out.println("enter the array index you want to insert");
      int pos=sc.nextInt();
      for(int i=0;i<size+1;i++)
      {
        if(i==pos)
        {
          arr1[i]=m;
        }
        else if(i>pos)
        {
          arr1[i]=arr[i-1];
        }
else {
    arr1[i]=arr[i];      
}        
}
      for(int i=0;i<size+1;i++)
        System.out.println(arr1[i]);
   }
  }