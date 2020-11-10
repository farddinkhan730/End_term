import java.util.Scanner;

class GFG78 {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            sc.next();
            String str=sc.nextLine();

            String str1="";
            String s[]=str.split(".");
            for (int i = 0; i <s.length ; i++) {
                System.out.print(s[i]+" ");
            }
            for(int i=s.length-1;i>=0;i--){
                str1+=s[i] + ".";
            }
            System.out.println(str1);
        }
    }
}
class stringreverse{
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        int t = sx.nextInt();
        sx.nextLine();
        while (t-- > 0) {
            String str = sx.nextLine();
            String ans = "";
            int i = str.length() - 1;
            while (i > 0) {
                while (i > 0 && str.charAt(i) == '.') i--;
                int j = i;
                if (j < 0) break;
                while (i >= 0 && str.charAt(i) != '.') i--;
                if (ans.isEmpty()) {
                    ans += str.substring(i + 1, j + 1);
                } else {
                    ans = ans.concat("." + str.substring(i + 1, j + 1));
                }

            }
            System.out.println(ans);
        }
    }
}