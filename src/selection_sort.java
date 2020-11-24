import java.util.Scanner;

public class selection_sort {
    static void selection_sort (int A[ ], int n,int n1) {
        // temporary variable to store the position of minimum element

        int minimum;
        // reduces the effective size of the array by one in  each iteration.

        for (int i = 0; i < n - 1; i++) {

            // assuming the first element to be the minimum of the unsorted array .
            minimum = i;

            // gives the effective size of the unsorted  array .

            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[minimum]) {
                    minimum = j;
                }
            }
            // putting minimum element on its proper position.
            int temp = A[minimum];
            A[minimum] = A[i];
            A[i] = temp;
        }
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        selection_sort(a,n,n1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }


    }
}