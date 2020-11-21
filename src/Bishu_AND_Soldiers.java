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
