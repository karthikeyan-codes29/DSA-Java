/*
Problem: Maximum Product of Two Elements in an Array
Platform: LeetCode
Approach: Find the Largest and Second Largest Elements
Time Complexity: O(n)
Space Complexity: O(1)
Status: Accepted
*/

class Solution {
    public int maxProduct(int[] nums) {
        int i, index1 = 0, index2 = 0;
        int max = nums[0];
        int max2 = Integer.MIN_VALUE;

        for (i = 0; i < nums.length; i++) {
            if (nums[i] >= max) {
                index1 = i;
                max = nums[i];
            }
        }

        for (int k = 0; k < nums.length; k++) {
            if (index1 != k) {
                if (nums[k] >= max2) {
                    if (nums[k] < max) {
                        index2 = k;
                        max2 = nums[k];
                    } else if (nums[k] == max) {
                        index2 = k;
                        max2 = nums[k];
                    }
                }
            }
        }

        return (nums[index1] - 1) * (nums[index2] - 1);
    }
}
