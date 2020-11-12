import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Solution {

    // Complete the beautifulDays function below.
    static  void beautifulDays(int i, int j, int k) {
        ArrayList rem=new ArrayList();

        for(int l=i;l<=j;l++){
            String str="";
            int l1=l;
            while(l1!=0){
                str+=String.valueOf((l1%10));
                l1/=10;
            }
            rem.add(str);
        }
        int n=0;
        int count=0;
        for(int l=i;l<=j;l++){
            if(Math.abs(i-Integer.parseInt((String) rem.get(n)))%k==0){
                count++;
            }            n++;
        }
        System.out.println(count);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i = scanner.nextInt();

        int j = scanner.nextInt();

        int k = scanner.nextInt();

         beautifulDays(i, j, k);
    }
}
class Solutionn {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int count = 0;

        for (int a=i;j>a; a++){
            StringBuilder temp = new StringBuilder();
            temp.append(a);
            temp=temp.reverse();
            String temp1 = temp.toString();
            int aRev = Integer.parseInt(temp1);
            if(Math.abs((a-aRev)%k)==0){
                count++;
            }
        }

        System.out.println(count);
    }
}