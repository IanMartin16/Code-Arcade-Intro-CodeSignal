class Solution {
    String solution(String inputString) {
        int i = 0; // Índice para recorrer la cadena de entrada
        // Recorre la cadena mientras el carácter en la posición i es un dígito numérico
        while (i < inputString.length() && Character.isDigit(inputString.charAt(i))) {
            i++;
        }
        // Retorna el prefijo numérico más largo encontrado hasta el índice i
        return inputString.substring(0, i);
    }
}


