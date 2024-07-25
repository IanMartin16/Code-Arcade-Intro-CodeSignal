class Solution {
    String solution(String address) {
        // Encontrar la última posición del carácter "@" en la cadena "address".
        int ind = address.lastIndexOf("@");
        
        // Obtener una subcadena de "address" que comienza desde la posición "ind+1" hasta el final de la cadena.
        // Es decir, obtenemos el fragmento de la cadena después del último carácter "@".
        return address.substring(ind + 1);
    }
}


