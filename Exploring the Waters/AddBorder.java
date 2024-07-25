class Solution {
    public static String[] solution(String[] picture) {
        // Obtener el número de filas y columnas en el arreglo "picture"
        int rows = picture.length;
        int cols = picture[0].length();
        
        // Crear un nuevo arreglo "result" con una fila y columna adicional (margen de asteriscos)
        String[] result = new String[rows + 2];
        
        // Inicializar cada fila en "result" con una cadena que contiene asteriscos
        for (int i = 0; i < result.length; i++) {
            // Crear una nueva cadena con "cols + 2" caracteres, y reemplazar '\0' con '*'
            result[i] = new String(new char[cols + 2]).replace('\0', '*');
        }
        
        // Rellenar el contenido de cada fila en "result" con los datos del arreglo "picture"
        for (int i = 1; i <= rows; i++) {
            // Agregar un asterisco al principio y al final de cada fila en "result"
            // para crear un margen de asteriscos alrededor del contenido original en "picture"
            result[i] = "*" + picture[i - 1] + "*";
        }
        
        // Devolver el arreglo "result" con el contenido del arreglo "picture" rodeado por asteriscos
        return result;
    }
}


