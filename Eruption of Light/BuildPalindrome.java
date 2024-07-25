class Solution {
    public String solution(String st) {
        // Creamos dos objetos StringBuilder, uno para la cadena original y otro para su reverso.
        StringBuilder sb = new StringBuilder(st);
        StringBuilder rs = new StringBuilder(st).reverse();
    
        // Recorremos cada posición (índice) de la cadena "st".
        for (int i = 0; i < st.length(); i++) {
            // Comparamos si el reverso de "st" comienza con la subcadena de "st" a partir de la posición "i".
            // Si la condición se cumple, significa que hemos encontrado un prefijo de "st" que forma un palíndromo.
            if (rs.toString().startsWith(st.substring(i))) {
                // Encontramos el palíndromo y construimos el resultado combinando la cadena original "st" con la
                // parte restante del reverso de "st" después del palíndromo encontrado.
                // Finalmente, retornamos la cadena resultante.
                return sb.append(rs.substring(st.substring(i).length())).toString();
            }
        }
    
        // Si no se encuentra ningún palíndromo en la cadena, retornamos "?" como resultado.
        return "?";
    }
}

