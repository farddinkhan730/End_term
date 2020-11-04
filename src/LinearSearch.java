import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch{

        }
// Java program to convert a decimal
// number to hexadecimal number

class GFG45
{
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
    static void decToHexa(int n)
    {

        char[] hexaDeciNum = new char[100];


        int i = 0;
        while(n!=0)
        {
            int temp = 0;

            temp = n % 16;

            // check if temp < 10
            if(temp < 10)
            {
                hexaDeciNum[i] = (char)(temp + 48);
                i++;
            }
            else
            {
                hexaDeciNum[i] = (char)(temp + 55);
                i++;
            }

            n = n/16;
        }

        int a1=0;
        int a2=0;
        for(int j=i-1; j>=0; j--) {
             a1=0;
             a2=0;
            if(hexaDeciNum[j]>='A' && hexaDeciNum[j]<='F'){
                int a=value(hexaDeciNum[j]);
                a1=a;
            }
            if(hexaDeciNum[j]>='0' && hexaDeciNum[j]<='9'){
                a2=(int)hexaDeciNum[j];
            }
        }
        System.out.println((a1+a2));
    }

    // driver program
    public static void main (String[] args)
    {
        int n = 27;
        decToHexa(n);
    }
}

// Contributed by Pramod Kumar
// Java program to convert hexadecimal to decimal

class GG
{
    // Function to convert hexadecimal to decimal
    static int hexadecimalToDecimal(String hexVal,String k)
    {
        int len = hexVal.length();

        // Initializing base value to 1, i.e 16^0
        int base = 1;
        int base1 = 1;

        int dec_val = 0;
        int dec_val1 = 0;

        // Extracting characters as digits from last character
        for (int i=len-1; i>=0; i--)
        {
            // if character lies in '0'-'9', converting
            // it to integral 0-9 by subtracting 48 from
            // ASCII value
            if (hexVal.charAt(i) >= '0' && hexVal.charAt(i) <= '9')
            {
                dec_val += (hexVal.charAt(i) - 48)*base;

                // incrementing base by power
                base = base * 16;
            }
            if (k.charAt(i) >= '0' && k.charAt(i) <= '9')
            {
                dec_val1 += (k.charAt(i) - 48)*base1;

                // incrementing base by power
                base1 = base1 * 16;
            }


            // if character lies in 'A'-'F' , converting
            // it to integral 10 - 15 by subtracting 55
            // from ASCII value
            else if (hexVal.charAt(i) >= 'A' && hexVal.charAt(i) <= 'F')
            {
                dec_val += (hexVal.charAt(i) - 55)*base;

                // incrementing base by power
                base = base*16;
            }
            else if (k.charAt(i) >= 'A' &&k.charAt(i) <= 'F')
            {
                dec_val1 += (k.charAt(i) - 55)*base1;

                // incrementing base by power
                base1 = base1*16;
            }
        }
        return dec_val%dec_val1;
    }

    // driver program
    public static void main (String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String hexNum = sc.nextLine();
        sc.next();
        String k=sc.nextLine();
        System.out.println(hexadecimalToDecimal(hexNum,k));

    }
}

// Contributed by Pramod Kumar
class TestClass {
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
    static int f(int n)
    {

        char[] hexaDeciNum = new char[100];


        int i = 0;
        while(n!=0)
        {
            int temp = 0;

            temp = n % 16;

            // check if temp < 10
            if(temp < 10)
            {
                hexaDeciNum[i] = (char)(temp + 48);
                i++;
            }
            else
            {
                hexaDeciNum[i] = (char)(temp + 55);
                i++;
            }

            n = n/16;
        }

        int a1=0;
        int a2=0;
        for(int j=i-1; j>=0; j--) {
            a1=0;
            a2=0;
            if(hexaDeciNum[j]>='A' && hexaDeciNum[j]<='F'){
                int a=value(hexaDeciNum[j]);
                a1=a;
            }
            if(hexaDeciNum[j]>='0' && hexaDeciNum[j]<='9'){
                a2=(int)hexaDeciNum[j];
            }
        }
        return a1+a2;
    }
    static void gcd(int x,int y){
        System.out.println(x+" "+ y);
        while(x!=y){
            if(x>y){
                x-=y;
            }
            else{
                y-=x;
            }
        }
        System.out.println(x);
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
                gcd(i,f(i));
            }
        }
    }
}
class TestClaSS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            String k = br.readLine();
            String n = br.readLine();

            String out_ = solve(k, n);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }
    static String solve(String k, String n){
        // Write your code here
        int base=1;
        int base1=1;
        int var1=0;
        int var=0;
        int l=k.length();
        int l1=n.length();
        for(int i=l-1;i>0;i--){
            if(k.charAt(i)>=0 && k.charAt(i)<=9){
                var+=(k.charAt(i)-48)*base;
                base*=16;
            }
            else{
                if(k.charAt(i)>='A' && k.charAt(i)<='F'){
                    var+=(k.charAt(i)-55)*base;
                    base*=16;
                }
            }
        }
        for(int i=l1-1;i>0;i--){
            if(n.charAt(i)>=0 && n.charAt(i)<=9){
                var1+=(n.charAt(i)-48)*base1;
                base1*=16;
            }
            else{
                if(n.charAt(i)>='A' && n.charAt(i)<='Z'){
                    var1+=(n.charAt(i)-55)*base1;
                    base1*=16;
                }
            }
        }
        int r=var1%var;
        String s="";
        if(r==10){
            s+="A";
        }
        if(r==11){
            s+="B";
        }
        if(r==12){
            s+="C";
        }
        if(r==13){
            s+="D";
        }
        if(r==14){
            s+="E";
        }
        if(r==15){
            s+="F";
        }
        return s;
    }
}

