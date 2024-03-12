import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.next().split(":");
        int a = Integer.parseInt(input1[0]);
        int b = Integer.parseInt(input1[1]);

        String[] input2 = scanner.next().split(":");
        int c = Integer.parseInt(input2[0]);
        int d = Integer.parseInt(input2[1]);
        int f = scanner.nextInt();

        int e = (f == 1) ? (b + d - a - c) : (b + d - a - c - 1);


        if (e < 0) {
            System.out.println(0);
        } else if (f == 1 && e == 0) {
            System.out.println(1);
        } else if (f == 2 && e == 0) {
            System.out.println(0);
        } else if (f == 1) {
            System.out.println(e);
        } else {
            System.out.println(e + 1);
        }
    }
}
