import java.util.Scanner;

public class Task_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            sum += k / 4 + Math.min(k % 4, 2);
        }

        System.out.println(sum);
    }
}
