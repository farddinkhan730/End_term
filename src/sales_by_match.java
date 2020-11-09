import java.util.Scanner;

public class sales_by_match {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int count=0;
        boolean idx[]=new boolean[n];
        for (int i = 0; i <n ; i++) {

            for (int j = 0; j < n; j++) {
                if(i==j){
                    continue;
                }
                else if(a[i]==a[j] && !idx[j] && !idx[i]){
                    count++;
                    idx[i]=true;
                    idx[j]=true;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
