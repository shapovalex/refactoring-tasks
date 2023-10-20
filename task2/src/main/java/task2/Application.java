package task2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Application {
    public static void main(String[] args) {
        System.out.println("Enter command: ");
        Scanner s1 = new Scanner(System.in);
        String c = s1.next();
        System.out.println("Enter numbers: ");
        Scanner s2 = new Scanner(System.in);
        int n1 = s2.nextInt();
        int n2 = s2.nextInt();
        boolean s = false;
        if (c.equals("SUM")) {
            s = true;
            System.out.println(n1 + n2);
        }
        if (c.equals("MUL")) {
            s = true;
            System.out.println(n1 * n2);
        }
        if (c.equals("FAC")) {
            s = true;
            System.out.println(IntStream.range(1, n1 + 1).reduce(1, (a, b) -> a * b));
        }
        if (!s) {
            System.out.println("Error!");
        }
    }
}
