/*
Problem: Concatenation of Array
Platform: LeetCode
Approach: Array Traversal
Time Complexity: O(n)
Space Complexity: O(n)
Status: Accepted
*/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length * 2;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            if (i > n / 2 - 1) {
                ans[i] = nums[i - n / 2];
            } else {
                ans[i] = nums[i];
            }
        }

        return ans;
    }
}
