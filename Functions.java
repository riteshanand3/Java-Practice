import java.util.*;

public class Functions {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String args) {

        Scannner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);// call function
    }

}
