//public class string {
//}
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class Solution1 {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        StringBuffer S=new StringBuffer(s);
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                if(S.charAt(i)==(S.charAt(j))){
                    S.deleteCharAt(i);
                    S.deleteCharAt(j);
                }
            }
        }
        return s;


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
