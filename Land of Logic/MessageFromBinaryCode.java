public class Solution {
    public static String solution(String code) {
        // Verificamos si la cadena de código es válida (múltiplo de 8)
        if (code.length() % 8 != 0) {
            throw new IllegalArgumentException("La cadena de código no es válida.");
        }
        
        StringBuilder result = new StringBuilder();
        
        // Iteramos sobre la cadena de código de 8 en 8 bits
        for (int i = 0; i < code.length(); i += 8) {
            // Extraemos los siguientes 8 bits
            String binaryChar = code.substring(i, i + 8);
            // Convertimos los 8 bits a su correspondiente carácter ASCII
            char decodedChar = (char) Integer.parseInt(binaryChar, 2);
            // Agregamos el carácter decodificado al resultado
            result.append(decodedChar);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        String code = "010010000110010101101100011011000110111100100001";
        String decodedMessage = solution(code);
        System.out.println("Mensaje decodificado: " + decodedMessage);
    }
}


// allenge designed specifically for programmers. In your efforts to find a clue, you've found a binary code written on the wall behind a vase, 
// and realized that it must be an encrypted message. 
// After some thought, your first guess is that each consecutive 8 bits of the code stand for the character with 
// the corresponding extended ASCII code.

// Assuming that your hunch is correct, decode the message.