class Solution {
    public static int solution(int[] statues) {
        if (statues == null || statues.length <= 1) {
            return 0;
        }
        
        Arrays.sort(statues);
        
        int solution = 0;
        for (int i = 1; i < statues.length; i++) {
            int diff = statues[i] - statues[i -1];
            if (diff > 1) {
                solution += diff - 1;
            }
        }
        return solution;
    
    }
}




//Este código en Java resuelve el siguiente problema: Dado un arreglo de números enteros "statues", 
//encuentre el número mínimo de estatuas que deben agregarse para que haya una secuencia de estatuas consecutivas. 
//En otras palabras, encuentre la cantidad mínima de estatuas que deben agregarse al arreglo 
//para que el rango completo de estatuas consecutivas esté presente.

//El algoritmo comienza verificando si el arreglo "statues" es nulo o tiene una longitud menor o igual a 1. Si esto es cierto, 
//devuelve 0 porque no hay estatuas para agregar.

//Si el arreglo "statues" tiene una longitud mayor que 1, se ordena utilizando el método "Arrays.sort()".

//Luego, se inicializa una variable "solution" en 0, y se recorre el arreglo "statues" en un bucle for a partir del segundo elemento (índice 1). 
//Para cada elemento "i", se calcula la diferencia "diff" entre "statues[i]" y el elemento anterior "statues[i-1]". 
//Si "diff" es mayor que 1, significa que hay una brecha entre dos estatuas consecutivas, 
//y se debe agregar el número de estatuas faltantes para llenar esa brecha a "solution".

//Finalmente, se devuelve "solution", que representa la cantidad mínima de estatuas que deben agregarse al arreglo 
//para que haya una secuencia completa de estatuas consecutivas.