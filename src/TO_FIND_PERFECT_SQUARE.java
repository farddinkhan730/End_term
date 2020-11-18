import java.util.LinkedList;
import java.util.Scanner;

public class TO_FIND_PERFECT_SQUARE {
    public static void square(int a,int b){
        int count=0;
        int x=1;
        while(x*x<a) x++;
        while(x*x<=b) {
            count++;
            x++;
        }
//        for (int i = a; i <=b ; i++) {
//            String str=String.valueOf(i);
//            if(str.charAt(str.length()-1)=='6'){
//                if(Integer.parseInt(String.valueOf(str.charAt(str.length()-2)))%2!=0){
//                    count++;
//                }
//            }
//            else if(str.charAt(str.length()-1)=='4' || str.charAt(str.length()-1)=='9'){
//                if(Integer.parseInt(String.valueOf(str.charAt(str.length()-2)))%2==0){
//                    count++;
//                }
//            }
//            else if(str.charAt(str.length()-1)=='5'){
//                if(str.charAt(str.length()-2)=='2'){
//                    count++;
//                }
//            }
//        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();

        while(q-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            square(a,b);
        }
    }
}
class link{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String s = sc.nextLine();
            boolean pallindrome=false;
            for(int i=0;i<s.length()/2;i++){
                if(s.charAt(i)==s.charAt(s.length()-1-i)){
                    pallindrome=true;
                }
            }
            int count=0;
            if(pallindrome){
                System.out.println(0);
            }
            else{
                for(int i=0;i<s.length()/2;i++){
                    if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                        s+=s.charAt(i);
                        count++;
                    }
                }
                System.out.println(s);
                System.out.println(count);
            }
        }
    }
}
class miniadd
    {
    /* Returns length of LCS for X[0..m-1],
       Y[0..n-1]. See http://goo.gl/bHQVP for
       details of this function */
        static int lcs( String X, String Y, int m, int n )
        {
            int L[][] = new int[m+1][n+1];
            int i, j;

        /* Following steps build L[m+1][n+1] in
           bottom up fashion. Note that L[i][j]
           contains length of LCS of X[0..i-1]
           and Y[0..j-1] */
            for (i=0; i<=m; i++)
            {
                for (j=0; j<=n; j++)
                {
                    if (i == 0 || j == 0)
                        L[i][j] = 0;

                    else if (X.charAt(i-1) == Y.charAt(j-1))
                        L[i][j] = L[i-1][j-1] + 1;

                    else
                        L[i][j] = Integer.max(L[i-1][j], L[i][j-1]);
                }
            }

        /* L[m][n] contains length of LCS for
           X[0..n-1] and Y[0..m-1] */
            return L[m][n];
        }

        // LCS based function to find minimum number
        // of insersions
        static int findMinInsertionsLCS(String str, int n)
        {
            // Using StringBuffer to reverse a String
            StringBuffer sb = new StringBuffer(str);
            sb.reverse();
            String revString = sb.toString();

            // The output is length of string minus
            // length of lcs of str and it reverse
            return (n - lcs(str, revString , n, n));
        }

        // Driver program to test above functions
        public static void main(String args[])
        {
            String str = "geeks";
            System.out.println(
                    findMinInsertionsLCS(str, str.length()));
        }
    }

