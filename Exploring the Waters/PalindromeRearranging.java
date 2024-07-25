class Solution {
    boolean solution(String inputString) {
        // Crear un arreglo de enteros "charCounts" para almacenar la cantidad de veces que aparece cada caracter ('a' a 'z') en la cadena
        int[] charCounts = new int[26];
        
        // Contador para llevar el registro de la cantidad de caracteres con una ocurrencia impar
        int oddCharCount = 0;
        
        // Recorrer la cadena "inputString"
        for (int i = 0; i < inputString.length(); i++) {
            // Obtener el caracter en la posición "i" de la cadena
            char c = inputString.charAt(i);
            
            // Incrementar el contador correspondiente en el arreglo "charCounts" para el caracter actual
            // Restando el valor ASCII de 'a' al valor ASCII del caracter obtenemos un índice en el rango 0-25 para el arreglo
            charCounts[c - 'a']++;
        }
        
        // Recorrer el arreglo "charCounts" para verificar si hay caracteres con una ocurrencia impar
        for (int count : charCounts) {
            // Si la cantidad de ocurrencias de un caracter es impar, incrementar el contador "oddCharCount"
            if (count % 2 != 0) {
                oddCharCount++;
            }
            
            // Si encontramos más de un caracter con ocurrencia impar, la cadena no puede formar un palíndromo y retornamos "false"
            if (oddCharCount > 1) {
                return false;
            }
        }
        
        // Si no encontramos más de un caracter con ocurrencia impar, la cadena puede formar un palíndromo y retornamos "true"
        return true;
    }
}

