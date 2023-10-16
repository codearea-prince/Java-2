import java.util.Scanner;
public class calculator
{
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        a=sc.nextInt();
        System.out.println("enter b");
        b=sc.nextInt();
        char opr;
        System.out.println("enter operation");
        opr=sc.next().charAt(0);

        switch(opr){
            case '+':
            System.out.print("the addition of a and b is: "+ (a+b));
            break;
            case '-':
            System.out.print("the subtraction of a and b is: "+ (a-b));
            break;
            case '*':
            System.out.print("the multiplication of a and b is: "+ (a*b));
            break;
            case '/':
            System.out.print("the division of a and b is: "+ (a/b));
            break;
            case '%':
            System.out.print("the modulo of a and b is: "+ (a%b));
            break;
            default:
            System.out.print("invalid operation");

        }
    }
}