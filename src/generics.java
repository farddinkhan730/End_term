//public class generics {
//}

import javax.swing.*;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.net.SecureCacheResponse;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Printer
{
    public <E> void printArray(E[] a){
        for(E i:a){
            System.out.println(i);
        }

    }


}

class Solution7 {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}
class d{


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] A = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] ARowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int AItem = Integer.parseInt(ARowItems[j]);
                A[i][j] = AItem;
            }
        }
        int max = Integer.MIN_VALUE;
        System.out.println(max);
        for (int i = 0; i < 6 - 2; i++) {
            for (int j = 0; j < 6 - 2; j++) {
                final int res = (
                        A[i    ][j] + A[i    ][j + 1] + A[i    ][j + 2]
                                +               A[i + 1][j + 1]
                                + A[i + 2][j] + A[i + 2][j + 1] + A[i + 2][j + 2]
                );
                if (res > max) { max = res; }
            }}
        System.out.println(max);

        scanner.close();
    }
}
// Q java Arraylist

//class b{
//    public static final Scanner sc=new Scanner(System.in);
//    public static ArrayList<Integer> l = new ArrayList<>();
//    public static ArrayList<Integer> s = new ArrayList<>();
//    public static ArrayList r=new ArrayList<>();
//    public static void main(String[] args) {
//        l();
//        for(int i=0;i<r.size();i++){
//            System.out.println(r.get(i));
//        }
//    }
//    public static void l(){
//        int n=sc.nextInt();
//        for(int i=0;i<n;i++) {
//            int d = sc.nextInt();
//            for (int j = 0; j < d; j++) {
//                l.add(sc.nextInt());
//            }
//            s();
//            if(l.contains(l.get(s.get(1)))){
//                r.add(l.get(s.get(1)));
//            }
//            else{
//                r.add("ERROR!");
//            }
//            System.out.println(r);
//            l.clear();
//        }
//
//    }
//    public static void s(){
//        int q=sc.nextInt();
//        for(int i=0;i<q;i++) {
//            for(int j=0;j<2;j++){
//                s.add(sc.nextInt());
//            }
//            break;
//        }
//
//    }
//}
class f{
//    public static boolean canWin(int leap, int[] g) {
//        // Return true if you can win the game; otherwise, return false.
//        boolean s=false;
//          for(int i=0;i<g.length;i++) {
//              if(i+1 >= leap || i+leap >= g.length){
//                  s=true;
//                  break;
//              }
//              if(i-1 >= 0  && g[i-1] == 0){
//                  s=true;
//              }
////             i = leap + i;
////            if (i > g.length - 1 || g[i]!=1 && g[i]==0) {
////                s= true;
////                break;
////            }
////            else{
////                s=false;
////                break;
////            }
////              if(i+leap>g.length-1 || g[i+leap]==0){
////                  if(i-1==0){
////                      if(i+1==0){
////                          s=true;
////                      }
////                      else s=false;
////                  }
////                  else s=false;
////              }
////              else if(i+1==0){
////                  s=true;
////              }
////              else if(i+leap>g.length-1){
////                  s=true;
////              }
//              else s=false;
//          }
//
//        return s;
//
//
//    }
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int q = scan.nextInt();
//        while (q-- > 0) {
//            int n = scan.nextInt();
//            int leap = scan.nextInt();
//
//            int[] game = new int[n];
//            for (int i = 0; i < n; i++) {
//                game[i] = scan.nextInt();
//            }
//
//            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
//        }
//        scan.close();
//    }
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int T = scn.nextInt();
    while(T-- > 0){
        int n = scn.nextInt(), m = scn.nextInt();
        int arr[] = new int[n];
        boolean visited[] = new boolean[n];
        for(int i = 0;i<n;++i){
            arr[i] = scn.nextInt();
            visited[i] = false;
        }
        visited[0] = true;
        boolean res = false;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int v = q.poll();
            System.out.println("v = "+v);
            System.out.println("q = "+q);
            if(v+1 >= n || v+m >= n){
                res = true;
                System.out.println("v = "+v);
                break;
            }
            if(v-1 >= 0 && !visited[v-1] && arr[v-1] == 0){
                visited[v-1] = true;
                q.add(v-1);
                System.out.println("v = "+v);
            }
            if(v+1 < n && !visited[v+1] && arr[v+1] == 0){
                visited[v+1] = true;
                q.add(v+1);
                System.out.println("v = "+v);
            }
            if(v+m < n && !visited[v+m] && arr[v+m] == 0){
                visited[v+m] = true;
                q.add(v+m);
                System.out.println("v = "+v);
            }
            System.out.println("q = "+q);
        }
        System.out.println(res ? "YES" : "NO");
    }
}
}
class l{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=0;
        int[][] r=new int[d][];
        for(int i=0;i<n;i++){
            d=sc.nextInt();
        }
        int q=sc.nextInt();
     //   ArrayList<Integer> l=new ArrayList<>();
        int k1=0;
        for(int k=k1;k<k1+1;k++){
            for(int j =0;j<d;j++) {
                r[k][j] = sc.nextInt();
            }
            k1++;
        }

