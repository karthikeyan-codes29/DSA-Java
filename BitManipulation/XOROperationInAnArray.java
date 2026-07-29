/*
Problem: XOR Operation in an Array
Platform: LeetCode
Approach: Bitwise XOR Traversal
Time Complexity: O(n)
Space Complexity: O(1)
Status: Accepted
*/

class Solution {
    public int xorOperation(int n, int start) {

        int result = 0;

        for (int i = 0; i < n; i++) {
            result = result ^ (start + 2 * i);
        }

        return result;
    }
}
