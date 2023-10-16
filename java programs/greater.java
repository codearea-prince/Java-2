import java.util.Scanner;
public class greater {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of a:\n");
        a=sc.nextInt();
        System.out.print("enter value of b:\n");
        b=sc.nextInt();
        if(a>b)
        {
            System.out.print("a is greater");
        }
        else if(a==b){
            System.out.print("both are equal");
        }
        else{
            System.out.print("a is lesser");
        }

    }
}
    