        int s[]=new int[2];
        for(int i=0;i<q;i++){
            s[i]=sc.nextInt();
            break;
        }
        int k=0;
        for(int i=0;i<s[k];i++){
            k++;
            for(int j=0;j<s[k];j++){
                System.out.println(r[i][j]);

            }
        }
    }
}

class p{
    public static void main(String[] args) {
        ArrayList l=new ArrayList<>();
        l.add(23);
        l.add(31);
        l.add(455);
        System.out.println(l);
        l.add(3,22);
        l.remove(0);
        System.out.println(l);
    }
}

class Solu {

    public static void main(String[] args) {
        List l=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        int q=sc.nextInt();
        int x=0;
        int y=0;
        int d=0;
        String s=new String();
        for(int i=0;i<q;i++){
            sc.nextLine();
            s=sc.nextLine();
            System.out.println(s);
            if(s.equals("Insert")){
                x=sc.nextInt();
                y=sc.nextInt();
                l.add(x,y);
            }
            if(s.equals("Delete")){
                d=sc.nextInt();
                l.remove(d);
            }
            System.out.println(l);
        }
        System.out.println(l);
    }
}
//class Student{
//    private int id;
//    private String fname;
//    private double cgpa;
//    public Student(int id, String fname, double cgpa) {
//        super();
//        this.id = id;
//        this.fname = fname;
//        this.cgpa = cgpa;
//    }
//    public int getId() {
//        return id;
//    }
//    public String getFname() {
//        return fname;
//    }
//    public double getCgpa() {
//        return cgpa;
//    }
//}
//
//class lution
//{
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());
//
//        List<Student> studentList = new ArrayList<>();
//        while(testCases>0){
//            int id = in.nextInt();
//            String fname = in.next();
//            double cgpa = in.nextDouble();
//
//            Student st = new Student(id, fname, cgpa);
//            studentList.add(st);
//
//            testCases--;
//        }
//        public int compare()
//
//
//        for(Student st: studentList){
//            System.out.println(st.getFname());
//        }
//    }
//}

class tion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        sc.nextLine();
        String b=sc.nextLine();
        BigInteger A=new BigInteger(a);
        BigInteger B=new BigInteger(b);
        BigInteger  r=A.add(B);
        BigInteger  r1=A.multiply(B);
        System.out.println(r);
        System.out.println(r1);

    }
}
class ion{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        BigDecimal a[] = new BigDecimal[n];
        for(int i = 0; i < n ; i++){
            a[i] =new BigDecimal(s[i]);
        }
        for(int i = 0; i < n ; i++){
            System.out.println(a[i]);
        }
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n; j++){
                if(a[i].compareTo(a[j]) == -1){
                    BigDecimal temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
//        for(int i=0;i<n;i++)
//        {
//            s[i] = a[i].toString();
//        }

        //Write your code here

        //Output
        for(int i=0;i<n;i++)
        {
            s[i] = a[i].toString();
            System.out.println(s[i]);
        }
    }
}




class on {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            BigDecimal max = new BigDecimal(s[i]);
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                BigDecimal curr = new BigDecimal(s[j]);
                if (curr.compareTo(max) == 1) {
                    max = curr;
                    idx = j;
                }
            }
            String temp = s[i];
            s[i] = s[idx];
            s[idx] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }

    }

}
class n {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger b=new BigInteger(n);
        boolean b1=false;
//        for(int i=0;i<Integer.parseInt(n);i++){
            b1=b.isProbablePrime(1);
//                b1=true;
//            }
//        }
        if(b1){
            System.out.println("Prime");

        }
        else{
            System.out.println("Not Prime");
        }
        scanner.close();
    }
}
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    static Scanner sc=new Scanner(System.in);
    public static final String regularExpression=m();
    public static String m(){
        String s=sc.nextLine();
        if(s.length()<8 && s.length()>30){
//                System.out.println("Invalid");
            return s;
        }

        else if(s.length()>=8 && s.length()<=30 && s.charAt(0)>='a' && s.charAt(0)<='z' && s.charAt(0)>='A' && s.charAt(0)<='Z'){
//            System.out.println("valid");
            return s;
        }
        else {
            return s;
//            System.out.println("Invalid");
        }
    }


}


