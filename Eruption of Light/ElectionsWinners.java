class Solution {
    int solution(int[] votes, int k) {
        // Encontrar el valor máximo en el array "votes" usando Streams.
        int max = Arrays.stream(votes).max().getAsInt();
        
        // Si "k" es igual a 0, verificamos si el valor máximo ocurre solo una vez en el array.
        // Si es así, significa que hay un único candidato con la máxima cantidad de votos,
        // y por lo tanto, devuelve 1. De lo contrario, devuelve 0.
        if (k == 0) {
            return (int) Arrays.stream(votes).filter(x -> x == max).count() == 1 ? 1 : 0;
        } else {
            // Si "k" es diferente de 0, contamos la cantidad de candidatos que podrían ganar
            // si se les agrega "k" votos adicionales (más que el máximo actual).
            return (int) Arrays.stream(votes).filter(x -> x + k > max).count();
        }
    }
}

