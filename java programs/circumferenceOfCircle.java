import java.util.Scanner;

public class circumferenceOfCircle {
    public static double circum(double radius)
    {
        double pi=3.14;
        double circumference = 2*pi*radius;
        return circumference;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius");
        double radius=sc.nextDouble();
        System.out.println("circumference is "+circum(radius));
}
}
