class Solution {
    public static boolean solution(String cell1, String cell2) {
        // Obtener las coordenadas de la primera celda (cell1)
        int row1 = cell1.charAt(1) - '1'; // Obtener el número de fila (convertir el dígito en un valor numérico)
        int col1 = cell1.charAt(0) - 'a'; // Obtener el número de columna (convertir la letra en un índice numérico)
    
        // Obtener las coordenadas de la segunda celda (cell2)
        int row2 = cell2.charAt(1) - '1'; // Obtener el número de fila (convertir el dígito en un valor numérico)
        int col2 = cell2.charAt(0) - 'a'; // Obtener el número de columna (convertir la letra en un índice numérico)
    
        // Verificar si las dos celdas tienen el mismo color
        return (row1 + col1) % 2 == (row2 + col2) % 2;
    }
}

