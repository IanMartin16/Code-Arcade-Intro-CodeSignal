class Solution {
    public String solution(String inputString) {
        // Convertir la cadena de entrada en un arreglo de caracteres
        char[] chars = inputString.toCharArray();
        
        // Recorrer cada carácter en el arreglo
        for (int i = 0; i < chars.length; i++) {
            // Verificar si el carácter es 'z'
            if (chars[i] == 'z') {
                // Si el carácter es 'z', cambiarlo por 'a'
                chars[i] = 'a';
            } else if (Character.isLetter(chars[i])) {
                // Si el carácter es una letra (distinta de 'z'), incrementar su valor en 1
                chars[i]++;
            }
        }
        
        // Convertir el arreglo de caracteres de nuevo a una cadena y retornarla
        return new String(chars);
    }
}


