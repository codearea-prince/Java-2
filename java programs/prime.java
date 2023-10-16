import java.util.Scanner;
public class prime {
    public static int primeNo(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
        if(n%i==0)
        count++;
        }
        if(count==2)
        return 1;
        else
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,count=0;
        System.out.println("enter a number");
        n=sc.nextInt();
        prime ob=new prime();
        if(ob.primeNo(n)==1)
        System.out.println("prime number");
        else
        System.out.println("not a prime number");  
    }
   
}
