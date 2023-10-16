import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int c,r,sum=0;
        c=n;
        while(n>=1)
        {
            r=n%10;
            sum += (Math.pow(r,3));
            n=n/10;
        }
        if(sum==c)
        {
            System.out.println("armstrong number");

        }
        else{
            System.out.println("not an armstrong number");
        }
    }
}
