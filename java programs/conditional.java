import java.util.Scanner;
public class conditional {
    public static void main(String[] args)
    {
        int age;
        Scanner sc = new Scanner(System.in); 
        System.out.print("enter age:\n");
        age=sc.nextInt();
        if(age>18)
        {
            System.out.print("you are adult");
        }
        else{
            System.out.print("not adult");
        }
    }
}
