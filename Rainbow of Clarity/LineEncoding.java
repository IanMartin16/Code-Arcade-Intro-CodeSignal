import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static String solution(String s) {
        // Creamos un Matcher para buscar coincidencias en la cadena 's'
        Matcher matcher = Pattern.compile("([a-z])\\1*").matcher(s);
        
        // Creamos un StringBuilder para construir la cadena comprimida
        StringBuilder result = new StringBuilder();

        // Iteramos a través de todas las coincidencias encontradas
        while (matcher.find()) {
            // Obtenemos la longitud de la coincidencia actual
            int len = matcher.group(0).length();
            // Obtenemos el carácter repetido que forma la coincidencia
            char cha = matcher.group(0).charAt(0);
            
            // Agregamos el resultado de la compresión a la cadena resultante
            result.append(len == 1 ? "" : len).append(cha);
        }

        // Devolvemos la cadena comprimida
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "aaabbccccdd";
        String compressedString = solution(s);
        System.out.println(compressedString); // Salida: "3a2b4c2d"
    }
}


// Given a string, return its encoding defined as follows:

// First, the string is divided into the least possible number of disjoint substrings consisting of identical characters
// for example, "aabbbc" is divided into ["aa", "bbb", "c"]
// Next, each substring with length greater than one is replaced with a concatenation of its length and the repeating character
// for example, substring "bbb" is replaced by "3b"
// Finally, all the new strings are concatenated together in the same order and a new string is returned.