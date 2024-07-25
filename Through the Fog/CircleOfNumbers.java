class Solution {
    public int solution(int n, int firstNumber) {
        //calculate the opposite position by adding n/2 to firstNumber
        int opposite = firstNumber + n/2;
        
        // If opposite position is greater or equal to n, subtract n to get the corresponding number on the circle.
        if (opposite >= n) {
            opposite -= n;
        }
        return opposite;
    
    }
}

