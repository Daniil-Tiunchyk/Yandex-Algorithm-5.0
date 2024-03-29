package homework_4.A_RangeQuery;

import java.util.Arrays;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        int K = scanner.nextInt();
        int[][] queries = new int[K][2];
        for (int i = 0; i < K; i++) {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
        }

        Arrays.sort(array);

        for (int i = 0; i < queries.length; i++) {
            int L = leftBound(array, queries[i][0]);
            int R = rightBound(array, queries[i][1]);
            int count = R - L;
            System.out.print(count + (i < queries.length - 1 ? " " : "\n"));
        }
    }

    private static int leftBound(int[] array, int L) {
        int low = 0, high = array.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (array[mid] < L) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    private static int rightBound(int[] array, int R) {
        int low = 0, high = array.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (array[mid] <= R) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}