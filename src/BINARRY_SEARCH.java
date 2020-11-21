import java.util.Arrays;
import java.util.Scanner;

public class BINARRY_SEARCH {
    static int search(int arr[],int n,int s){
        int start=0;
        int end=n;
        Arrays.sort(arr);
//        for (int i:arr
//             ) {
//            System.out.print(i+" ");
//        }
        while(start<=end){
//            int mid=(start+end)/2;
//            or
            int mid=start+(end-start)/2;
            if(arr[mid]>s){
                end=mid-1;
            }
            else if(arr[mid]<s){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the number to be search");
        int s=sc.nextInt();
        for (int i = 0; i < 5; i++) {
            a[i]=sc.nextInt();
        }
        int r=search(a,5,s);
        System.out.println(r);
    }
}
