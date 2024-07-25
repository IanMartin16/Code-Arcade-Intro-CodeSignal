class Solution {
    public static boolean solution(String name) {
        // Verificar si la cadena está vacía o si el primer carácter es un dígito numérico
        if (name.length() == 0 || Character.isDigit(name.charAt(0))) {
            // Si la cadena está vacía o el primer carácter es un dígito, retornar "false"
            return false;
        }
        // Recorrer cada carácter de la cadena usando un bucle "for-each"
        for (char c : name.toCharArray()) {
            // Verificar si el carácter no es una letra, un dígito o el carácter '_'
            if (!Character.isLetterOrDigit(c) && c != '_') {
                // Si el carácter no cumple las condiciones, retornar "false"
                return false;
            }
        }
        // Si todos los carácteres cumplen las condiciones, retornar "true"
        return true;
    }
}


