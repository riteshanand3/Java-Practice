import java.util.*;

public class SumFunction {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("Sum of two numbers is: " + sum);
    }
}
