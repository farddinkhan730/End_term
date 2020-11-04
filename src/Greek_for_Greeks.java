import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Greek_for_Greeks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int N = sc.nextInt();
            int S = sc.nextInt();
            int arr[] = new int[N];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            Greek_for_Greeks obj = new Greek_for_Greeks();
//            obj.sumOFArray(N, S, arr);

        }

    }
}
//sub array of given  sum
class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            findSubArray(n, s, m);
        }
    }

    private static void findSubArray(int n, int s, int[] m) {
        int first = 0;
        int last = 0;

        long result = m[first];

        while (result != s) {
            if (result > s) {
                if (first == last) {
                    last++;
                    first++;
                    if (last >= n) break;
                    result = m[first];
                } else {
                    result -= m[first];
                    first++;
                }
            } else {
                last++;
                if (last < n) {
                    result += m[last];
                } else {
                    break;
                }
            }
        }

        if (result != s) {
            System.out.println(-1);
        } else {
            System.out.println((first + 1) + " " + (last + 1));
        }
    }
}
class longword{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        longword obj=new longword();
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            String str =new String(sc.nextLine());
            obj.Long(str);
        }


    }
    public void Long(String s){
//        String st=new String();
        int l=s.length()-1;
        int count=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)==' '){
                count=0;

            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z' ){
                count++;
            }
            arr.add(count);
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.size() ; i++) {
            int b=arr.get(i);
            max=Math.max(max,b);


        }
        System.out.println(max);


    }
}
class missingelementinarray{
    public static void miss_Element(int []a,int n){
        int sum=0;
        int b=0;
        for (int i = 1; i <=n ; i++) {
            sum+=i;
        }
        System.out.println(sum);
        for (int i = 1; i <a.length ; i++) {
            b=a[i];
            sum-=b;
            System.out.println(a[i]);
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int arr[]=new int[n-1];
            for (int j = 1; j < n; j++) {
                arr[i]=sc.nextInt();
            }
            miss_Element(arr,n);

        }
    }
}
class s{
    public static void main(String[] args) {
        int res=0;
        int x=5;
        res=res^x;
        System.out.println(res);
    }
}
/*Given an array C of size N-1 and given that there are numbers from 1 to N with one element missing, the missing number is to be found.

Input:
The first line of input contains an integer T denoting the number of test cases. For each test case first line contains N(size of array). The subsequent line contains N-1 array elements.

Output:
Print the missing number in array.

Constraints:
1 ≤ T ≤ 200
1 ≤ N ≤ 107
1 ≤ C[i] ≤ 107

Example:
Input:
2
5
1 2 3 5
10
1 2 3 4 5 6 7 8 10

Output:
4
9

Explanation:
Testcase 1: Given array : 1 2 3 5. Missing element is 4. */

class GFG2
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
                res = res^i;

            }
            System.out.println(res^n);

        }
    }
}
/* inner reducing pattern
  ex-:  4444444
    4333334
    4322234
    4321234
    4322234
    4333334
    4444444
 */
class Pattern {

    // function to compute pattern
    public static void innerPattern(int n)
    {
        // Pattern Size
        int size = 2 * n - 1;
        int front = 0;
        int back = size - 1;
        int a[][] = new int[size][size];
        while (n != 0) {
            for (int i = front; i <= back; i++) {
                for (int j = front; j <= back;
                     j++) {
                    if (i == front || i == back ||
                            j == front || j == back)
                        a[i][j] = n;
                }
            }
            ++front;
            --back;
            --n;
        }
        print(a, size);
    }

