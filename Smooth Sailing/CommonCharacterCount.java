class Solution {
    public static int solution(String s1, String s2) {
        // Crear dos arreglos para contar la frecuencia de caracteres en las cadenas s1 y s2
        int[] count1 = new int[26];
        int[] count2 = new int[26];
    
        // Recorrer la primera cadena (s1) y contar la frecuencia de cada caracter
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            count1[c - 'a']++;
        }
    
        // Inicializar la variable "solution" para almacenar el resultado
        int solution = 0;
    
        // Recorrer la segunda cadena (s2) y verificar si el caracter está en s1 y en qué cantidad
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (count1[c - 'a'] > 0) {
                // Si el caracter está presente en s1, incrementar el contador "solution"
                solution++;
                // Decrementar el contador de ese caracter en s1, ya que se ha utilizado en s2
                count1[c - 'a']--;
            }
        }
    
        // Devolver el valor de "solution" como resultado
        return solution;
    }
}


