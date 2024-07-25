class Solution {
    public class ChessSolution {
        public static boolean solution(String bishop, String pawn) {
            // Obtener las coordenadas de la posición del alfil
            int bishopRow = bishop.charAt(1) - '0';
            int bishopCol = bishop.charAt(0) - 'a' + 1;
    
            // Obtener las coordenadas de la posición del peón
            int pawnRow = pawn.charAt(1) - '0';
            int pawnCol = pawn.charAt(0) - 'a' + 1;
    
            // Verificar si el alfil puede capturar al peón en un solo movimiento
            return Math.abs(bishopRow - pawnRow) == Math.abs(bishopCol - pawnCol);
        }
    
        public static void main(String[] args) {
            String bishop = "c4";
            String pawn = "f7";
    
            boolean canCapture = solution(bishop, pawn);
    
            System.out.println("Can the bishop capture the pawn? " + canCapture);
        }
    }
}

