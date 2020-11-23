import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bishu_AND_Soldiers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int r=sc.nextInt();

        for (int i = 0; i < r; i++) {
            int p = sc.nextInt();
            int count=0;
            for (int j = 0; j < n; j++) {

                if (a[j] <= p) {
                    count++;
                }
            }
            int sum=0;
            for (int k = 1; k <= count; k++) {
                sum+=k;
            }
            System.out.println(count+" "+sum);
        }
    }
}
class su{
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <=10000 ; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}

class TestClass42 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int l = a.length - 1;
            int s=0;
            for (int j = 0; j < k; j++) {

                for (int k1 = l; k1>= 0; k1++) {
                    int s1=k1;
                    int temp=a[k1];
                    while(n-->0) {
                        a[s1] = a[s1 - 1];
                        s1--;
                    }
                    a[s]=temp;
                    for (int i = 0; i < a.length; i++) {
                        System.out.println(a[i]);
                    }
                }

            }
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }
}
class arrayli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            ArrayList arr = new ArrayList();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            for (int i = 0; i < k; i++) {
                arr.add(0,arr.get(n-1));
                arr.remove(n);
            }
            System.out.println(arr);
        }
    }
}
