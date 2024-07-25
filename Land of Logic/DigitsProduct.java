class Solution {
    public static int solution(int product) {
        if (product == 0) {
            return 10; // El producto de dígitos de 10 es 0, por lo que es la única solución para product = 0.
        }
    
        if (product == 1) {
            return 1; // El producto de dígitos de 1 es 1, por lo que 1 es la única solución para product = 1.
        }
    
        // Inicializamos una lista para almacenar los dígitos del número solución.
        List<Integer> digits = new ArrayList<>();
    
        // Recorremos los números desde 9 hasta 2.
        for (int i = 9; i >= 2; i--) {
            // Dividimos el producto entre el número actual "i" mientras sea divisible.
            while (product % i == 0) {
                digits.add(i);
                product /= i;
            }
        }
    
        // Si no se pudo factorizar completamente "product" (es decir, quedó un residuo mayor a 1),
        // o si no se encontraron dígitos, no hay solución, por lo que devolvemos -1.
        if (product > 1 || digits.isEmpty()) {
            return -1;
        }
    
        // Construimos el número solución combinando los dígitos en la lista.
        int result = 0;
        for (int i = digits.size() - 1; i >= 0; i--) {
            result = result * 10 + digits.get(i);
        }
    
        return result;
    }
}

