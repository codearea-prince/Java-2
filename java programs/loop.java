import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n=sc.nextInt();
        int count_p=0;
        int count_z=0;
        int count_n=0;
        int num[]=new int[n]; 
        System.out.println("enter numbers in array");
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("numbers are :");
        for(int i=0;i<n;i++)
        {
            System.out.println(num[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(num[i]>0)
            count_p = count_p+1;
        }
        System.out.println("the number of positive numbers are "+ count_p);
        for(int i=0;i<n;i++)
        {
            if(num[i]==0)
            count_z = count_z+1;
        }
        System.out.println("the number of zero are "+ count_z);
        for(int i=0;i<n;i++)
        {
            if(num[i]<0)
            count_n = count_n+1;
        }
        System.out.println("the number of negative numbers are "+ count_n);
    }
    
}
