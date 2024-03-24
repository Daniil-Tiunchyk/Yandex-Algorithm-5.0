package homework_3.B_AnagramChecker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String second = br.readLine();

        System.out.println(areAnagrams(first, second) ? "YES" : "NO");
    }

    public static boolean areAnagrams(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        int[] letterCounts = new int[26];

        for (int i = 0; i < first.length(); i++) {
            letterCounts[first.charAt(i) - 'a']++;
            letterCounts[second.charAt(i) - 'a']--;
        }

        for (int count : letterCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