    // function to Print pattern
    public static void print(int a[][], int size)
    {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    // Main Method
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt(); // Input
        innerPattern(n);
    }
}
// Tough series 1^2 * 2! + 2^2 *3! + ............n^2 *(n-1)!  and p=(sum-2)/n! t=1 n=4 1 2 3 5 output =10
class series{
    public static void result(int n){
        int sum=0;
        for (int i = 1; i < n; i++) {
            sum+=Math.pow(i,2)*fact(i+1);

        }
        System.out.println(sum);
        int p=(sum-2)/fact(n);
        System.out.println(p);

    }
    public static int fact(int f){
        int fact1=1;
        if(f==1){
            return fact1;
        }
        else
            for (int i = 1; i <f+1 ; i++) {
                fact1*=i;
            }
        return fact1;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            result(n);
        }
    }

}
class p45 {
    public static void main(String[] args) {

        for (int k = 0; k < 20; k = k + 2) {

            if (k % 3 == 1)

                System.out.print(k + " ");

        }
        System.out.print("Hello");
        System.out.println("Geeks!");
        System.out.print(20 + 1.34f + "A" + "B");
        int a = 20, b = 10, c = 5;
        if ((a >> 1 == b) && (b << 1 == a))  // line 1
            System.out.print("Possible");
        else
            System.out.print("Not Possible");
        int i = 0, j = 9;
        do {
            i++;
            if (j-- < i++) {
                break;
            }
        } while (i < 5);
        System.out.println(i + "" + j);
    }
}

class Replace{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            GfG g=new GfG();
            g.convertFive(n);
        }
    }
}// } Driver Code Ends


/*Complete the function below*/
class GfG{
    public static void convertFive(int n){
//add code here.
        String s=String.valueOf(n);
        System.out.println(s.replace('0','5'));

    }
}
class PalindromicArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0 ;i < n; i++)
                a[i]=sc.nextInt();
            GfG4 g = new GfG4();
            System.out.println(g.palinArray(a , n));
        }
    }
}// } Driver Code Ends


/*Complete the Function below*/
class GfG4 {
    public static int palinArray(int[] a, int n) {

        int i,no=0,r=0,NO ;

        for(i=0;i<n;i++)
        {
            no=a[i] ;
            NO=0 ;
            while(no!=0)
            {
                r=no%10 ;
                NO=NO*10+r ;
                no=no/10 ;
            }
            if(NO!=a[i]){
                break ;
            }
        }

        if(i!=n)
            return 0 ;
        return 1;

    }
}
//        int s = 0;
//        int i;
//        for (i = 0; i < n; i++) {
//            s = a[i];
//            int rev = 0;
//            int v = 0;
//            while (s != 0) {
//                v = s % 10;
//                rev = (rev * 10) + v;
//                s /= 10;
//            }
//            if (s != rev) {
//                break;
//            }
//        }
//        if (i != n)
//            return 0;
//        return 1;
//    }
//

class Parent
{
    void show(int p) { System.out.print(p+" "); }
    void print(int q){
        System.out.print(q+" ");
    }
}


class Main45
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int p=sc.nextInt();
            int q=sc.nextInt();
            int r=sc.nextInt();
            int s=sc.nextInt();
            Parent obj1 = new Parent();
            obj1.show(p);
            obj1.print(q);
            Parent obj2 = new Child();
            obj2.show(r);
            obj2.print(s);
        }
    }
}
//User function Template for Java


class Child extends Parent
{
    @Override
    void show(int p) { System.out.print(p+" "); }

    @Override
    void print(int q)
    {
        //Add your code here.
        System.out.print(q*q +" ");
        String s="43546576578576335264265454362";
        long v=Integer.parseInt(s);

    }
}

class Numbers{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i = 0; i < n; i++)
            {
                a[i]=sc.nextInt();
            }
            int k=sc.nextInt();
            GfG74 g=new GfG74();
            System.out.println(g.num(a,n,k));
        }
    }
}// } Driver Code Ends


/*Complete the Function below*/
class GfG74
{
    public static int num(int a[], int n, int k)
    {
        String d="";
        String K=String.valueOf(k);
        int count=0;
        for(int i=0;i<n;i++){
            d+=String.valueOf(a[i]);
        }
        for (int i = 0; i <d.length() ; i++) {
            if(K.charAt(0)==d.charAt(i)){
                count++;
            }
        }
        return count;
        //Your code here
    }
}
class lk{
    public static void main(String[] args) {
        int d[]=new int[26];

        char s='b'-'a';
        int a=d[s]++;
        System.out.println(a);
        System.out.println(s);
        if('1'=='1'){
            System.out.println("same");

        }
        System.out.println();

    }
}
class gfg
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            if(n==1)
            {
                String s=sc.next();
                GenericClass<String> Str=new GenericClass<String>(s);
                Str.showType();
            }
            else
            {
                Integer p=sc.nextInt();
                GenericClass<Integer> integer=new GenericClass<Integer>(p);
                integer.showType();
            }
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class GenericClass<T> {
    T x;
    public GenericClass(T x){
        this.x=x;
    }
    public void showType(){
        if(x instanceof String) {
            System.out.println("String");
            System.out.println(x);
        }
        if(x instanceof Integer) {
            System.out.println("Integer");
            System.out.println(x);
        }

    }


}
class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int count = 0;

        int primecount = 0;
        long start=System.currentTimeMillis();
        for (int i = 2; i <= k; i++) {

            count = 0;
            for (int l = i; l >= 1; l--) {

                if (i % l == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primecount++;
            }
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
            System.out.println(primecount);
        }
    }


