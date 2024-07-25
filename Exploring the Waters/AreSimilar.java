class Solution {
    public static boolean solution(int[] a, int[] b) {
        // Verificar si los arreglos "a" y "b" son iguales utilizando Arrays.equals()
        if (Arrays.equals(a, b)) {
            return true; // Si son iguales, se devuelve true
        }
    
        // Inicializar las variables para almacenar los índices de las diferencias encontradas
        int firstDiffIndex = -1;
        int secondDiffIndex = -1;
    
        // Recorrer los arreglos "a" y "b" para encontrar las diferencias entre ellos
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                // Si se encuentra una diferencia, se almacena el índice de la primera diferencia en "firstDiffIndex"
                if (firstDiffIndex == -1) {
                    firstDiffIndex = i;
                } else if (secondDiffIndex == -1) {
                    // Si ya se encontró una diferencia previamente, se almacena el índice de la segunda diferencia en "secondDiffIndex"
                    secondDiffIndex = i;
                } else {
                    // Si ya se encontraron más de dos diferencias, los arreglos no pueden ser transformados y se devuelve false
                    return false;
                }
            }
        }
    
        // Después de encontrar dos diferencias, se verifica si los valores en las posiciones intercambiadas son iguales
        if (secondDiffIndex != -1 && a[firstDiffIndex] == b[secondDiffIndex] && a[secondDiffIndex] == b[firstDiffIndex]) {
            // Si los valores intercambiados son iguales, se procede a intercambiarlos en el arreglo "a"
            int temp = a[firstDiffIndex];
            a[firstDiffIndex] = a[secondDiffIndex];
            a[secondDiffIndex] = temp;
            // Se verifica nuevamente si los arreglos "a" y "b" son iguales después del intercambio
            return Arrays.equals(a, b);
        } else {
            // Si los valores intercambiados no son iguales, los arreglos no pueden ser transformados y se devuelve false
            return false;
        }
    }
}


