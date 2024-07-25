class Solution {
    char solution(String inputString) {
        // Recorrer cada carácter en la cadena de entrada
        for (char ch : inputString.toCharArray()) {
            // Verificar si el carácter es un dígito numérico
            if (Character.isDigit(ch)) {
                // Si es un dígito numérico, retornarlo
                return ch;
            }
        }
        // Si no se encontró ningún dígito numérico, retornar '0'
        return '0';
    }
}

