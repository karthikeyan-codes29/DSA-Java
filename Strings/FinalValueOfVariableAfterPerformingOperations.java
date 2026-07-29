/*
Problem: Final Value of Variable After Performing Operations
Platform: LeetCode
Approach: String Traversal
Time Complexity: O(n)
Space Complexity: O(1)
Status: Accepted
*/

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(1) == '+') {
                X = X + 1;
            } else if (operations[i].charAt(1) == '-') {
                X = X - 1;
            }
        }

        return X;
    }
}
