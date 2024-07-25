class Solution {
    int solution(int[] a) {
        // Inicializar "minSum" con un valor máximo posible para asegurarse de que se actualizará con el primer resultado válido
        int minSum = Integer.MAX_VALUE;
        
        // Inicializar "result" con el primer elemento del arreglo "a"
        int result = a[0];
        
        // Recorrer el arreglo "a" utilizando un bucle "for" para comparar cada elemento con todos los demás elementos
        for (int i = 0; i < a.length; i++) {
            // Inicializar "sum" para calcular la suma de las diferencias absolutas entre el elemento actual y los demás elementos
            int sum = 0;
            
            // Recorrer nuevamente el arreglo "a" con otro bucle "for" para calcular la suma de las diferencias absolutas
            for (int j = 0; j < a.length; j++) {
                // Calcular la diferencia absoluta entre el elemento actual y el elemento en la posición "j"
                sum += Math.abs(a[i] - a[j]);
            }
            
            // Verificar si la suma de las diferencias absolutas es menor que el valor actual de "minSum"
            if (sum < minSum) {
                // Si es menor, actualizar "minSum" con el nuevo valor y actualizar "result" con el elemento actual
                minSum = sum;
                result = a[i];
            }
        }
        
        // Retornar el elemento "result" que minimiza la suma de las diferencias absolutas con todos los demás elementos
        return result;
    }
}

