package homework_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D_ChessboardPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<String> cells = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            cells.add(row + " " + col);
        }

        int perimeter = 0;
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        for (String cell : cells) {
            String[] parts = cell.split(" ");
            int row = Integer.parseInt(parts[0]);
            int col = Integer.parseInt(parts[1]);

            for (int i = 0; i < 4; i++) {
                int newRow = row + dx[i];
                int newCol = col + dy[i];

                if (!cells.contains(newRow + " " + newCol)) {
                    perimeter++;
                }
            }
        }

        System.out.println(perimeter);
    }
}
