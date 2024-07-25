class Solution {
    public static String solution(String inputString) {
        // Crear una pila (Stack) para almacenar los índices de los paréntesis abiertos '('
        Stack<Integer> stack = new Stack<>();
        
        // Convertir el String en un arreglo de caracteres para facilitar su manipulación
        char[] chars = inputString.toCharArray();
        
        // Recorrer el arreglo de caracteres para procesar los paréntesis
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                // Si se encuentra un paréntesis abierto '(', se agrega su índice a la pila
                stack.push(i);
            } else if (chars[i] == ')') {
                // Si se encuentra un paréntesis cerrado ')', se procesa el contenido entre
                // el último paréntesis abierto (en la pila) y este paréntesis cerrado
                reverse(chars, stack.pop() + 1, i - 1);
            }
        }
    
        // Al finalizar el procesamiento, se construye el resultado como un StringBuilder
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            // Se agregan al resultado solo los caracteres que no son paréntesis '(' ni ')'
            if (c != '(' && c != ')') {
                sb.append(c);
            }
        }
    
        // Se devuelve el resultado como un String
        return sb.toString();
    }
    
    // Método privado que revierte el contenido del arreglo de caracteres desde 'start' hasta 'end'
    private static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start++] = chars[end];
            chars[end--] = temp;
        }
    }
}


