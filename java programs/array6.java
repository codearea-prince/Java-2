import java.util.Scanner;
public class array6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int colmn=sc.nextInt();
        int numbers[][]=new int[rows][colmn];
        System.out.println("enter elements");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<colmn;j++)
            {
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("elements are :- ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<colmn;j++)
            {
               System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
        
