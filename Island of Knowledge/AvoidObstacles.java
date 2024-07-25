class Solution {
    public static int solution(int[] inputArray) {
        // Ordenar el arreglo "inputArray" de forma ascendente
        Arrays.sort(inputArray);
    
        // Inicializar la variable "jumpLength" con 2, que representa la longitud inicial del salto
        int jumpLength = 2;
    
        // Declarar una variable booleana "obstacleHit" para indicar si se ha encontrado un obstáculo
        boolean obstacleHit;
    
        // Iniciar un bucle "do-while"
        do {
            // Establecer "obstacleHit" como falso al comienzo de cada iteración del bucle
            obstacleHit = false;
    
            // Recorrer el arreglo "inputArray"
            for (int i = 0; i < inputArray.length; i++) {
                // Verificar si el elemento actual en la posición "i" del arreglo es divisible por "jumpLength"
                if (inputArray[i] % jumpLength == 0) {
                    // Si es divisible, se ha encontrado un obstáculo y se aumenta la longitud del salto ("jumpLength") en 1
                    obstacleHit = true;
                    jumpLength++;
                    break; // Salir del bucle "for" ya que hemos encontrado un obstáculo
                }
            }
        } while (obstacleHit); // Continuar el bucle mientras haya encontrado obstáculos en el arreglo
    
        // Retornar el valor final de "jumpLength", que representa la longitud del salto sin obstáculos
        return jumpLength;
    }
}


