class Solution {
    public static boolean solution(int[] sequence) {
        if (sequence == null || sequence.length <= 2) {
            return true;
        }
        
        int count = 0;
        for (int i = 1; i < sequence.length; i++) {
            if (sequence [i] <= sequence[i -1]) {
                count++;
                if (count > 1 || (i > 1 && i < sequence.length -1 && sequence[i -1] >= sequence[i +1] && sequence [i -2] >= sequence[i])) {
                    return false;
                }
            }
        }
        return true;   
    }
}




//Este código comprueba si una secuencia de enteros es una secuencia de aumento casi creciente. 
//Una secuencia de aumento casi creciente es aquella en la que se permite a lo sumo un número que no sigue 
//la tendencia de crecimiento de la secuencia.

//El código comienza verificando si la secuencia es nula o tiene una longitud menor o igual a 2. 
//En estos casos, se considera que la secuencia es una secuencia de aumento casi creciente.

//Luego, el código recorre la secuencia de enteros comparando cada número con el número anterior. 
//Si el número actual es menor o igual que el número anterior, se incrementa un contador.

//Si el contador es mayor que 1, significa que la secuencia no es casi creciente y devuelve falso. 
//Si el contador es igual a 1, se verifica si el número actual es menor o igual al número anterior al anterior o 
//si el número siguiente es menor o igual al número actual. 
//Si se cumple alguna de estas condiciones, la secuencia no es casi creciente y devuelve falso.

//Si no se cumple ninguna de las condiciones anteriores, la secuencia se considera casi creciente y devuelve verdadero.