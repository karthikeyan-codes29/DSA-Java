/*
Problem: Reverse Integer
Platform: LeetCode
Approach: Reverse Number with Overflow Check
Time Complexity: O(log₁₀n)
Space Complexity: O(1)
Status: Accepted
*/

class Solution {
    public int reverse(int x) {
        long rev = 0;
        int digit;

        while (x != 0) {
            digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }

        if (rev >= -2147483648 && rev <= 2147483647) {
            return (int) rev;
        }

        return 0;
    }
}
