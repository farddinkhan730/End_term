import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class cut_the_sticker {
    static int[] cutTheSticks(int[] arr) {
        ArrayList<Integer> r= new ArrayList<>();
        int d[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            r.add(arr[i]);
//            Arrays.sort(arr);
//            for(int j=0;j<arr.length;j++){
//                arr[j]=arr[i]-arr[j];
//            }
//            d[i]=arr.length;
        }
        for (int i = 0; i < r.size(); i++) {
            Collections.sort(r);
            for (int j = 0; j < r.size(); j++) {
                r.add((r.get(j)-r.get(i)));
            }
            if(r.get(i).equals(0)){
                r.remove(i);
            }


        }
        return d;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
        int r[]=cutTheSticks(a);
        for (int i = 0; i <r.length ; i++) {
            System.out.println(r[i]);
        }

    }
}
class sort {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 5, 1, 2, 4, 8};
        ArrayList r = new ArrayList();
        for (int i = 0; i < r.size(); i++) {

        }
//        for (int i = 0; i < a.length; i++) {
//            Arrays.sort(a);
//            for (int j = 0; j < a.length; j++) {
//                System.out.println(a[j]-a[i]);
//            }
//        }
    }
}
