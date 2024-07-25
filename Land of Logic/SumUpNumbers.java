// CodeMaster has just returned from shopping. He scanned the check of the items 
// he bought and gave the resulting string to Ratiorg to figure out the total number of purchased items. 
// Since Ratiorg is a bot he is definitely going to automate it, so he needs a program that sums up all the numbers which appear 
// in the given input.

// Help Ratiorg by writing a function that returns the sum of numbers that appear in the given inputString

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static int solution(String inputString) {
        // Inicializar la variable para almacenar la suma de números
        int sum = 0;

        // Definir una expresión regular para encontrar números enteros, positivos o negativos
        String regex = "-?\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputString);

        // Paso 1: Encontrar los números y sumarlos
        while (matcher.find()) {
            try {
                int num = Integer.parseInt(matcher.group());
                sum += num;
            } catch (NumberFormatException e) {
                // Ignorar si el número no es válido
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String inputString = "abcdefghijklmnopqrstuvwxyz1AbCdEfGhIjKlMnOpqrstuvwxyz23,74 -";
        int sum = solution(inputString);
        System.out.println("La suma de los números en la cadena es: " + sum);
    }
}
