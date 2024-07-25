class Solution {
    public static int[] solution(int[] a) {
        // Crear dos listas para almacenar los índices de los árboles y los valores restantes
        List<Integer> treeIndices = new ArrayList<>();
        List<Integer> solution = new ArrayList<>();
        
        // Recorrer el arreglo "a"
        for (int i = 0; i < a.length; i++) {
            if (a[i] == -1) {
                // Si el elemento es -1, significa que hay un árbol en ese índice
                // Agregar el índice del árbol a la lista "treeIndices"
                treeIndices.add(i);
            } else {
                // Si el elemento no es -1, significa que es un valor restante
                // Agregar el valor restante a la lista "solution"
                solution.add(a[i]);
            }
        }
    
        // Ordenar la lista "solution" en orden ascendente
        Collections.sort(solution);
        
        // Inicializar el índice "j" para recorrer la lista "solution"
        int j = 0;
        
        // Recorrer nuevamente el arreglo "a"
        for (int i = 0; i < a.length; i++) {
            if (treeIndices.contains(i)) {
                // Si el índice "i" está en la lista de índices de árboles,
                // continuar con la siguiente iteración del bucle sin hacer nada
                // Esto se hace para saltar los índices de los árboles en "a"
                continue;
            } else {
                // Si el índice "i" no está en la lista de índices de árboles,
                // obtener el siguiente valor restante de la lista "solution" y asignarlo a "a[i]"
                a[i] = solution.get(j);
                j++; // Incrementar el índice "j" para obtener el siguiente valor restante en la siguiente iteración
            }
        }
    
        // Devolver el arreglo "a" con los valores restantes reemplazando los -1 (árboles)
        return a;
    }
}


