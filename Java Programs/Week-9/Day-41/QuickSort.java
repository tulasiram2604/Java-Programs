import java.util.*;
class QuickSort 
  {
    public static int partition(int a[], int lb, int ub) {
        int pivot = a[lb];
        int start = lb;
        int end = ub;

        while (start < end) {
            while (a[start] <= pivot && start < ub) {
                start++;
            }
            while (a[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }

        a[lb] = a[end];
        a[end] = pivot;

        return end;
    }

    public static void quickSort(int a[], int lb, int ub) {
        if (lb < ub) {
            int loc = partition(a, lb, ub);
            quickSort(a, lb, loc - 1);
            quickSort(a, loc + 1, ub);
        }
    }

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the Array");
      int size=sc.nextInt();
        int arr[] = new int[size];
      System.out.println("Enter the elements in the array");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("Elements before Sorting");
      for(int i=0;i<size;i++)
      {
        System.out.print(arr[i]+" ");
      }
        int lb = 0;
        int ub = arr.length - 1;
        quickSort(arr, lb, ub);
        System.out.println("\n Elements after sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}