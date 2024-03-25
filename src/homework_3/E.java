package homework_3;

import java.util.*;
import java.io.*;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int n1 = sc.nextInt();
        Set<Integer> firstList = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            firstList.add(sc.nextInt());
        }

        int n2 = sc.nextInt();
        Set<Integer> secondList = new HashSet<>();
        for (int i = 0; i < n2; i++) {
            secondList.add(sc.nextInt());
        }

        int n3 = sc.nextInt();
        Set<Integer> thirdList = new HashSet<>();
        for (int i = 0; i < n3; i++) {
            thirdList.add(sc.nextInt());
        }

        PrintWriter out = getPrintWriter(firstList, secondList, thirdList);
        out.flush();
    }

    private static PrintWriter getPrintWriter(Set<Integer> firstList, Set<Integer> secondList, Set<Integer> thirdList) {
        Set<Integer> result = new TreeSet<>();

        for (Integer num : firstList) {
            if (secondList.contains(num)) {
                result.add(num);
            }
        }

        for (Integer num : firstList) {
            if (thirdList.contains(num)) {
                result.add(num);
            }
        }

        for (Integer num : secondList) {
            if (thirdList.contains(num)) {
                result.add(num);
            }
        }

        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        for (Integer num : result) {
            out.print(num + " ");
        }
        return out;
    }
}