//class TestClass45 {
//    public static void main(String args[] ) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int count1=0;
//        int count2=0;
//        int N1=0;
//        int N2=0;
//        int l=0;
//        String s[]=new String[n];
//        for(int i=0;i<n;i++) {
//            s[i] = sc.nextLine();
//            l=s[i].length();
//        }
//        for (int i = 0; i <l ; i++) {
////            if (s[i]. == "19") {
//                int n1 = Integer.parseInt(s[i]);
//                N1 = n1;
//                count1++;
//
//            }
//            if (s[i] == "20") {
//                int n2 = Integer.parseInt(s[i]);
//                N2 = n2;
//                count1++;
//            }
//        }
//        int r1=N1*(4*count1);
//        int r2=N2*(4*count2);
////        if(N1==19 || N2==20){
////            if(r1>r2){
////                System.out.println("Date");
////            }
////            else{
////                System.out.println("Date");
////            }
////
////        }
////        else{
////            System.out.println("No Date");
////        }
//
//
//    }
//}
class df{
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        long sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        long max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]>0){
                sum+=a[i];
            }
        }
        System.out.println(sum+" "+ max);



    }

}
class TestClass756 {
    //    static void ratio(double r){
//        int count=0;
//        if(r>=1.6 && r<=1.7){
//            System.out.println("c " + r);
//            count++;
//        }
//        System.out.println(count);
//
//    }
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            double r = (double) w / (double) h;
            if (r >= 1.6 && r <= 1.7) {
                System.out.println("c " + r);
                count++;
            }
            System.out.println(count);

        }
    }
}

class b{
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        b obj = new b();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            b.met(s);
        }
    }

    public static void met(String str) {
        int counts=0;
        int countsj=0;
        String s="SUVO";
        String s1="SUVOJIT";
        String []str1=str.split("");
        for (int i = 0; i <str1.length ; i++) {


        }
    }
}
class match{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.next();
//        for (int i = 0; i <n ; i++) {
//            String str=sc.nextLine();
//        }
        while (n>0){
            String str=sc.nextLine();
//            if(str.matches(valid.regularExpression)){
                System.out.println("valid");
            }
//            else{
                System.out.println("INvalid");
            }
        }

//    }
//}
class valid{

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
            int n=27;
            int n1=0;
            String str=Integer.toHexString(n);
            System.out.println(str);
            for (int i = 0; i <str.length() ; i++) {
                if(str.charAt(i)>='A' && str.charAt(i)<='F' || str.charAt(i)>='a' && str.charAt(i)<='f'){
                    n1+=value(str.charAt(i));
                    System.out.println(n1);
                    System.out.println(String.valueOf(str.charAt(i)));
                }
                if(str.charAt(i)>=0 && str.charAt(i)<=9){
                    n+=Integer.parseInt(String.valueOf(str.charAt(i)));
                    System.out.println(n1);
                }
            }
            System.out.println((n+n1));
    }

}
class pk{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int neg=0;
        int a[]= new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
            if(a[i]<0){
                neg++;
            }
        }
        long sum=0;
        int ans=0;
        Arrays.sort(a);
        if(neg==a.length){
            System.out.println(a[n-1]+ " "+"1");
        }
        else{
            for (int i = n-1; i >=0 ; i--) {
                if(a[i]<0){
                    break;
                }
                else{
                    sum+=a[i];
                    ans++;
                }
            }
            System.out.println(sum+" "+ans);
        }


    }
}
