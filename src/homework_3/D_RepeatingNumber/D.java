package homework_3.D_RepeatingNumber;

import java.io.*;
import java.util.*;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);

        String[] secondLine = br.readLine().split(" ");
        System.out.println(hasRepeatingWithinK(secondLine, k) ? "YES" : "NO");
    }

    private static boolean hasRepeatingWithinK(String[] numbers, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(numbers[i]);

            if (map.containsKey(num) && i - map.get(num) <= k) {
                return true;
            }

            map.put(num, i);
        }

        return false;
    }
}