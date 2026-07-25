/*
Problem: Length of Last Word
Platform: LeetCode
Approach: Reverse Traversal
Time Complexity: O(n)
Space Complexity: O(1)
Status: Accepted
*/

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }
}
