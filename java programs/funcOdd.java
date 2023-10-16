import java.util.Scanner;
public class funcOdd {
    public static int sumOfOdd(int n)
    {
        int i,sum=0;
        for(i=1;i<=n;i++)
        {
            if(i%2==1)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,sum;
        System.out.println("enter number");
        n=sc.nextInt();
        System.out.println("the sum of numbers is "+ sumOfOdd(n));

    }
    
}
