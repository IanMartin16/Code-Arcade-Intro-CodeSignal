class Solution {
    public static int solution(double deposit, double rate, double threshold) {
        // Inicializar la variable "years" para contar el número de años transcurridos
        int years = 0;
    
        // Iniciar un bucle "while" que se ejecutará mientras el depósito sea menor que el umbral (threshold)
        while (deposit < threshold) {
            // Calcular el interés generado por el depósito en este año y agregarlo al depósito
            deposit += deposit * (rate / 100);
    
            // Incrementar el contador de años
            years++;
        }
    
        // Retornar el número total de años transcurridos
        return years;
    }
}


