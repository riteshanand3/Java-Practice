import java.util.*;

public class Evenodd {
    public static void main(String args[]) {
        System.out.println("Enter a nubmer");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");

        }
    }
    
}
