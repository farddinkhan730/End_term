import java.util.Scanner;

public class count_no_of_swap {
    static void countsort(int A[],int n) {
        int temp;
        int count = 0;
        int n1 = A.length;
        boolean swap = true;
        while (swap != false) {
            swap = false;
            count = count + 1;
            for (int i = 0; i < n - 1; i++) {
                if (A[i] > A[i + 1]) {
                    swapeing(A[i], A[i + 1]);
                    swap = true;
                }
            }
//            for (int k = 0; k < n - 1; k++) {
//                for (int i = 0; i < n - k - 1; i++) {
//                    if (A[i] > A[i + 1]) {
//                        temp = A[i];
//                        A[i] = A[i + 1];
//                        A[i + 1] = temp;
//                        count++;
//                    }
//                }
//            }
        }
            System.out.print(count);

    }
        static void swapeing(int a,int b){
            int temp=a;
            a=b;
            b=temp;
            return;
        }
        public static void main(String args[] ) throws Exception {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            countsort(a,n);


        }
    }


