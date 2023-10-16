import java.util.*;
public class bubbleSort {
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
       for(i=0;i<size-1;i++)
       {
        for(j=0;j<size-1-i;j++)
        {
            if(a[j]>a[j+1])
           { int temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
           }
           
        }
        }
        System.out.println("sorted array is as follows : ");
        for(i=0;i<size;i++){
        System.out.println(a[i]);
        }
    }
}
