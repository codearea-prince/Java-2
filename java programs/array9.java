import java.util.Scanner;
public class array9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int numbers[]=new int[size];  
        System.out.println("enter numbers:-"); 
        for(int i=0;i<size;i++)         
        {           
            numbers[i]=sc.nextInt();
        }
        System.out.println("your numbers are:");
        for(int i=0;i<size;i++)
        {
            System.out.println(numbers[i]);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]<min)
            {
                min=numbers[i];
            }
            if(numbers[i]>max)
            {
                max=numbers[i];
            }
        }
        System.out.println("largest number is : "+ max);
        System.out.println("smallest number is : "+ min);
    }
}
