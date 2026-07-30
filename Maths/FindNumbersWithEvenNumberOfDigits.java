/*
Problem: Find Numbers with Even Number of Digits
Platform: LeetCode
Approach: Count Digits
Time Complexity: O(n × d), where d is the number of digits
Space Complexity: O(1)
Status: Accepted
*/

class Solution {
    public int findNumbers(int[] nums) {

        int count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            int count1 = 0;
            int temp = nums[i];

            while (temp != 0) {
                count1++;
                temp = temp / 10;
            }

            if (count1 % 2 == 0) {
                count2++;
            }
        }

        return count2;
    }
}
