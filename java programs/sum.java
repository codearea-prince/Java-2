import java.util.Scanner;
public class sum {
    public static int calculateSum(int a,int b)
    {
        int sum = a+b;
        return sum;

    }
    public static void main(String[] args) {
        int a,b;
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        a=sc.nextInt();
        System.out.println("enter second number");
        b=sc.nextInt();
        sum = calculateSum(a,b);
        System.out.println(sum);
    }
    
}
