// Define a word as a sequence of consecutive English letters. Find the longest word from the given string.

public class Main {

    public static String solution(String text) {
        // Paso 1: Separar la cadena en palabras
        String[] words = text.split("[^a-zA-Z]+");

        // Variables para almacenar la palabra más larga y su longitud
        String longestWord = "";
        int maxLength = 0;

        // Paso 2: Recorrer las palabras y encontrar la más larga
        for (String word : words) {
            // Si la palabra actual es más larga que la palabra más larga anterior,
            // actualizamos la palabra más larga y su longitud
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        String inputString = "Ready, steady, go!";
        String longestWord = solution(inputString);
        System.out.println("La palabra más larga es: " + longestWord);
    }
}
