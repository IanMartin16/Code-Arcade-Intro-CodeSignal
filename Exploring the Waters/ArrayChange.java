class Solution {
    public static int solution(int[] inputArray) {
        // Inicializar la variable "solution" para contar el número de operaciones realizadas
        int solution = 0;
    
        // Recorrer el arreglo "inputArray" desde la segunda posición (índice 1)
        for (int i = 1; i < inputArray.length; i++) {
            // Verificar si el elemento en la posición "i" es menor o igual al elemento en la posición "i-1"
            if (inputArray[i] <= inputArray[i - 1]) {
                // Si el elemento en la posición "i" es menor o igual al elemento en la posición "i-1",
                // se realiza una operación para hacer que el elemento en la posición "i" sea mayor que el elemento en la posición "i-1".
                // La operación consiste en aumentar el elemento en la posición "i" hasta que sea mayor que el elemento en la posición "i-1".
                // La cantidad de operaciones necesarias se determina restando el elemento en la posición "i" al elemento en la posición "i-1",
                // y luego sumando 1 para asegurarse de que el elemento en la posición "i" sea mayor.
                solution += inputArray[i - 1] - inputArray[i] + 1;
    
                // Actualizar el elemento en la posición "i" para que sea mayor que el elemento en la posición "i-1"
                inputArray[i] = inputArray[i - 1] + 1;
            }
        }
    
        // Devolver el valor de "solution", que representa el número total de operaciones realizadas
        return solution;
    }
}


