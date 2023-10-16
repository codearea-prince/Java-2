import java.util.Scanner;
public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        float marks[]=new float[size];   //0.0 is store if float
        for(int i=0;i<=size;i++)         //0 is store if int 
        {
            System.out.println(marks[i]);
        }
    }
}
