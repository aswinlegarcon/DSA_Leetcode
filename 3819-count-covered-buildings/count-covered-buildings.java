import java.util.*;

class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        if (buildings == null || buildings.length == 0) return 0;

        // Map row -> sorted set of column indices (columns in that row)
        HashMap<Integer, TreeSet<Integer>> rows = new HashMap<>();
        // Map column -> sorted set of row indices (rows in that column)
        HashMap<Integer, TreeSet<Integer>> cols = new HashMap<>();

        // Populate maps
        for (int[] b : buildings) {
            int r = b[0], c = b[1];
            rows.computeIfAbsent(r, k -> new TreeSet<>()).add(c);
            cols.computeIfAbsent(c, k -> new TreeSet<>()).add(r);
        }

        int covered = 0;
        // For each building check if there's at least one in each of the four directions
        for (int[] b : buildings) {
            int r = b[0], c = b[1];

            TreeSet<Integer> rowSet = rows.get(r);
            TreeSet<Integer> colSet = cols.get(c);

            // strictly left: some column < c
            Integer left = rowSet.lower(c);
            // strictly right: some column > c
            Integer right = rowSet.higher(c);
            // strictly above: some row < r
            Integer above = colSet.lower(r);
            // strictly below: some row > r
            Integer below = colSet.higher(r);

            if (left != null && right != null && above != null && below != null) {
                covered++;
            }
        }

        return covered;
    }


}
