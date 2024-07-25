class Solution {
    public static int solution(int[] inputArray) {
        // Inicializar la variable "solution" con el valor mínimo posible para enteros
        int solution = Integer.MIN_VALUE;
    
        // Recorrer el arreglo desde el índice 0 hasta el penúltimo elemento
        for (int i = 0; i < inputArray.length - 1; i++) {
            // Calcular el producto de los elementos adyacentes en el arreglo
            int product = inputArray[i] * inputArray[i + 1];
    
            // Comprobar si el producto actual es mayor que el valor almacenado en "solution"
            // Si es así, actualizar "solution" con el valor del producto
            if (product > solution) {
                solution = product;
            }
        }
    
        // Devolver el valor máximo encontrado en el arreglo de productos
        return solution;
    }

}




//Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.