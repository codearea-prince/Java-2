import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        int radius;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius\n");
        radius=sc.nextInt();
        double area = 3.14 * radius * radius;
        System.out.print("radius of corcle is:"+area);   
    }  
}
