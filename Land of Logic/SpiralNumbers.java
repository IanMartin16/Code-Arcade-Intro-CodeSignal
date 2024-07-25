public class Solution {
    public static int[][] solution(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int topRow = 0, bottomRow = n - 1;
        int leftCol = 0, rightCol = n - 1;
        
        while (num <= n * n) {
            // Fill the top row
            for (int i = leftCol; i <= rightCol; i++) {
                matrix[topRow][i] = num++;
            }
            topRow++;
            
            // Fill the rightmost column
            for (int i = topRow; i <= bottomRow; i++) {
                matrix[i][rightCol] = num++;
            }
            rightCol--;
            
            // Fill the bottom row
            for (int i = rightCol; i >= leftCol; i--) {
                matrix[bottomRow][i] = num++;
            }
            bottomRow--;
            
            // Fill the leftmost column
            for (int i = bottomRow; i >= topRow; i--) {
                matrix[i][leftCol] = num++;
            }
            leftCol++;
        }
        
        return matrix;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] spiralMatrix = solution(n);
        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(spiralMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// Construct a square matrix with a size N × N containing integers from 1 to N * N in a spiral order, 
// starting from top-left and in clockwise direction