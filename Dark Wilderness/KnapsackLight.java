class Solution {
    int solution(int value1, int weight1, int value2, int weight2, int maxW) {
        int max = 0;
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                if (weight1 * i + weight2 * j <= maxW) {
                    int totalValue = value1 * i + value2 * j;
                    if (totalValue > max) {
                        max = totalValue;
                    }
                }
            }
        }
        return max;
    
    }
}




//This function uses two nested for loops to consider all possible combinations of taking or not taking each item. 
//The outer loop represents whether you take the first item (i=1) or not (i=0), 
//and the inner loop represents whether you take the second item (j=1) or not (j=0).

//For each combination, the function checks whether the total weight of the items is less than or equal to the maximum weight capacity. 
//If so, it calculates the total value of the items and checks whether it is greater than the current maximum value. 
//If it is, the maximum value is updated to the new total value.

//After checking all possible combinations, the function returns the maximum value that was found.