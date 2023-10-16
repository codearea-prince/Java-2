import java.util.Scanner;
    public class arrMaxMin10 {
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
            int max = numbers[0];
            int min = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                max = Math.max(max, numbers[i]);
                min = Math.min(min, numbers[i]);
            }

    System.out.println("Maximum Value: " + max);
    System.out.println("Maximum Value: " + min);
  } 
    
}
