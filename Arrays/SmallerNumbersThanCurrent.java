/*
Problem: How Many Numbers Are Smaller Than the Current Number
Platform: LeetCode
Approach: Brute Force Comparison
Time Complexity: O(n²)
Space Complexity: O(n)
Status: Accepted
*/

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[] = new int[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    if (nums[i] > nums[j]) {
                        count++;
                    }
                }
            }

            arr[i] = count;
            count = 0;
        }

        return arr;
    }
}
