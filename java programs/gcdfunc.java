import java.util.Scanner;

public class gcdfunc {
    public static int gcd(int a,int b)
    {
        int gcd=1;
        for(int i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
            }
        }
        return gcd;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("the greatest common divisor of "+a+" and "+ b +" is : "+ gcd(a,b));
    }
    
}
