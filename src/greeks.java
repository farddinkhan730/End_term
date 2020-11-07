import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//public class greeks {
//}
class TestClass41556 {
    static int value(char c){
        int A=0;
        if(c=='A')
        {
            A=10;
        }
        if(c=='B'){
            A=11;
        }
        if(c=='C'){
            A=12;
        } if(c=='D'){
            A=13;
        }
        if(c=='E'){
            A=14;
        }
        if(c=='F'){
            A=15;
        }
        return A;

    }
    static int f(int n) {
        int n1 = 0;
        String str = Integer.toHexString(n);
//        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'F' || str.charAt(i) >= 'a' && str.charAt(i) <= 'f') {
                n1 += value(str.charAt(i));
//                System.out.println(n1);
            }
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                n += Integer.parseInt(String.valueOf((int) str.charAt(i)));
//                System.out.println(n1);
            }
        }
        return n1;
    }
        // char[] hexaDeciNum = new char[100];
        // int i = 0;
        // while(n!=0)
        // {
        //     int temp = 0;

        //     temp = n % 16;

        //     // check if temp < 10
        //     if(temp < 10)
        //     {
        //         hexaDeciNum[i] = (char)(temp + 48);
        //         i++;
        //     }
        //     else
        //     {
        //         hexaDeciNum[i] = (char)(temp + 55);
        //         i++;
        //     }

        //     n = n/16;
        // }

        // int a1=0;
        // int a2=0;
        // for(int j=i-1; j>=0; j--) {
        //      a1=0;
        //      a2=0;
        //     if(hexaDeciNum[j]>='A' && hexaDeciNum[j]<='F'){
        //         int a=value(hexaDeciNum[j]);
        //         a1=a;
        //     }
        //     if(hexaDeciNum[j]>='0' && hexaDeciNum[j]<='9'){
        //         a2=(int)hexaDeciNum[j];
        //     }
        // }


    static void gcd(int x,int y){
        while(x!=y){
            if(x>y){
                x-=y;
            }
            else{
                y-=x;
            }
        }
        if(x>1){
            System.out.println(x);
        }

    }
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for( int j=0;j<t;j++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            for(int i=l;i<r;i++){
                int x=f(i);
                gcd(i,x);
            }
        }
    }
}
class validhtrye{

    //        public static final String regularExpression="[SUVO][SUVOJIT]" ;
    static int value(char c){
        int A=0;
        if(c=='A' || c=='a')
        {
            A=10;
        }
        if(c=='B'||c=='b'){
            A=11;
        }
        if(c=='C'|| c=='c'){
            A=12;
        } if(c=='D'||c=='d'){
            A=13;
        }
        if(c=='E'||c=='e'){
            A=14;
        }
        if(c=='F'||c=='f'){
            A=15;
        }
        return A;

    }
    public static void main(String[] args) {
        int n=12;
        int n1=0;
        String str=Integer.toHexString(n);
        System.out.println(str);
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)>='A' && str.charAt(i)<='F' || str.charAt(i)>='a' && str.charAt(i)<='f'){
                n1+=value(str.charAt(i));
                System.out.println(n1);
            }
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                n+=Integer.parseInt(String.valueOf((int)str.charAt(i)));
                System.out.println(n1);
            }
        }
        System.out.println((n1));
    }

}
class array{
    public static void main(String[] args) {

        System.out.println(4^5);
        System.out.println(27);

    }
}

class GFG78521
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = 0, res = 0;
            n = sc.nextInt();

            int x;
            for(int i = 1; i < n; i++)
            {
                x = sc.nextInt();
                res = res^x;
                System.out.print("x "+res+" ");
                res = res^i;
                System.out.print("i "+res+" ");

            }
            System.out.println(res^n);

        }
    }
}
class Merge{
    public static void merge(int arr1[], int arr2[], int n, int m)
    {
        int s=m+n;
        int j=0;
        int r[]=new int[s];
        for(int i=0;i<s;i++){
            if(i<n){
                r[i]=arr1[i];
            }
            else if(i>=n){
                r[i]=arr2[j];
                j++;
            }
        }
//        Arrays.sort(r);
        for (int i = 0; i <s ; i++) {
            for (int k = 0; k <s ; k++) {
                if(r[i]<r[k]){
                    int temp=r[i];
                    r[i]=r[k];
                    r[k]=temp;
                }
            }
        }
        for (int i = 0; i < s; i++) {
            System.out.println(r[i]);
        }

    }

    public static void main(String[] args) {
        int N = 4;
        int arr1[] = {1 ,3 ,5 ,7};
        int m = 5;
        int  arr2[] = {0, 2, 6, 8, 9};
        merge(arr1,arr2,N,m);
    }
}
class Sorting
{
    public static void main (String[] args) throws IOException {
       Scanner sc=new Scanner(System.in);
        int t = sc.nextInt(); //Inputting the testcases
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr1[] = new int[n];
            int arr2[] = new int[m];
            for(int i=0; i<n; i++){
                arr1[i] = sc.nextInt();
            }
            for(int i=0; i<m; i++){
                arr2[i] = sc.nextInt();
            }

            new MergeSort4().merge(arr1, arr2, n, m);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class MergeSort4
{
    // Function to merge the two sorted arrays
    // arr1[], arr2[]: two input arrays
    // n, m: size of arr1[] and arr2[] respectively
    public static void merge(int arr1[], int arr2[], int n, int m)
    {
        int s=m+n;
        int j=0;
        int a1[]=new int[n];
        int a2[]=new int[m];
        int r[]=new int[s];
        for(int i=0;i<s;i++){
            if(i<n){
                r[i]=arr1[i];
            }
            else if(i>=n){
                r[i]=arr2[j];
                j++;
            }
        }
//        Arrays.sort(r);
        for (int i = 0; i <s ; i++) {
            for (int k = 0; k <s ; k++) {
                if(r[i]<r[k]){
                    int temp=r[i];
                    r[i]=r[k];
                    r[k]=temp;
                }
            }
        }
        j=0;
        for(int i=0;i<s;i++){
            if(i<n){
                a1[i]=r[i];
            }
            else if(i>=n){
                a2[j]=r[i];
                j++;
            }
        }
        for (int i = 0; i <n; i++) {
            System.out.print(a1[i] +" ");
        }
        for(int i=0;i<m;i++){
            System.out.print(a2[i]+" ");
        }
        System.out.println();

    }
}