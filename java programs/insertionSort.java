import java.util.*;
public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elemnets");
        int size=sc.nextInt();
        int i,j;
        int a[]=new int[size];
        System.out.println("enter elements in array :");
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("elements in array :");
        for(i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }
        for(i=1;i<size;i++)
        {
            int temp=a[i];
            j=i-1;
            while(j>=0 && temp<a[j])
            {
                a[j+1]=a[j];
                j-- ;

            }
            a[j+1]=temp;
        }
        System.out.println("sorted array is as follows : ");
        for(i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
           
        }
        System.out.println();
       
    }
}