class Solution {
    int[] solution(int[] a) {
        // Inicializar las variables "team1" y "team2" para almacenar las sumas de los equipos
        int team1 = 0;
        int team2 = 0;
    
        // Recorrer el arreglo "a"
        for (int i = 0; i < a.length; i++) {
            // Si el índice "i" es par (índice 0, 2, 4, ...), agregar el valor "a[i]" al "team1"
            if (i % 2 == 0) {
                team1 += a[i];
            } else {
                // Si el índice "i" es impar (índice 1, 3, 5, ...), agregar el valor "a[i]" al "team2"
                team2 += a[i];
            }
        }
    
        // Devolver un nuevo arreglo que contiene las sumas de ambos equipos "team1" y "team2"
        return new int[] {team1, team2};
    }
}

