package task1;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int a[] = new int[l];
        for (int i = 0; i < l; i++) {
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        int r = 0;
        for (int i = 0; i < l - 1; i++) {
            if (a[i] == a[i+1]) {
                r += 1;
            }
        }
        int m = 0;
        for (int i = 0; i < l; i++) {
            m = m + a[i];
        }
        m = m / l;
        System.out.println(r + " " + m);
    }
}
