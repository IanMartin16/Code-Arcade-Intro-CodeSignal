class Solution {
    public static int solution(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        Set<String> squaresSet = new HashSet<>();
    
        // Recorre la matriz hasta la penúltima fila y columna
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                // Obtener los valores de los cuatro elementos en el cuadrado de 2x2
                int topLeft = matrix[i][j];
                int topRight = matrix[i][j + 1];
                int bottomLeft = matrix[i + 1][j];
                int bottomRight = matrix[i + 1][j + 1];
    
                // Agregar la combinación de elementos a un conjunto como una cadena
                String squareCombination = String.format("%d%d%d%d", topLeft, topRight, bottomLeft, bottomRight);
                squaresSet.add(squareCombination);
            }
        }
    
        return squaresSet.size();
    }
}


