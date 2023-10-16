import java.util.Scanner;
public class funcTable
{
    public static void table(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i*n+" ");
        }
    }
    public static void main(String[] args) 
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        System.out.println("table of "+ n);
        table(n);
    }
}