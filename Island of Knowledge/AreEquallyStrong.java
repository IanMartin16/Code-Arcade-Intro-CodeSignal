class Solution {
    public static boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        // Obtener el valor más fuerte entre tu mano izquierda y derecha
        int yourStrongest = Math.max(yourLeft, yourRight);
    
        // Obtener el valor más fuerte entre la mano izquierda y derecha de tu amigo
        int friendStrongest = Math.max(friendsLeft, friendsRight);
    
        // Comparar el valor más fuerte de tu mano con el valor más fuerte de la mano de tu amigo
        // Si son diferentes, significa que tienen diferentes cartas más fuertes y no coinciden, por lo que retorna "false"
        if (yourStrongest != friendStrongest) {
            return false;
        }
    
        // Obtener el valor más débil entre tu mano izquierda y derecha
        int yourWeakest = Math.min(yourLeft, yourRight);
    
        // Obtener el valor más débil entre la mano izquierda y derecha de tu amigo
        int friendWeakest = Math.min(friendsLeft, friendsRight);
    
        // Comparar el valor más débil de tu mano con el valor más débil de la mano de tu amigo
        // Si son diferentes, significa que tienen diferentes cartas más débiles y no coinciden, por lo que retorna "false"
        if (yourWeakest != friendWeakest) {
            return false;
        }
    
        // Si todas las comparaciones son iguales, significa que ambos tienen la misma carta más fuerte y la misma carta más débil
        // Por lo tanto, todas las cartas coinciden y retornamos "true"
        return true;
    }
}


