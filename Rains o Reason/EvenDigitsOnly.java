class Solution {
    public static boolean solution(int n) {
        // Utilizar un bucle "while" para iterar a través de los dígitos del número "n"
        while (n > 0) {
            // Obtener el último dígito del número "n" utilizando el operador módulo (%)
            int digit = n % 10;
            // Verificar si el dígito es impar (es decir, si es diferente de cero y no divisible por 2)
            if (digit % 2 != 0) {
                // Si el dígito es impar, retornar "false"
                return false;
            }
            // Eliminar el último dígito del número "n" dividiéndolo por 10
            n /= 10;
        }
        // Si todos los dígitos son pares, retornar "true"
        return true;
    }
}
