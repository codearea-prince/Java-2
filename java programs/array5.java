import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int number[]=new int[size];  
        System.out.println("enter numbers:-"); 
        for(int i=0;i<size;i++)         
        {           
            number[i]=sc.nextInt();
        }
        System.out.println("enter number to be search");
        int a=sc.nextInt();
        for(int i=0;i<size;i++)         //we can also write "number.length" in place of size                                //which also means size of array
                                        //which also means size of array    
        {
            if(a==number[i])
            System.out.println("number is at index : "+ i);
        }
    }
    
}
