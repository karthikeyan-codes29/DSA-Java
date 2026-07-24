/*
Problem: Pow(x, n)
Platform: LeetCode
Approach: Built-in Math.pow()
Time Complexity: O(log n) (implementation-dependent)
Space Complexity: O(1)
Status: Accepted
*/

class Solution {
    public double myPow(double x, int n) {
        double result = Math.pow(x, n);
        return result;
    }
}
