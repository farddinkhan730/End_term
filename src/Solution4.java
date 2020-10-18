import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution4 {

    // Complete the camelcase function below.
    static int camelcase(String s) {
        String [] str=new String[s.length()];
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') {
                        str[i] += s.charAt(j);
                    }
                    if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') {
                        i++;
                        str[i] += s.charAt(j);
                    }
                }
                i--;
            }

            for (int i = 0; i < s.length(); i++) {
                System.out.println(str[i]);
            }
            int re = str.length;

        return re;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result =camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

class Solution5 {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean visited[] = new boolean[a.length()];
        boolean isanagram = false;
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                isanagram = false;
                if(c>='A' && c<='Z'){
                    int temp=(int)c;
                    c=(char)(temp+32);
                }
                for (int j = 0; j < b.length(); j++) {
                    char v=b.charAt(j);
                    if(b.charAt(j)>='A' && b.charAt(j)<='Z'){
                        int temp=(int)b.charAt(j);
                        v=(char)(temp+32);
                    }

                    if (v == c && !visited[j]) {
                        isanagram = true;
                        visited[j] = true;
                        break;
                    }
                }
                if (!isanagram) {
                    break;
                }
            }
        }

        return isanagram;
    }
        public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
class Solution6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String [] str=new String[s.length()];
        int count=0;
        // Write your code here.
        int j=0;
        for(int i=0;i<str.length;i++){
            str[i]="";
        }
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)==39){
                j++;
            }
            if((int)s.charAt(i)>=33 && (int)s.charAt(i)<=47 || (int)s.charAt(i)>=58 && (int)s.charAt(i)<=64 || (int)s.charAt(i)>=91 && (int)s.charAt(i)<=96 || (int)s.charAt(i)>=123 && (int)s.charAt(i)<=127){
                count++;

                continue;
            }

            if(s.charAt(i)!=' '){
                str[j]+=s.charAt(i);
            }
            if(s.charAt(i)==' ' ){
                j++;
                count++;
            }
            }
        System.out.println(count-1);
        for(int i=0;i<count-1;i++){
            System.out.println(str[i]);
        }
        scan.close();
    }
}


