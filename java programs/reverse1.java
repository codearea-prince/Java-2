import java.util.Scanner;
public class reverse1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int n,rem,rev=0;
    System.out.println("enter a number: ");
    n=sc.nextInt();
    while(n!=0)
    {
        rem = n%10;
        rev = rev * 10 + rem; 
        n= n/10;

    }
    System.out.println(rev);
}
}