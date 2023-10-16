import java.util.Scanner;

public class func1 {
    public static int ageVote(int age)
    {
        if(age>18)
        System.out.println("eligible for vote ");
        else 
        System.out.println("not eligible for vote");
        return 1;

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter age");
    int age=sc.nextInt();
    ageVote(age);
    }  
}
