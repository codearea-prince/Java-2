import java.util.Scanner;

public class function {
    public static double func(double x,double n)
    {
        double ans=(Math.pow(x,n));
        return ans;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x,n;
    System.out.println("enter x");
    x=sc.nextInt();
    System.out.println("enter n");
    n=sc.nextInt();
    System.out.println("the x raised to power n is : "+ func(x,n));
    }

    
}
