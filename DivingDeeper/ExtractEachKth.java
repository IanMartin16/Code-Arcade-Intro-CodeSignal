class Solution {
    public static int[] solution(int[] arr, int k) {
        int n = arr.length;             // Obtener el tamaño del arreglo "arr"
        int count = n / k;              // Calcular la cantidad de elementos que se eliminarán
        int[] result = new int[n - count];  // Crear un nuevo arreglo para almacenar los elementos restantes
        int i = 0;                      // Índice para recorrer el arreglo "arr"
        int j = 0;                      // Índice para llenar el arreglo "result"
        
        // Recorrer el arreglo "arr"
        while (i < n) {
            // Verificar si el elemento actual debe ser eliminado (según el valor de "k")
            if ((i + 1) % k != 0) {
                // Si no debe ser eliminado, copiar el elemento en el arreglo "result"
                result[j++] = arr[i];
            }
            i++; // Mover al siguiente elemento en el arreglo "arr"
        }
        return result; // Retornar el arreglo "result" con los elementos restantes
    }
}

