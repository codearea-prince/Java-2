import java.util.Scanner;
public class temperatureCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter temp in celcius");
        int n=sc.nextInt();
        double f=n*1.8+32;
        System.out.println("temp in fahrenheit is :"+f);
    }
}
