class Solution {
    public static int solution(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxSum = sum;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}



//Este código calcula la suma máxima posible de k elementos consecutivos en el arreglo nums. 
//Utiliza un enfoque de ventana deslizante para calcular la suma de los primeros k elementos y luego recorre el resto del arreglo, 
//actualizando la suma restando el elemento que se sale de la ventana y sumando el elemento que entra. En cada iteración, 
//compara la suma actual con la máxima suma anterior y actualiza la máxima suma si es necesario. Al final, devuelve la suma máxima encontrada.