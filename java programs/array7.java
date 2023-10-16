import java.util.Scanner;
public class array7 {
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
        System.out.println("enter element to be search");
        int a=sc.nextInt();
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<colmn;j++)
            {
                if(a==numbers[i][j])
               System.out.print("element is at index : " + i + ","+ j);
            }
        }
    }
}
        
