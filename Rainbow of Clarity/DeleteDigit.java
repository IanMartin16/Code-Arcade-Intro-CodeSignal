public class Solution {
    public static int solution(int n) {
        // Convertimos el número entero 'n' a una cadena de caracteres 'numStr'
        String numStr = Integer.toString(n);
        
        // Inicializamos una variable para almacenar el máximo número posible
        int maxNum = Integer.MIN_VALUE;
        
        // Iteramos sobre cada dígito de la cadena 'numStr'
        for (int i = 0; i < numStr.length(); i++) {
            // Creamos una copia mutable de 'numStr' usando StringBuilder
            StringBuilder sb = new StringBuilder(numStr);
            
            // Eliminamos el dígito actual de la cadena usando 'deleteCharAt(i)'
            sb.deleteCharAt(i);
            
            // Convertimos la cadena modificada nuevamente a un número entero 'newNum'
            int newNum = Integer.parseInt(sb.toString());
            
            // Actualizamos 'maxNum' con el valor máximo entre 'maxNum' y 'newNum'
            maxNum = Math.max(maxNum, newNum);
        }
        
        // Devolvemos el valor máximo encontrado después de eliminar un dígito de 'n'
        return maxNum;
    }

    public static void main(String[] args) {
        int n = 12345;
        int maxNumber = solution(n);
        System.out.println("Máximo número posible después de eliminar un dígito de " + n + ": " + maxNumber);
    }
}


// Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.