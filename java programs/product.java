import java.util.Scanner;
public class product {
    public static int calculateProduct(int a,int b)
    {
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        int a,b,product;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        a=sc.nextInt();
        System.out.println("enter second number");
        b=sc.nextInt();
        product = calculateProduct(a, b);
        System.out.println("the product of 2 number is :"+ product);
    }
    
}
