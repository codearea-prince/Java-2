import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,gcd=1;
        System.out.println("enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
            }
        }
        System.out.println("the gratest common divisor of " + a +" and "+ b +" is : "+ gcd);
    }
}
