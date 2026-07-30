/*
Problem: Defanging an IP Address
Platform: LeetCode
Approach: String Traversal
Time Complexity: O(n)
Space Complexity: O(n)
Status: Accepted
*/

class Solution {
    public String defangIPaddr(String address) {
        String address2 = "";

        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                address2 = address2 + "[.]";
            } else {
                address2 = address2 + address.charAt(i);
            }
        }

        return address2;
    }
}
