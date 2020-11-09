import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class sub_array_division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[n]=sc.nextInt();
        }
        int d=sc.nextInt();
        int m=sc.nextInt();
        int count=0;

        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = i; j < m+i-1; j++) {
                sum+=a[j];
                if(sum==d)
                    count++;
            }
        }
    }
}
class ddf{
    static int birthday(List<Integer> s, int d, int m) {
        int sum = 0,ways=0;
        for (int i=0;i<m;i++){
            sum += s.get(i);
        }
        for (int i=0;i<s.size()-m+1;i++) {
            if (sum==d) {
                ways++;
                System.out.println(sum +" i sum==d "+i);
            }
            if (i+m <s.size()){
                sum =sum-s.get(i)+s.get(i+m);
                System.out.println(sum+ "i "+i);
            }
        }
        return ways;
    }
    // Complete the birthday function below.
    // static int birthday(List<Integer> s, int d, int m) {
    //      int count=0;

    //     for (int i = 0; i < s.size(); i++) {
    //         int sum=0;
    //         for (int j = i; j < m; j++) {
    //             sum+=s.get(j);
    //             if(sum==d)
    //                 count++;
    //         }
    //     }
    //     return count;


    // }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
class sub_divi{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                if(j==i){
                    continue;
                }
                else if(i<j && (a[i]+a[j])%k==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
class bill_division{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int bill[]=new int[n];
        for (int i = 0; i <n ; i++) {
            bill[i]=sc.nextInt();
        }
        int b=sc.nextInt(),sum=0;

        for (int i = 0; i <n ; i++) {
            if(i==k){
                continue;
            }
            else if(i!=k){
                sum+=bill[i];
            }
        }
        int hb=sum/2;
        if(b==hb){
            System.out.println("Bon Appetit");
        }
        else if(b!=hb && b>hb){
            int c=b-hb;
            System.out.println(c);
        }
        else if(b!=hb && b<hb){
            int c1=hb-b;
            System.out.println(c1);
        }
    }
}

