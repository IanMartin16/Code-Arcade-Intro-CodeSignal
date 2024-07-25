class Solution {
    public static boolean solution(String inputString) {
        // Verificar si la cadena "inputString" es nula o está vacía
        if (inputString == null || inputString.length() == 0) {
            return false; // Si es nula o vacía, no es una dirección IP válida, retornar "false"
        }
    
        // Dividir la cadena "inputString" en partes utilizando el punto (.) como delimitador
        String[] parts = inputString.split("\\.");
    
        // Verificar si la dirección IP tiene exactamente 4 partes separadas por puntos
        if (parts.length != 4) {
            return false; // Si no tiene 4 partes, no es una dirección IP válida, retornar "false"
        }
    
        // Recorrer cada parte de la dirección IP obtenida
        for (String part : parts) {
            // Verificar si la longitud de la parte es 0 o mayor a 3 caracteres
            if (part.length() == 0 || part.length() > 3) {
                return false; // Si la longitud es inválida, no es una dirección IP válida, retornar "false"
            }
    
            // Verificar si la parte comienza con el caracter '0' pero tiene más de un dígito
            if (part.charAt(0) == '0' && part.length() > 1) {
                return false; // Si comienza con '0' pero tiene más de un dígito, no es una dirección IP válida, retornar "false"
            }
    
            // Verificar si cada caracter de la parte es un dígito numérico (0-9)
            for (int i = 0; i < part.length(); i++) {
                if (!Character.isDigit(part.charAt(i))) {
                    return false; // Si hay algún caracter no numérico, no es una dirección IP válida, retornar "false"
                }
            }
    
            // Convertir la parte a un entero y verificar si está en el rango válido (0 a 255)
            int value = Integer.parseInt(part);
            if (value < 0 || value > 255) {
                return false; // Si está fuera del rango válido, no es una dirección IP válida, retornar "false"
            }
        }
    
        // Si ninguna de las verificaciones anteriores falla, entonces la dirección IP es válida, retornar "true"
        return true;
    }
}


