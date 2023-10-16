import java.util.Scanner;
public class fib {
    public static int fibon(int n)
    {
        if(n==0)
        return 0;
        if(n==1 || n==2)
        return 1;
        else
        return fibon(n-1) + fibon(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter n");
        n=sc.nextInt();
        System.out.println("the fibonacci of "+ n +" is : "+ fibon(n));
    }
}
