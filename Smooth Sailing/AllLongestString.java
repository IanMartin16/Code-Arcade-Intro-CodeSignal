class Solution {
    public static String[] solution(String[] inputArray) {
        // Crear una lista para almacenar las cadenas con la longitud máxima
        List<String> result = new ArrayList<>();
    
        // Inicializar la variable para almacenar la longitud máxima encontrada hasta el momento
        int maxLength = 0;
    
        // Recorrer cada cadena en el arreglo inputArray usando el bucle for-each
        for (String str : inputArray) {
            // Obtener la longitud de la cadena actual
            int len = str.length();
    
            // Comparar la longitud actual con la longitud máxima encontrada hasta el momento
            if (len > maxLength) {
                // Si la longitud actual es mayor, limpiar la lista result y agregar la cadena actual
                result.clear();
                result.add(str);
                maxLength = len;
            } else if (len == maxLength) {
                // Si la longitud actual es igual a la longitud máxima, agregar la cadena actual a la lista result
                result.add(str);
            }
        }
    
        // Convertir la lista result en un arreglo de cadenas y devolverlo
        return result.toArray(new String[result.size()]);
    }
}


