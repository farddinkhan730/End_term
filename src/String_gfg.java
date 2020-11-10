import java.util.ArrayList;
import java.util.Scanner;

public class String_gfg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        int len = s.length();
        int fact = 1;
        while (len > 0) {
            fact *= len;
        }
        String s1 = "";
        StringBuffer str[] = new StringBuffer[fact];
        boolean visited[] = new boolean[fact];
        boolean check = false;
        for (int j = 0; j < fact; j++) {
            for (int i = len - 1; i >= 0; i--) {
                if (len > 0) {
                    char temp = c[i];
                    c[i] = c[i--];
                    c[i--] = temp;
                    int k = 0;
                    while (k > 0) {
                        s1 += c[k];
                        k++;
                    }
                }
                str[j].append(s1);
                visited[j] = true;
            }
        }
        System.out.println(str[0]);
    }
}
class pallindrome{
    static void printSubStr(String str, int low, int high)
    {
        System.out.println(str.substring(low, high + 1));
    }

    // This function prints the longest
    // palindrome substring of str[].
    // It also returns the length of the
    // longest palindrome
    static int longestPalSubstr(String str)
    {
        // get length of input string
        int n = str.length();

        // table[i][j] will be false if
        // substring str[i..j] is not palindrome.
        // Else table[i][j] will be true
        boolean table[][] = new boolean[n][n];

        // All substrings of length 1 are palindromes
        int maxLength = 1;
        for (int i = 0; i < n; ++i)
            table[i][i] = true;

        // check for sub-string of length 2.
        ArrayList<String> result=new ArrayList<>();
        ArrayList<Integer> result1=new ArrayList<>();
        int start = 0;
        for (int i = 0; i < n - 1; ++i) {
            String string="";
            if (str.charAt(i) == str.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
                string+=str.charAt(i);
                string+=str.charAt(i+1);
                result.add(string);
                result1.add(start);
            }
        }
        int index=0;
        for (int i = 0; i <result.size() ; i++) {
            if(result.get(i).length()==result.get(i+1).length()){
                index=result.indexOf(result.get(i));
                break;
            }
        }
        start=result1.get(index);



        // Check for lengths greater than 2.
        // k is length of substring
        for (int k = 3; k <= n; ++k) {

            // Fix the starting index
            for (int i = 0; i < n - k + 1; ++i) {
                // Get the ending index of substring from
                // starting index i and length k
                int j = i + k - 1;

                // checking for sub-string from ith index to
                // jth index iff str.charAt(i+1) to
                // str.charAt(j-1) is a palindrome
                if (table[i + 1][j - 1]
                        && str.charAt(i) == str.charAt(j)) {
                    table[i][j] = true;

                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        printSubStr(str, start,(start + maxLength - 1));

        // return length of LPS
        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t12=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <t12 ; i++){
            String str = sc.nextLine();
            longestPalSubstr(str);

        }
//        boolean t = false;
//        int l = str.length() - 1;
//        for (int i = 0; i < str.length()/2; i++) {
//            t = false;
//            if (str.charAt(i) == str.charAt(l)) {
//                t = true;
//                l--;
//            }
//        }
//        if(t==true){
//            System.out.println(str+" p");
//        }
//
//        boolean t1=false;
//        String s=new String();
//        String arr[]=new String[l];
//        if(t==false){
//            for (int i = 1; i < str.length(); i++) {
//                l=str.length()-1;
//                t1=false;
//                s="";
//                for (int j = i; j <=str.length()/2 ; j++) {
//                    if (str.charAt(j) == str.charAt(l)) {
//                        t1 = true;
//                        l--;
//                        s+=str.charAt(j);
//                        System.out.println(s);
//                    }
//                }
//                if(t1==true){
//                    arr[i]=s;
//                }
//            }
//        }
//        for (int i = 1; i <arr.length ; i++) {
//            System.out.println(arr[i] + " p1");
//        }
    }
}
