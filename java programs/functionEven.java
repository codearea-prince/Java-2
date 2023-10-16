import java.util.Scanner;
public class functionEven {
    public static int evenOdd(int n)
    {
        if(n%2==0)
        return 1;
        else
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("enter a number");
        n=sc.nextInt();
       // functionEven ob=new functionEven();
        if(evenOdd(n)==1)
        System.out.println("even number");
        else
        System.out.println("odd number");
    }
    
}
