import java.util.ArrayList;
import java.util.Scanner;

class charrector{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);

        char s1=sc.next().charAt(0);
        if(s<s1){
            System.out.println(s+" "+ s1);

        }
        else{
            System.out.println(s1+" "+s);
        }
    }
}
class vc{
    public static void main(String[] args) {

        ArrayList<Integer> a=new ArrayList();
        for (int i = 10; i <=99 ; i++) {
            int c=0;
            for (int j = 1; j <=i; j++) {
                if (i % j == 0) {
//                    c=1;
//                    break;
                    c++;

                }
//                else{
//                    c=0;
//                }
            }
            if (c == 2) {
                a.add(i);
            } else {
                continue;
            }
        }
        System.out.println(a);
//  to add the digits given in a inputed number   and reverse a number
        int n=982367;
        int rem=0;
        int k=0;
        while(n!=0){
            k=n%10;
            rem=rem+k;
//            System.out.println(k);  //use when you want to reverse a number
//            n=n/10;
        }
        System.out.println(rem);
    }
}
// to find !st largest  2nd largest and 1st smallest 2nd smallest number from aaray
class dfll{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max1, max2, min1, min2;
        max1 = max2 = Integer.MIN_VALUE;
        min1 = min2 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];

            } else if (a[i] > max2) {
                max2 = a[i];
            }
        }
        System.out.println(max1 + " " + max2);
        for (int i = 0; i < n; i++) {
            if (a[i] < min1) {
                min2 = min1;
                min1 = a[i];

            } else if (a[i] < min2) {
                min2 = a[i];
            }
        }
        System.out.println(min1+" "+min2);

    }
}
//          or
class largesmall{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a[]=new int[s];
        for (int i = 0; i <s; i++) {
            a[i]=sc.nextInt();
        }
        int first,second,third,forth;
        first=second=third=forth=0;
        for (int i = 0; i <s; i++) {
            if (a[i] > first) {
                first = a[i];
            }
        }
        for (int i = 0; i < s; i++) {


            if (a[i] > second && a[i] < first) {
                second = a[i];
            }
        }
        for (int i = 0; i <s ; i++) {
            if (a[i] > third && a[i] < second) {
                third = a[i];
            }
        }
        for (int i = 0; i < s; i++) {
            if(a[i]>forth && a[i]<third){
                forth=a[i];
            }
        }
        System.out.println(first+" "+ second+" "+ third+" "+forth);
    }
}
class bubbbleshort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
//        for (int i = 0; i <n ; i++) {
//            for (int j = i+1; j < n; j++) {
//                if(a[i]<a[j]){
//                    int temp=a[j];
//                    a[j]=a[i];
//                    a[i]=temp;
//                }
//            }
//        }
//                  or
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
//        to remove duplicate ellement from array

        int r[]=new int[n];
        for (int i = 0; i <n ; i++) {
            if (a[i] == a[i+1]) {
                r[i] = a[i];
            } else {
                r[i] = a[i];

            }

        }


        for (int i = 0; i <n ; i++) {
            System.out.println(a[i]+ " ");
        }
        for (int i = 0; i <r.length ; i++) {
            System.out.println("r "+r[i]+" ");
        }
    }
}

class reversematrix{
    public static void main(String[] args) {
        int[][] a={{1,2},{3,4}};
        for (int i = a.length-1; i >0 ; i--) {
            for (int j = a.length-1; j >0; j--) {
                System.out.print(a[i][j] + " ");
        }
            System.out.println();

        }
    }
}