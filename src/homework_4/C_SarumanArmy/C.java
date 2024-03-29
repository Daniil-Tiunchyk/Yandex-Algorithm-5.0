package homework_4.C_SarumanArmy;

import java.util.*;
import java.io.*;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] orcs = new long[n + 1];
        st = new StringTokenizer(reader.readLine());
        for (int i = 1; i <= n; i++) {
            orcs[i] = orcs[i - 1] + Long.parseLong(st.nextToken());
        }

        while (m-- > 0) {
            st = new StringTokenizer(reader.readLine());
            int l = Integer.parseInt(st.nextToken());
            long s = Long.parseLong(st.nextToken());

            int result = binarySearch(orcs, l, s);
            writer.println(result);
        }

        reader.close();
        writer.flush();
        writer.close();
    }

    private static int binarySearch(long[] orcs, int l, long s) {
        int low = 1;
        int high = orcs.length - l;
        int startIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long sum = orcs[mid + l - 1] - orcs[mid - 1];

            if (sum == s) {
                startIndex = mid;
                break;
            } else if (sum < s) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return startIndex;
    }
}