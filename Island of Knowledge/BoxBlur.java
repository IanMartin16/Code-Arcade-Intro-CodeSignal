class Solution {
    public int[][] solution(int[][] image) {
        // Obtener el número de filas y columnas de la matriz de imagen
        int rows = image.length;
        int cols = image[0].length;
    
        // Crear una nueva matriz "blurredImage" con 2 filas y 2 columnas menos que la matriz original
        int[][] blurredImage = new int[rows - 2][cols - 2];
    
        // Recorrer la matriz de imagen, excluyendo los bordes exteriores (1 fila y 1 columna en cada extremo)
        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                // Calcular la suma de los valores de los píxeles alrededor del píxel en la posición (i, j)
                int sum = 0;
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        sum += image[k][l];
                    }
                }
                // Calcular el valor promedio del píxel en la posición (i, j) y almacenarlo en la nueva matriz
                blurredImage[i - 1][j - 1] = sum / 9;
            }
        }
    
        // Devolver la matriz "blurredImage" que representa la imagen desenfocada
        return blurredImage;
    }
}


