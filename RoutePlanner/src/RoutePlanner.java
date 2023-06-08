public class RoutePlanner {
    public static boolean routeExists(int fromRow, int fromColumn, int toRow, int toColumn, boolean[][] mapMatrix) {
        int numRows = mapMatrix.length;
        int numCols = mapMatrix[0].length;

        // Create a visited array to keep track of visited cells
        boolean[][] visited = new boolean[numRows][numCols];

        return dfs(fromRow, fromColumn, toRow, toColumn, mapMatrix, visited);
    }

    private static boolean dfs(int row, int col, int toRow, int toCol, boolean[][] mapMatrix, boolean[][] visited) {
        int numRows = mapMatrix.length;
        int numCols = mapMatrix[0].length;

        // Check if current cell is out of bounds or visited
        if (row < 0 || row >= numRows || col < 0 || col >= numCols || visited[row][col]) {
            return false;
        }

        // Mark current cell as visited
        visited[row][col] = true;

        // Check if current cell is the destination
        if (row == toRow && col == toCol) {
            return true;
        }

        // Check if there is a road to the left, right, below, or above
        if (mapMatrix[row][col]) {
            // Recursive calls to explore adjacent cells
            if (dfs(row, col - 1, toRow, toCol, mapMatrix, visited)) {
                return true;
            }
            if (dfs(row, col + 1, toRow, toCol, mapMatrix, visited)) {
                return true;
            }
            if (dfs(row - 1, col, toRow, toCol, mapMatrix, visited)) {
                return true;
            }
            if (dfs(row + 1, col, toRow, toCol, mapMatrix, visited)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        boolean[][] mapMatrix = {
                {true, false, false},
                {true, true, false},
                {false, true, true}
        };

        boolean result = routeExists(0, 0, 2, 2, mapMatrix);
        System.out.println(result);  // Output: true
    }
}
