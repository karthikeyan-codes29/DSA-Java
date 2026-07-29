/*
Problem: Number of Steps to Reduce a Number to Zero
Platform: LeetCode
Approach: Simulation using Division and Subtraction
Time Complexity: O(log n)
Space Complexity: O(1)
Status: Accepted
*/

class Solution {
    public int numberOfSteps(int num) {
        int count = 0;

        while (num != 0) {

            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }

            count++;
        }

        return count;
    }
}
