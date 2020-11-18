import java.util.InputMismatchException;
import java.util.Scanner;

public class exception_handling {
        public static void main(String args[]){
            try{
                int res=50/0;
            }
            catch(ArithmeticException e)
            {System.out.println(e);}
            System.out.println("rest of the code...");
        }
}
class A{
    public static void main(String args[]){
        int a,b,result;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Numerator and Denominator");
        try{
            a=s.nextInt();    //InputMismatchException may occur
            b=s.nextInt();  //InputMismatchException may occur
            result=a/b;     //ArithmeticException may occur
            System.out.println("Result:"+result); }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Only numbers are accepted");
        }//End of catch
    }//End main
} //End class
class InvalidAgeException extends Exception
{
    InvalidAgeException(String s)
    {
        super(s);
    }
}
class TestCustomException1{
    static void validate(int age)throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("not valid");
        else
            System.out.println("welcome to vote");
    }
    public static void main(String args[]){
        try{
            validate(13);
        }catch(InvalidAgeException m){System.out.println("Exception occured: "+m);}
        System.out.println("rest of the code...");
    }
}

class assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        try {
            for (int i = 0; i < n; i++) {
                int j = sc.nextInt();
                System.out.println(a[j]);
            }
        } catch (IndexOutOfBoundsException m) {
            System.out.println(m.getClass().getName());
            m.printStackTrace();
        }
    }
}

class exc{
        public static void main(String[] args) {
            try{
                int i=Integer.parseInt(args[0]);
                System.out.println(i);
            }
//            System.out.println("Main method");
            catch(NumberFormatException e){
                System.out.println(e);
            }
        }
    }
class code{
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
            System.out.println(args[2]);
        }
        catch (Exception obj){
            obj.printStackTrace();
        }
        System.out.println("End of the Main Method");
    }
}

