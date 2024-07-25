class Solution {
    boolean solution(String inputString) {
        // Definimos un patrón de expresión regular (regex) que describe el formato esperado de la cadena.
        // El patrón busca una cadena que cumpla con la siguiente estructura:
        // Dos caracteres hexadecimales (dígitos del 0 al 9 y letras A-F o a-f) seguidos de un guion ("-"),
        // esto se repite cinco veces, y finalmente, dos caracteres hexadecimales.
        String regex = "([0-9A-Fa-f]{2}-){5}[0-9A-Fa-f]{2}";
        
        // Utilizamos el método "matches()" de la clase String para verificar si la cadena "inputString"
        // coincide con el patrón de expresión regular definido en "regex".
        // Si la cadena cumple con el formato especificado, el método devuelve true; de lo contrario, devuelve false.
        return inputString.matches(regex);
    }   
}

