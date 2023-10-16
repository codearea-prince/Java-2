import java.util.Scanner;
public class prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;

        while(num!=0){
            int a=num /10;
            sum=sum+a;
        }
        System.out.println("the sum of digits :"+sum);
        sc.close();
    }
    
}
