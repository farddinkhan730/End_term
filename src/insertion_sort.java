import java.util.ArrayList;
import java.util.Scanner;

public class insertion_sort {
        static void insertion_sort(int a[],int n){
            int b[]=a.clone();
            ArrayList<Integer> al=new ArrayList<>();
            for(int i=0;i<n;i++){
                int temp=a[i];
                int j=i;
                while(j>0 && temp<a[j-1]){
                    a[j]=a[j-1];
                    j=j-1;
                }
                al.add(j);
                a[j]=temp;
            }
            System.out.println(al.size());
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <al.size() ; j++) {
                    if (b[i] == a[al.get(j)]) {
                        System.out.print(j + " ");
                    }
                }
            }

        }
        public static void main(String args[] ) throws Exception {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            insertion_sort(a,n);
        }
}
class clone{
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b[]=a.clone();
        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);
        }
    }
}
