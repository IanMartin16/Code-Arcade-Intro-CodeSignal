class Solution {
    public static boolean solution(String inputString) {
        String cleanStr = inputString.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");    // Empleamos toLowerCase para convertir todos los caracteres en minusculas
        
        String reverseStr = new StringBuilder(cleanStr).reverse().toString();
        
        return cleanStr.equals(reverseStr);
    
    }
}



//Given the string, check if it is a palindrome.

//Un palíndromo en Java es una cadena de caracteres que se lee igual de adelante hacia atrás que de atrás hacia adelante. 
//En otras palabras, es una secuencia de caracteres que se lee igual en ambas direcciones.

//Por ejemplo, "ama" es un palíndromo, ya que se lee igual de adelante hacia atrás como de atrás hacia adelante. 
//Lo mismo ocurre con la cadena "anilina".