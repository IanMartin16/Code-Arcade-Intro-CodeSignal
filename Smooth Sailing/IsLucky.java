class Solution {
    public static boolean solution(int n) {
        // Convertir el número entero "n" en una cadena para facilitar el manejo de los dígitos
        String numStr = Integer.toString(n);
        
        // Calcular la mitad de la longitud de la cadena numStr
        int half = numStr.length() / 2;
    
        // Inicializar las variables "sum1" y "sum2" para almacenar la suma de los dígitos
        // en la primera mitad y en la segunda mitad de la cadena, respectivamente.
        int sum1 = 0, sum2 = 0;
    
        // Recorrer los dígitos en la primera mitad de la cadena numStr
        for (int i = 0; i < half; i++) {
            // Obtener el dígito actual convirtiendo el carácter en número
            int digit = Character.getNumericValue(numStr.charAt(i));
            // Sumar el dígito actual a "sum1"
            sum1 += digit;
        }
    
        // Recorrer los dígitos en la segunda mitad de la cadena numStr
        for (int i = half; i < numStr.length(); i++) {
            // Obtener el dígito actual convirtiendo el carácter en número
            int digit = Character.getNumericValue(numStr.charAt(i));
            // Sumar el dígito actual a "sum2"
            sum2 += digit;
        }
    
        // Verificar si "sum1" es igual a "sum2" y devolver el resultado (true o false)
        return sum1 == sum2;
    }
}


