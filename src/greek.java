import java.util.ArrayList;
import java.util.Scanner;

class longword1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        longword obj=new longword();
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            String str =sc.nextLine();
            obj.Long(str);
        }


    }
    public void Long(String s){
//        String st=new String();
        int l=s.length()-1;
        int count=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)==' '){
                count=0;

            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z' ){
                count++;
            }
            arr.add(count);
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.size() ; i++) {
            int b=arr.get(i);
            max=Math.max(max,b);


        }
        System.out.println(max);


    }
}