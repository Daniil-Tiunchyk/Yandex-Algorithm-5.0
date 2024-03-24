package homework_3.C_RemoveNumbers;

import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] count = new int[100001];

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            count[num]++;
        }

        int maxPairCount = 0;
        for (int i = 0; i < count.length - 1; i++) {
            maxPairCount = Math.max(maxPairCount, count[i] + count[i + 1]);
        }

        System.out.println(n - maxPairCount);
    }
}
