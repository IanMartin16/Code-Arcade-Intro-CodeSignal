import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static String[] solution(String[] names) {
        Map<String, Integer> fileCountMap = new HashMap<>();
        String[] result = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            String currentName = names[i];
            int count = fileCountMap.getOrDefault(currentName, 0);

            if (count > 0) {
                // Si encontramos un nombre repetido, agregamos un sufijo "(k)" al nombre
                String newName = currentName + "(" + count + ")";
                
                // Verificamos si el nuevo nombre ya existe en el mapa
                while (fileCountMap.containsKey(newName)) {
                    // Si el nombre ya existe, incrementamos "k" hasta encontrar un sufijo único
                    count++;
                    newName = currentName + "(" + count + ")";
                }
                
                // Actualizamos el conteo del nombre original y agregamos el nuevo nombre único al mapa
                fileCountMap.put(newName, 1);
                fileCountMap.put(currentName, count + 1);
                currentName = newName;
            } else {
                // Si es la primera vez que encontramos el nombre, lo agregamos al mapa con un conteo de 1
                fileCountMap.put(currentName, 1);
            }

            // Almacenamos el nombre actualizado en el resultado
            result[i] = currentName;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] names = {"file", "file", "image", "file(1)", "file"};
        String[] result = solution(names);
        for (String filename : result) {
            System.out.println(filename);
        }
    }
}



// You are given an array of strings names representing filenames. 
// The array is sorted in order of file creation, such that names[i] represents the name of a file created before names[i+1] 
// and after names[i-1] (assume 0-based indexing). Because all files must have unique names, 
// files created later with the same name as a file created earlier should have an additional (k) 
// suffix in their names, where k is the smallest positive integer (starting from 1) that does not appear in previous file names.

// Your task is to iterate through all elements of names (from left to right) and update all filenames based on the above. 
// Return an array of proper filenames.