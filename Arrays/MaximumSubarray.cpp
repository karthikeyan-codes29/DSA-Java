/*
Problem: Maximum Subarray
Platform: LeetCode
Approach: Kadane's Algorithm
Time Complexity: O(n)
Space Complexity: O(1)
Status: Accepted
*/

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int maxsum = 0;
        int sum = 0;
        int countN = 0;
        int max = nums[0];

        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] < 0) {
                countN++;
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        for (int i = 0; i < nums.size(); i++) {
            if (countN == nums.size()) {
                return max;
            }

            sum = sum + nums[i];

            if (sum < 0) {
                sum = 0;
            }

            if (sum > maxsum) {
                maxsum = sum;
            }
        }

        return maxsum;
    }
};
