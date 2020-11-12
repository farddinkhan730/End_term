import java.util.Scanner;

public class Circular_array {
    public static int[] result(int a[],int k){
        for (int i = 0; i < k; i++) {
            int temp=a[a.length-1];
//            System.out.println("i "+i+"temp "+temp);
            for (int j =a.length-1; j >0; j--) {
//                if(j==0){
//                    break;
//                }
                a[j]=a[j-1];

            }
            a[0]=temp;
//            System.out.println("i "+i+"a[i] "+a[i]);

        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int q=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
        int s[]=result(a,k);
        for (int i = 0; i <q ; i++) {
            int m=sc.nextInt();
//            int s[]=result(a,k,);
            System.out.println(s[m]);

        }
    }
}
        //OR
class ssd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int Q = in.nextInt();
        int rot = K % N;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = in.nextInt();
        for (int i = 0; i < Q; i++) {
            int idx = in.nextInt();
            if (idx - rot >= 0)
                System.out.println(arr[idx - rot]);
            else
                System.out.println(arr[idx - rot + arr.length]);
        }
    }
}