/*
Problem: Sqrt(x)
Platform: LeetCode
Approach: Binary Search
Time Complexity: O(log n)
Space Complexity: O(1)
Status: Accepted
*/

class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int low = 1;
        int high = x;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((long) mid * mid == x) {
                return mid;
            } else if ((long) mid * mid < x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
