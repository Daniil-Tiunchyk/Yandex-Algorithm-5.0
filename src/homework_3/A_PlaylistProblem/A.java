package homework_3.A_PlaylistProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> commonTracks = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            String[] tracks = br.readLine().split(" ");
            if (i == 0) {
                commonTracks.addAll(Arrays.asList(tracks));
            } else {
                commonTracks.retainAll(new HashSet<>(Arrays.asList(tracks)));
            }
            if (commonTracks.isEmpty()) {
                break;
            }
        }

        List<String> sortedCommonTracks = new ArrayList<>(commonTracks);
        Collections.sort(sortedCommonTracks);

        System.out.println(sortedCommonTracks.size());
        StringBuilder output = new StringBuilder();
        for (String track : sortedCommonTracks) {
            output.append(track).append(" ");
        }
        System.out.print(output.toString().trim());
    }
}
