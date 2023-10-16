import java.util.Scanner;
public class array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int marks[]=new int[size];  
        System.out.println("enter marks:-"); 
        for(int i=0;i<size;i++)         
        {           
            marks[i]=sc.nextInt();
        }
        System.out.println("your marks are:");
        for(int i=0;i<size;i++)
        {
            System.out.println(marks[i]);
        }
    }
    
}
