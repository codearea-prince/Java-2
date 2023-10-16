import java.util.Scanner;
public class oddEven {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:\n");
        a=sc.nextInt();
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }  
    } 
}
