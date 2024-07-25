class Solution {
    public int[][] solution(boolean[][] matrix) {
        // Obtener el número de filas y columnas de la matriz booleana "matrix"
        int rows = matrix.length;
        int cols = matrix[0].length;
    
        // Crear una nueva matriz "result" con las mismas dimensiones que "matrix"
        int[][] result = new int[rows][cols];
    
        // Recorrer la matriz "matrix" utilizando dos bucles "for" anidados
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Inicializar la variable "neighbors" para contar el número de vecinos activos
                int neighbors = 0;
    
                // Verificar los ocho celdas adyacentes al elemento en la posición (i, j)
                for (int r = i - 1; r <= i + 1; r++) {
                    for (int c = j - 1; c <= j + 1; c++) {
                        // Ignorar la propia celda, no contamos el elemento en la posición (i, j) como vecino
                        if (r == i && c == j) {
                            continue;
                        }
    
                        // Verificar si la celda adyacente está dentro de los límites de la matriz y es verdadera (activa)
                        if (r >= 0 && r < rows && c >= 0 && c < cols && matrix[r][c]) {
                            neighbors++; // Si es verdadera (activa), incrementar el contador de vecinos
                        }
                    }
                }
    
                // Almacenar el número de vecinos activos en la posición (i, j) de la matriz "result"
                result[i][j] = neighbors;
            }
        }
    
        // Devolver la matriz "result" que contiene el número de vecinos activos para cada elemento de "matrix"
        return result;
    }
}


