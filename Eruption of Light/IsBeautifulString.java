class Solution {
    boolean solution(String inputString) {
        // Creamos un arreglo de enteros de tamaño 26 para contar la frecuencia de cada letra del alfabeto (a-z).
        int[] c = new int[26];
        
        // Convertimos el inputString a un arreglo de bytes y recorremos cada byte (carácter) en el arreglo.
        // Incrementamos la frecuencia de la letra correspondiente en el arreglo 'c'.
        for (int i : inputString.getBytes()) {
            c[i - 'a']++;
        }
        
        // Luego de contar la frecuencia de cada letra, verificamos si el arreglo está ordenado en forma no decreciente.
        // Si no está ordenado de esta manera, significa que no se cumplen las condiciones del problema.
        // En tal caso, retornamos 'false'.
        for (int i = 1; i < 26; i++) {
            if (c[i] > c[i - 1]) {
                return false;
            }
        }
        
        // Si el arreglo está ordenado en forma no decreciente, significa que se cumple la condición del problema.
        // En tal caso, retornamos 'true'.
        return true;
    }
}

