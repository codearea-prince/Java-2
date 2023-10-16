import java.util.Scanner;

public class array8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter size");
        n=sc.nextInt();
        String names[]=new String[n];
        System.out.println("enter names in array :");
        for(int i=0;i<n;i++)
        {
            names[i]=sc.nextLine();
        }
        System.out.print("names in array are :");
        for(int i=0;i<n;i++)
        {
            System.out.println(names[i]);

        }

    }
}
