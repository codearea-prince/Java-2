import java.util.Scanner;
public class prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;

        while(num!=0){
            num=num /10;
            count++;
        }
        System.out.println("the number of digits :"+count);
        sc.close();
    }
    
}
