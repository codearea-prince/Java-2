import java.util.Scanner;
public class vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.println("enter character");
        ch=sc.next().charAt(0);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("it is a vowel");
        }
        else
        {
            System.out.println("it is not a vowel");
        }

    }
    
}
