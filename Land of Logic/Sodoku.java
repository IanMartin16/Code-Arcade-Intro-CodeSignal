class Solution {
    boolean solution(int[][] grid) {
        int[] rowsSumary = new int[9];  // Arreglo para almacenar la suma de cada fila
        int[] colsSumary = new int[9];  // Arreglo para almacenar la suma de cada columna
        int[] sectSumary = new int[9];  // Arreglo para almacenar la suma de cada subgrilla 3x3
    
        // Recorremos todas las filas y columnas de la cuadrícula
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                // Sumamos el valor de la celda actual a las sumas de fila, columna y subgrilla correspondientes
                rowsSumary[row] += grid[row][col];
                colsSumary[col] += grid[row][col];
                sectSumary[(col / 3) + ((row / 3) * 3)] += grid[row][col];
            }
        }
    
        // Verificamos las siguientes condiciones utilizando Stream API de Java
    
        // 1. Verificar si la primera fila contiene números distintos del 1 al 9
        boolean distinctFirstRow = Arrays.stream(grid[0]).distinct().count() == 9;
    
        // 2. Verificar si todas las filas suman 45 (la suma del 1 al 9)
        boolean allRowsSumTo45 = Arrays.stream(rowsSumary).allMatch(x -> x == 45);
    
        // 3. Verificar si todas las columnas suman 45 (la suma del 1 al 9)
        boolean allColsSumTo45 = Arrays.stream(colsSumary).allMatch(x -> x == 45);
    
        // 4. Verificar si todas las subgrillas suman 45 (la suma del 1 al 9)
        boolean allSectSumTo45 = Arrays.stream(sectSumary).allMatch(x -> x == 45);
    
        // Si todas las condiciones se cumplen, la cuadrícula es una solución válida de Sudoku
        return distinctFirstRow && allRowsSumTo45 && allColsSumTo45 && allSectSumTo45;
    }
}


// Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with digits so that each column, 
// each row, and each of the nine 3 × 3 sub-grids that compose the grid contains all of the digits from 1 to 9.

// This algorithm should check if the given grid of numbers represents a correct solution to Sudoku.