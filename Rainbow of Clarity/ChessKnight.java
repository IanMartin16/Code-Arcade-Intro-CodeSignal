public class Solution {
    public static int solution(String cell) {
        // Definimos las posibles combinaciones de movimientos del caballo en el tablero
        int[][] moves = {{-2, -1}, {-1, -2}, {-2, 1}, {-1, 2}, {2, -1}, {1, -2}, {2, 1}, {1, 2}};
        
        // Obtenemos las coordenadas 'x' e 'y' de la celda en el tablero
        int x = cell.charAt(0) - 'a'; // La coordenada 'x' se obtiene restando el valor ASCII de la letra 'a' al carácter actual
        int y = cell.charAt(1) - '1'; // La coordenada 'y' se obtiene restando el valor ASCII del número '1' al carácter actual
        
        // Inicializamos el contador de movimientos posibles a partir de la celda actual
        int count = 0;
        
        // Iteramos sobre las posibles combinaciones de movimientos
        for (int[] move : moves) {
            // Obtenemos las coordenadas 'dx' y 'dy' del movimiento actual
            int dx = move[0];
            int dy = move[1];
            
            // Calculamos las nuevas coordenadas 'newX' y 'newY' después del movimiento
            int newX = x + dx;
            int newY = y + dy;
            
            // Verificamos si las nuevas coordenadas están dentro del tablero de ajedrez (8x8)
            // Si es así, incrementamos el contador de movimientos posibles
            if (newX >= 0 && newX < 8 && newY >= 0 && newY < 8) {
                count++;
            }
        }
        
        // Devolvemos el total de movimientos posibles desde la celda actual
        return count;
    }

    public static void main(String[] args) {
        String cell = "c3";
        int possibleMoves = solution(cell);
        System.out.println("Movimientos posibles desde la celda " + cell + ": " + possibleMoves);
    }
}


// Given a position of a knight on the standard chessboard, find the number of different moves the knight can perform.

// The knight can move to a square that is two squares horizontally and one square vertically, 
// or two squares vertically and one square horizontally away from it. 
// The complete move therefore looks like the letter L. 
// Check out the image below to see all valid moves for a knight piece that is placed on one of the central squares