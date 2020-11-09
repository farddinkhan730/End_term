import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.reducing;
import static java.util.stream.Collectors.toList;

public class remove_recursively_duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.length()==1 ||str.length()==0){
            System.out.println(str);
        }
        String s[]=str.split("");
        ArrayList<Integer> a=new ArrayList();
        for(int i=0;i<s.length;i++){
            String r=s[i];
            for (int j = i+1; j < s.length; j++) {
                if (r.equalsIgnoreCase(s[j])) {
                    a.add(j);
                }
            }
        }
        String ans="";
        for (int i = 0; i < s.length-1; i++) {
            if(i!=a.get(i)){
                ans+=s[i];
            }
            else {
                continue;
            }
        }
        System.out.println(ans);
    }
}
class canelcase{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str[]=s.split("");
        
    }
}
class mmnp{

    static void shift(char[] c1, char[] c2, int n, int m, int k, int len){
        for (int i = n; i <=m ; i++) {
            int idx=(i+k)%len;
            c2[idx]=c1[i];
        }
//        c2[len]='\0';

        for (int i = 0; i <c2.length ; i++) {
            System.out.print(c2[i]);
        }
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            int len=s.length();
            System.out.println(len);
            int n=sc.nextInt();
            int m=sc.nextInt();
            char[] str=s.toCharArray();
            char c[]=new char[s.length()];
            shift(str,c ,n,m,2,len);
        }

    }
}
class Sion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int count=0;
        while(n1!=n2){
            if(n1>n2){
                n1=n1-n2 ;
                count++;
            }
            else if(n2>n1){
                n2=n2-n1;
                count++;
            }
        }
        System.out.println(n1);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d\n", s1, x);
        }
        System.out.println("================================");

    }
}
class hj{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }

        int f = lcm(a);
        int l = gcd(b);
        int count = 0;
        for(int i = f, j =2; i<=l; i=f*j,j++){
            if(l%i==0){ count++;}
        }
        System.out.println(count);
    }


    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }

    private static int gcd(int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = gcd(result, input[i]);
        }
        return result;
    }

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    private static int lcm(int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = lcm(result, input[i]);
        }
        return result;
    }
}

