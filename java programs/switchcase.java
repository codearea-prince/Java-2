import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        int button;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter button");
        button = sc.nextInt();
        switch(button){
            case 1:
            System.out.print("hello");
            break;
            case 2:
            System.out.print("namaste");
            break;
            case 3:
            System.out.print("Bonjour");
            break;
            default:
            System.out.print("Invalid");
        
        }

    }
    
}
