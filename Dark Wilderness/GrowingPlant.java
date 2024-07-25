class Solution {
    int solution(int upSpeed, int downSpeed, int desiredHeight) {
        int currentHeight = 0;
        int days = 0;
        while (currentHeight < desiredHeight) {
            currentHeight += upSpeed;
            days++;
            if (currentHeight >= desiredHeight) {
                break;
            }
            currentHeight -= downSpeed;
        }
        return days;
    }
}



//This function uses a while loop to simulate the growth of the plant. Inside the loop, 
//it first adds the amount that the plant grows each day (upSpeed) to the current height, 
//then increments the day counter (days). If the plant has now reached the desired height, 
//the loop is broken and the number of days is returned.

//If the plant has not yet reached the desired height, 
//the function then subtracts the amount that the plant shrinks each night (downSpeed) from the current height. 
//This simulates the loss of growth due to lack of sunlight. The loop then repeats until the plant has reached the desired height.
