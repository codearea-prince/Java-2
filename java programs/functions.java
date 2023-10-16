import java.util.Scanner;
public class functions {
    public static void printMyName(String name)  //function declaration(printMyName)and in bracket are argument 
                                                //of int,float double,string etc types
    {
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");    //taking input
        name=sc.next();
        printMyName(name);            //function call

    }
}