import java.util.*;

class data{
    public String s;
    public int id;
    data(String s,int id){
        this.id=id;
        this.s=s;
    }
    @Override
    public String toString(){
        return s+" "+id;
    }
}
class sortbyid implements Comparator<data>{

    @Override
    public int compare(data o1, data o2) {
        if(o1.id>o2.id){
            return 1;
        }
        if(o1.id<o2.id){
            return -1;
        }
        return 0;

    }
}
class sortbyname implements Comparator<data>{

    @Override
    public int compare(data o1, data o2) {
        return o1.s.compareTo(o2.s);
    }
}
public class sort_by_using_comparable {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        List<data> arr=new ArrayList<>();
        for (int i0 = 0; i0 <3 ; i0++) {
            arr.add(new data(sc.next(), sc.nextInt()));
        }
        Collections.sort(arr, new sortbyname());
        System.out.println(arr.get(0).s);
    }
}