class i {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
class ol
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            try {
//                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException exception) {
                System.out.println("Invalid");
                //System.err.println(exception.getDescription());

            }

        }
    }
}
class UsernameValidator1 {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression ="^[a-zA-Z][\\w]{7,29}$";
}

class lu {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator1.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
class d2{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        String a = A.substring(0, 1), b = B.substring(0, 1);
        a = a.toUpperCase();
        b = b.toUpperCase();
        System.out.println((A.length() + B.length()));
        int b2=A.compareTo(B);
        if (b2>0) {
            System.out.println("Yes");
            /* Enter your code here. Print output to STDOUT. */

        } else{
            System.out.println("No");
        }
        System.out.println(a+A.substring(1,A.length()) +" " + b+B.substring(1,B.length()));
    }

}
class ln {



    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);


        String s=scan.nextLine();


        //Complete the code


        s = s.trim();
        System.out.println(s);


        if (s.length()>400000){


            return ;


        }else if (s.length()==0){


            System.out.println(0);


            return ;


        }else{


            String[] words = s.split("[!,?.*_'@\\ ]+");
            for(int i=0;i< words.length;i++){
                System.out.print(words[i]);
            }


            int count = words.length;


            System.out.println(count);


            for(String word : words){


                System.out.println(word);


            }


        }


    }


}
class Sol {

        public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases > 0) {
            String pattern = in.nextLine();
            try {
//                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }

            testCases--;
        }
    }

}

class uton{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i=1;
        while(in.hasNext()){
            String IP = in.next();

            System.out.println(i + "=" + IP.matches(new MyRegex().pattern));
//            System.out.println(Pattern.matches("\\d*.\\d*.\\d*.\\d*","12.456.78.147"));
            i++;
        }

    }
}
//
//Write your code here
class MyRegex{
//    static String pattern="\\d+.\\d+.\\d+.\\d+";
    	String pattern="^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

}
class q{
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        System.out.println(meal_cost+ " "+ tip_percent+" "+ tax_percent);
        double tip=  (meal_cost*tip_percent)/100;
         double tax= (meal_cost*tax_percent)/100;
        System.out.println(tip +" "+ tax);
        double total= meal_cost+tip+tax;
        System.out.println(Math.round(total));


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
class Sports{

    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
//        super.getNumberOfTeamMembers();
        System.out.println("Each team has 11 players in " + this.getName());
    }
    // Write your overridden getNumberOfTeamMembers method here

}

class lion{

    public static void main(String []args){
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
    }
}
class Student{}
class Rockstar{   }
class Hacker{}


class InstanceOFTutorial {

    static  String count(ArrayList mylist) {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < mylist.size(); i++) {
            Object element = mylist.get(i);
            if(element instanceof Student)
                a++;
            if(element instanceof Rockstar)
                b++;
            if(element instanceof Hacker)
                c++;
        }
        String ret = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
        return ret;
    }

    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if (s.equals("Student")) mylist.add(new Student());
            if (s.equals("Rockstar")) mylist.add(new Rockstar());
            if (s.equals("Hacker")) mylist.add(new Hacker());
        }
        System.out.println(count(mylist));
    }
}
class Main{

    static Iterator func(ArrayList mylist){
        Iterator it=mylist.iterator();
        while(it.hasNext()){
            Object element = it.next();
            if(element instanceof String) {
                //Hints: use instanceof operator


                break;
            }
        }
        return it;

    }
    @SuppressWarnings({ "unchecked" })
    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0;i<n;i++){
            mylist.add(sc.nextInt());
        }

        mylist.add("###");
        for(int i=0;i<m;i++){
            mylist.add(sc.next());
        }

        Iterator it=func(mylist);
        while(it.hasNext()){
            Object element = it.next();
            System.out.println((String)element);
        }
    }
}
class fw{

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int s1=scan.nextInt();
        double t=scan.nextDouble();
        scan.nextLine();
        String u=scan.nextLine();
        System.out.println((s1+i));
        System.out.println((t+d));
        System.out.println(s+u);

        scan.close();
    }
}


class Soln {

    // Complete the factorial function below.
    static int factorial(int n) {
        int n1=0;
        if(n>0){
            n1=n*factorial(n-1);
        }

        return n1;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}






