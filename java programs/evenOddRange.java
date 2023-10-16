import java.util.Scanner;

public class evenOddRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int range;

        System.out.print("Enter the range of numbers: ");
        range = input.nextInt();

        System.out.println("Even numbers:");
        for (int i = 1; i <= range; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nOdd numbers:");
        for (int i = 1; i <= range; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}