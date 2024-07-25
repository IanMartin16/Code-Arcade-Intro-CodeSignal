//Check if the given string is a correct time representation of the 24-hour clock

public class Main {

    public static boolean solution(String time) {
        // Paso 1: Dividir la cadena en horas y minutos
        String[] timeParts = time.split(":");

        if (timeParts.length != 2) {
            // Si no hay exactamente dos partes (horas y minutos), es incorrecto
            return false;
        }

        try {
            // Paso 2: Convertir las partes de la hora y los minutos a números enteros
            int hours = Integer.parseInt(timeParts[0]);
            int minutes = Integer.parseInt(timeParts[1]);

            // Paso 3: Verificar que las horas y minutos estén dentro del rango válido
            if (hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException e) {
            // Si no se pueden convertir las partes de la hora y los minutos a números enteros, es incorrecto
            return false;
        }
    }

    public static void main(String[] args) {
        String time1 = "13:58";
        String time2 = "25:51";
        String time3 = "02:76";

        System.out.println("¿Es \"" + time1 + "\" una representación correcta de la hora? " + solution(time1));
        System.out.println("¿Es \"" + time2 + "\" una representación correcta de la hora? " + solution(time2));
        System.out.println("¿Es \"" + time3 + "\" una representación correcta de la hora? " + solution(time3));
    }
}
