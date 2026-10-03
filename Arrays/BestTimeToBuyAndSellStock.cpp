/*
Problem: Best Time to Buy and Sell Stock
Platform: LeetCode
Approach: Suffix Maximum Array
Time Complexity: O(n)
Space Complexity: O(n)
Status: Accepted
*/

class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        if (n == 0) return 0;
        
        int max1 = 0;
        int su[n];
        for(int i = n - 1; i >= 0; i--)
        {
            max1 = max(max1, prices[i]);
            su[i] = max1;
        }
        int tpro = 0;
        for(int i = 0; i < n - 1; i++)
        {
            int cpro = su[i] - prices[i];
            tpro = max(tpro, cpro);
        }
        return tpro;
    }
};
