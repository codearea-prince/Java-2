import java.util.Scanner;
public class array10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int num[]=new int[size];  
        System.out.println("enter num:-"); 
        for(int i=0;i<size;i++)         
        {           
            num[i]=sc.nextInt();
        }
        System.out.println("your num are:");
        for(int i=0;i<size;i++)
        {
            System.out.println(num[i]);
        }
        boolean isAscending=true;
        for(int i=0;i<num.length-1;i++)
        {
            if(num[i]>num[i+1])
            {
                isAscending=false;  
            }
        }
        if(isAscending)
        System.out.println("ascending oder");
        else
        System.out.println("not in ascending order");
    }   
}
