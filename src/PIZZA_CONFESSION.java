import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PIZZA_CONFESSION {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        int ans=0;
        sc.nextLine();
        for (int i = 0; i <n ; i++) {
            String s=sc.nextLine();
            arr[i]=s;
            String str=new String();
            int max=0;
            for (int j = 0; j <s.length() ; j++) {
                if (s.charAt(i)>='0' && s.charAt(i)<='9'){
                    str+=s.charAt(i);
                }
            }
            int l= Integer.parseInt(str);
            if(max<l){
                max=l;
                ans=i;
            }
        }
        String s2="";
        for (int i = 0; i <arr[ans].length() ; i++) {
            if(arr[i].charAt(i)>='a' || arr[i].charAt(i)>='A' && arr[i].charAt(i)<='z' || arr[i].charAt(i)<='Z' ){
                s2+=arr[i].charAt(i);
            }
        }
        System.out.println(s2);
    }
}
//or
class TtClass {

    private static Scanner sc =new Scanner (System.in);
    public static void main(String[] args) throws Exception {
        ArrayList<Data> data =new ArrayList<> ();
        int n = sc.nextInt ();
        for(int i=0;i<n;i++){
            data.add (new Data (sc.next (),sc.nextInt ()));
        }
        System.out.println (BubbleSort (data,n));
    }
    public static String BubbleSort(ArrayList<Data> data, int n){
        boolean swapped;
        Data temp;
        for(int i=0;i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(data.get (j).getPoints () == data.get (j+1).getPoints ()){
                    int stringEq = data.get (j).getPizza ().compareTo (data.get (j+1).getPizza ());
                    if(stringEq<0){
                        temp= data.get (j);
                        data.set (j,data.get (j+1));
                        data.set (j+1,temp);
                        swapped=true;
                    }
                }
                if(data.get (j).getPoints () > data.get (j+1).getPoints ()){
                    temp= data.get (j);
                    data.set (j,data.get (j+1));
                    data.set (j+1,temp);
                    swapped=true;
                }
            }
            break;
        }
        return data.get (n-1).getPizza ();
    }
    static class Data{
        String Pizza;
        int points;
        public Data(String pizza, int points) {
            Pizza = pizza;
            this.points = points;
        }
        public String getPizza() {
            return Pizza;
        }
        public int getPoints() {
            return points;
        }
    }
}

