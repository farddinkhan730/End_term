import java.awt.geom.AffineTransform;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class sales_by_match {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int count=0;
        boolean idx[]=new boolean[n];
        for (int i = 0; i <n ; i++) {

            for (int j = 0; j < n; j++) {
                if(i==j){
                    continue;
                }
                else if(a[i]==a[j] && !idx[j] && !idx[i]){
                    count++;
                    idx[i]=true;
                    idx[j]=true;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
class counting_vally{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        sc.nextLine();
        String s1=sc.nextLine();
        String p[]=s1.split("");
//        for (int i = 0; i < p.length; i++) {
//            System.out.println(p[i]);
//        }
//        for (int i = 0; i <s ; i++) {
//            p[i]=sc.nextLine();
//        }
        int cu=0;
        int cd=0;
        int i=0;
        for ( i = 0; i <p.length; i++) {
            if (p[i].equalsIgnoreCase("U")) {
                cu++;
            }
            if (p[i].equalsIgnoreCase("D")) {
                cu--;
            }

            if (cu == 0 && p[i].equalsIgnoreCase("U")) {
                ++cd;
            }
        }

            System.out.println(cd);
    }
}
class SampleDemo implements Runnable {
    private Thread t;
    private String threadName;

    SampleDemo(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        while (true) {
            System.out.println(threadName);
        }
    }

    public void start() {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}
class TestThread{
    public static void main(String[] args) {
        SampleDemo A=new SampleDemo("A");
        SampleDemo B= new SampleDemo("B");
        B.start();
        A.start();
    }
}
class Election_shop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int n=sc.nextInt();
        int m=sc.nextInt();
        Integer k[]=new Integer[n];
        int d[]=new int[m];
        for (int i = 0; i < n; i++) {
            k[i]= sc.nextInt();
        }
        for (int i = 0; i <m ; i++) {
            d[i]=sc.nextInt();
        }
        Arrays.sort(k, Collections.reverseOrder());
        Arrays.sort(d);

        int max=-1;
        int ans=0;
        for (int i = 0; i < n; i++) {
            for (int j=0; j < m; j++) {
                if(k[i]+d[j]>b) break;
                if(k[i]+d[j]>max)
                    max=k[i]+d[j];
            }
        }
        System.out.println(max);
    }
}
class Solution789456 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        Integer[] keyboards = new Integer[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] pendrives = new int[m];
        for(int pendrives_i=0; pendrives_i < m; pendrives_i++){
            pendrives[pendrives_i] = in.nextInt();
        }

        Arrays.sort(keyboards, Collections.reverseOrder());//Descending order
        Arrays.sort(pendrives);//Ascending order

        int max = -1;
        for(int i = 0, j = 0; i < n; i++){
            for(; j < m; j++){
                if(keyboards[i]+pendrives[j] > s) break; //This prevents j from incrementing
                if(keyboards[i]+pendrives[j] > max)
                    max = keyboards[i]+pendrives[j];
            }
        }
        System.out.println(max);
    }
}