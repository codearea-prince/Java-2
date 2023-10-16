import java.util.Scanner;
public class funcAvg {
    public static int avg(int a,int b,int c)
    {
        int avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("the average of three numbers is "+ avg(a,b,c));
    }
}
