class Solution {
    public static int solution(int[] inputArray) {
        // Inicializar una variable "maxDiff" con el valor mínimo posible de un entero (valor inicial muy bajo)
        int maxDiff = Integer.MIN_VALUE;
    
        // Recorrer el arreglo "inputArray" desde la segunda posición (índice 1)
        for (int i = 1; i < inputArray.length; i++) {
            // Calcular la diferencia absoluta entre el elemento en la posición "i" y el elemento en la posición "i-1"
            int diff = Math.abs(inputArray[i] - inputArray[i - 1]);
    
            // Si la diferencia calculada es mayor que el valor actual de "maxDiff", actualizar "maxDiff" con la nueva diferencia
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }
    
        // Devolver el valor de "maxDiff", que representa la mayor diferencia absoluta entre elementos consecutivos en el arreglo
        return maxDiff;
    }
}


