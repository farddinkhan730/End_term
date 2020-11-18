import java.math.BigInteger;
import java.util.Scanner;

public class Big_Integer {
//    static Big_Integer extraLongFactorials(int n) {
//        Big_Integer s=new Big_Integer("1");
//        for(int i=0;i<n;i++){
//            n=n*(n-i);
//        }
//        System.out.println();
//
//    }
    static void extraLongFactorials(int N)
    {
        // Initialize result
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE

        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));

        System.out.println(f);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}
