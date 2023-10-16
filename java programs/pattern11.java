public class pattern11 {
    public static void main(String[] args) {
        int i,j,num=1;
        for(i=1;i<=5;i++)
        {
            for(j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(num+" ");
            } 
            System.out.println();
            num++;
        }
    }
}
