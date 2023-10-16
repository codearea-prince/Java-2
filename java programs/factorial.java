import java.util.Scanner;
public class factorial {
    public static int fact(int n)
    {
        if(n==0 || n==1)
        return 1;
        else
        return n * fact(n-1);
       
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        n=sc.nextInt();
        System.out.println("the factorial of a number is : "+ fact(n));
    }

}