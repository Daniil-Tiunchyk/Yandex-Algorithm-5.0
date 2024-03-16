package homework_1.A_Pokraska_derevyev;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int p, v, q, m;
        p = scanner.nextInt();
        v = scanner.nextInt();
        q = scanner.nextInt();
        m = scanner.nextInt();

        int result = 2 * (v + m + 1) - Math.max(0, Math.min(p + v, q + m) - Math.max(p - v, q - m) + 1);
        System.out.println(result);
    }
}
