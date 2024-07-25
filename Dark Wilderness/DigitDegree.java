class Solution {
    int solution(int numero) {
        // Verificar si el número tiene solo un dígito
        if (numero / 10 == 0) {
            return 0; // Si tiene solo un dígito, retornar 0
        }
        
        int num = 0; // Variable para almacenar la suma de los dígitos del número
        while (numero != 0) {
            num += numero % 10; // Sumar el dígito más a la variable "num"
            numero /= 10; // Eliminar el último dígito del número
        }
        
        // Llamar recursivamente a la función con el valor de "num"
        // para contar los dígitos del número resultante
        return 1 + solution(num);
    }
}

