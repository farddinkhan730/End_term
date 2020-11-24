import java.util.Random;
import java.util.Scanner;

public class Quick_sort {
        static int partition(int ar[], int start, int end){
            int piv=ar[end];
            int pindex=(start-1);
            for(int i=start;i<end;i++){
                if(ar[i]<piv){
                    pindex++;
                    int temp=ar[pindex];
                    ar[pindex]=ar[i];
                    ar[i]=temp;
//                    pindex++;
                }
            }
            int temp=ar[pindex+1];
            ar[pindex+1]=ar[end];
            ar[end]=temp;
            return pindex+1;
        }
//    static int rand_partition ( int A[ ] , int start , int end ) {
//        Random rand=new Random();
//        int random = start + rand.nextInt(end-start) +start;
//
//        int temp=A[random];
//        A[random]=A[start];
//        A[start]=temp;
//
//        return partition(A,start ,end) ;
//    }

    static void quicksort(int a[],int start,int end){
            if(start<end){
                int pivindex=partition(a,start,end);
                quicksort(a,start,pivindex-1);
                quicksort(a,pivindex+1,end);
            }
        }
        public static void main(String args[] ) throws Exception {
            Scanner sc=new Scanner(System.in);
            int s=sc.nextInt();
            int a[]=new int[s];
            for(int i=0;i<s;i++){
                a[i]=sc.nextInt();
            }
            quicksort(a,0,s-1);
            for (int i = 0; i <s ; i++) {
                System.out.println(a[i]);
            }
        }
    }
// Java program for implementation of QuickSort
class QuickSort
{

    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {

            if (arr[j] < pivot)
            {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);

            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);

        System.out.println("sorted array");
        printArray(arr);
    }
}