class PrimeNumbers
{
    public static void main (String[] args)
    {
        int i =0;
        int num =0;
        int primeNumbers = 0;
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        long s= System.currentTimeMillis();
        for (i = 1; i <= k; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;

                }
            }
            if (counter ==2)
            {
               primeNumbers++;

            }
        }
        long end=System.currentTimeMillis();
        System.out.println(end-s);

        System.out.println(primeNumbers);
    }
}
class prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        for (int i = 2; i <=k; i++) {


        }
    }

}
class GFGl
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            Geeks obj = new Geeks();
            obj.SumArray(arr, n);
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// arr is the array
// n is the number of element in array
class Geeks
{
    public static void SumArray(int arr[], int n)
    {
        // your code here
        int result[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                else{

                    result[i]+=arr[j];
                }
            }

        }
        for(int i=0;i<n;i++){
            System.out.print(result[i] +" ");
        }
    }
}
// MERGE SORT PROG
class MergeSort {
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
        int count=0;
        count++;
        System.out.println("merge function call l" + l + " m " +m + " r " +r+" arr " + arr.length +" c " + count);
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        int count=0;
        count++;
        System.out.println("sort function call l" + l +" r " +r+" arr " + arr.length +" c " + count);
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;
            System.out.println("m "+ m);

            // Sort first and second halves
            sort(arr, l, m);
            System.out.println("m "+ m);
            sort(arr, m + 1, r);
            System.out.println("m "+ m);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}
class ArrayList_Collection
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            ArrayList<Integer> A = new ArrayList<Integer>();
            int q = sc.nextInt();

            while(q>0)
            {
                char c = sc.next().charAt(0);
                GfGp g = new GfGp();
                if(c == 'a')
                {
                    int x = sc.nextInt();
                    g.add_to_ArrayList(A,x);
                }

                if(c == 'b')
                    g.sort_ArrayList_Asc(A);

                if(c == 'c')
                    g.reverse_ArrayList(A);

                if(c == 'd')
                    System.out.print(g.size_Of_ArrayList(A)+" ");

                if(c == 'e')
                    g.print_ArrayList(A);

                if(c == 'f')
                    g.sort_ArrayList_Desc(A);

                q--;
            }
            T--;
            System.out.println();
        }
    }
}// } Driver Code Ends


/*You are required to complete below methods*/

class GfGp
{
    /*inserts an element x at
    the back of the ArrayList A */
    void add_to_ArrayList(ArrayList<Integer> A, int x)
    {
        A.add(A.size()-1,x);
        // Your code here

    }

    /*sort the ArrayList A in ascending order*/
    void sort_ArrayList_Asc(ArrayList<Integer> A)
    {
        // Your code here
        Collections.sort(A);
        System.out.println(A);
    }

    /*reverses the ArrayList A*/
    void reverse_ArrayList(ArrayList<Integer> A)
    {
        // Your code here
        Collections.reverseOrder();
    }

    /*returns the size of the ArrayList A */
    int size_Of_ArrayList(ArrayList<Integer> A)
    {
        // Your code here
        return A.size();
    }

    /*sorts the ArrayList A in descending order*/
    void sort_ArrayList_Desc(ArrayList<Integer> A)
    {
        // Your code here
        Collections.sort(A,Collections.reverseOrder());
    }

    /*prints space separated
    elements of ArrayList A*/
    void print_ArrayList(ArrayList<Integer> A)
    {
        System.out.println(A);
    }
}
