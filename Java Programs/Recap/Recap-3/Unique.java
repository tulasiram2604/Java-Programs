import java.util.Scanner;
class Unique
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int count=0;
      System.out.println("Enter the array size");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("Enter the elements into an array");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("Unique element are:");
      for(int i=0;i<size;i++)
        {
          for(int j=i+1;j<size;j++)
            {
              if(arr[i]==arr[j])
              {
                count++;
              }
                if(count==0)
                {
                  System.out.println(arr[i]);
                }
              }
            }
        }
    }