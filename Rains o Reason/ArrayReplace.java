class Solution {
    public int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
        // Utilizar Java Streams para procesar el arreglo "inputArray"
        return Arrays.stream(inputArray)
                // Utilizar el método "map" para aplicar una función a cada elemento del arreglo
                .map(n -> n == elemToReplace ? substitutionElem : n)
                // Convertir el resultado en un nuevo arreglo y retornarlo
                .toArray();
    }
}

