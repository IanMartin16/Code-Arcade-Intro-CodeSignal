class Solution {
    public static int solution(int[][] matrix) {
        int sum = 0;
        Set<Integer> hauntedCols = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    hauntedCols.add(j);
                } else if (!hauntedCols.contains(j)) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
}



//Este código es un método llamado "solution" que toma como entrada una matriz de enteros llamada "matrix" y devuelve un entero llamado "sum". 
//El objetivo del método es sumar todos los valores en la matriz, excepto aquellos que se encuentran en columnas que contienen al menos un cero.

//Aquí hay una explicación línea por línea del código:

//public static int solution(int[][] matrix) {

//Esto define el método "solution" como público y estático, lo que significa que se puede acceder desde cualquier parte del programa 
//sin necesidad de crear una instancia de la clase en la que se define el método. 
//El método toma una matriz de enteros como entrada y devuelve un entero.
//int sum = 0;

//Inicializa una variable entera llamada "sum" con un valor de cero. Esta variable se utilizará para sumar los valores de la matriz.
//Set<Integer> hauntedCols = new HashSet<>();

//Crea un conjunto llamado "hauntedCols" que contendrá los índices de las columnas que contienen al menos un cero. 
//El conjunto se inicializa como un nuevo objeto HashSet, que es una clase que implementa la interfaz Set y se utiliza 
//para almacenar elementos únicos en una colección.
//for (int i = 0; i < matrix.length; i++) {

//Este bucle for se ejecutará una vez por cada fila en la matriz. El contador i se inicializa en cero y se incrementa en uno en cada iteración 
//hasta que sea menor que la longitud de la matriz.
//for (int j = 0; j < matrix[i].length; j++) {

//Este bucle for se ejecutará una vez por cada elemento en la fila actual. El contador j se inicializa en cero y se incrementa 
//en uno en cada iteración hasta que sea menor que la longitud de la fila actual.
//if (matrix[i][j] == 0) {
//hauntedCols.add(j);

//Si el valor actual de la matriz es cero, entonces el índice de la columna (j) se agrega al conjunto de "hauntedCols".
//} else if (!hauntedCols.contains(j)) {
//sum += matrix[i][j];

//Si el valor actual de la matriz no es cero y la columna actual (j) no está en el conjunto de "hauntedCols", entonces se suma al valor de "sum".

//Termina el bloque de la declaración "if-else" dentro del bucle for.

//Termina el bucle for que itera sobre cada elemento en la fila actual.

//Termina el bucle for que itera sobre cada fila en la matriz.
//return sum;

//Devuelve el valor de "sum", que es la suma de todos los elementos de la matriz que no están en columnas "encantadas" por ceros.