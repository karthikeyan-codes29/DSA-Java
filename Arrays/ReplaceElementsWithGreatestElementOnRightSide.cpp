/*
Problem: Replace Elements with Greatest Element on Right Side
Platform: LeetCode
Approach: Suffix Maximum
Time Complexity: O(n)
Space Complexity: O(n)
Status: Accepted
*/

class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        int n = arr.size();
        vector<int> su(arr.size());

        int max1 = arr[n - 1];
        su[n - 1] = -1;

        for (int i = n - 1; i > 0; i--) {
            max1 = max(max1, arr[i]);
            su[i - 1] = max1;
        }

        return su;
    }
};
