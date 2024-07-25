class Solution {
    public static boolean solution(String[] inputArray) {
        // Llamar a la función "permutations" para verificar si existen permutaciones que satisfacen la condición
        return permutations(inputArray, 0);
    }
    
    private static boolean permutations(String[] a, int pos) {
        // Verificar si se ha alcanzado una permutación completa
        if (pos == a.length) {
            // Llamar a la función "valid" para verificar si la permutación actual es válida
            return valid(a);
        }
        // Recorrer el arreglo "a" y generar todas las permutaciones
        for (int i = pos; i < a.length; i++) {
            // Intercambiar el elemento en la posición "pos" con el elemento en la posición "i"
            swap(a, i, pos);
            // Llamar recursivamente a la función "permutations" con la posición incrementada en 1
            if (permutations(a, pos + 1)) {
                // Si se encuentra una permutación válida, retornar true
                return true;
            }
            // Deshacer el intercambio para continuar generando más permutaciones
            swap(a, i, pos);
        }
        // Si no se encuentra ninguna permutación válida, retornar false
        return false;
    }
    
    private static boolean valid(String[] a) {
        // Verificar si todas las palabras en el arreglo "a" difieren por exactamente una letra de la siguiente palabra
        for (int i = 0; i < a.length - 1; i++) {
            if (!differByOne(a[i], a[i + 1])) {
                // Si no cumplen la condición, retornar false
                return false;
            }
        }
        // Si todas las palabras cumplen la condición, retornar true
        return true;
    }
    
    private static boolean differByOne(String s1, String s2) {
        // Verificar si las cadenas "s1" y "s2" difieren por exactamente una letra
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
            if (count > 1) {
                // Si se encuentran más de una diferencia, retornar false
                return false;
            }
        }
        // Si hay exactamente una diferencia, retornar true
        return count == 1;
    }
    
    private static void swap(String[] a, int i, int j) {
        // Intercambiar dos elementos en el arreglo "a" dados sus índices "i" y "j"
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

