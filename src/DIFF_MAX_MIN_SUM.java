import java.util.Scanner;

public class DIFF_MAX_MIN_SUM {
    static void bubbbleshort(int a[],int n,int d){
        int temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        int sum=0,sum1=0;
        int start=n-d;
        for (int j = start; j < n; j++) {
            sum+=a[j];
        }
        for (int i = 0; i <d ; i++) {
            sum1+=a[i];
        }
        System.out.println(Math.abs(sum-sum1));



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[n];
            for (int j = 0; j<n ; j++) {
                a[j]=sc.nextInt();
            }
            bubbbleshort(a,n,Math.abs(n-m));
        }


    }
}
