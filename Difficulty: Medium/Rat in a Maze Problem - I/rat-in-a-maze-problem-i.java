//{ Driver Code Starts
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            int n = Integer.parseInt(sc.nextLine());
            int[][] maze = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    maze[i][j] = sc.nextInt();
                }
            }

            if (sc.hasNextLine()) sc.nextLine();

            Solution obj = new Solution();
            ArrayList<String> result = obj.ratInMaze(maze);

            if (result.isEmpty()) {
                System.out.print("[]");
            } else {
                for (String path : result) {
                    System.out.print(path + " ");
                }
            }
            System.out.println();
            System.out.println("~");
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> ans = new ArrayList<>();
        int n = maze.length;
        boolean[][] visited = new boolean[n][n];
        StringBuilder path = new StringBuilder();
        if (maze[0][0] == 1) {
            solveMaze(maze, 0, 0, path, ans, visited, n);
        }
        
        return ans;
    }
    
    public void solveMaze(int[][] maze, int row, int col, StringBuilder path, ArrayList<String> ans, boolean[][] visited, int n) {
        if (row == n - 1 && col == n - 1) {
            ans.add(path.toString());
            return;
        }
        
        visited[row][col] = true;
        
        // Down
        if (row + 1 < n && maze[row + 1][col] == 1 && !visited[row + 1][col]) {
            path.append('D');
            solveMaze(maze, row + 1, col, path, ans, visited, n);
            path.deleteCharAt(path.length()-1);
        }
        
        // Left
        if (col - 1 >= 0 && maze[row][col - 1] == 1 && !visited[row][col - 1]) {
            path.append('L');
            solveMaze(maze, row, col - 1, path, ans, visited, n);
            path.deleteCharAt(path.length()-1);
        }
        
        // Right
        if (col + 1 < n && maze[row][col + 1] == 1 && !visited[row][col + 1]) {
            path.append('R');
            solveMaze(maze, row, col + 1, path, ans, visited, n);
            path.deleteCharAt(path.length()-1);
        }
        
        // Up
        if (row - 1 >= 0 && maze[row - 1][col] == 1 && !visited[row - 1][col]) {
            path.append('U');
            solveMaze(maze, row - 1, col, path, ans, visited, n);
            path.deleteCharAt(path.length()-1);
        }
        
        visited[row][col] = false; // backtrack
    }
}