/*
Problem: Trapping Rain Water
Platform: LeetCode
Approach: Prefix and Suffix Maximum Arrays
Time Complexity: O(n)
Space Complexity: O(n)
Status: Accepted
*/

class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();
        if (n == 0) return 0;
        
        int pre[n];
        int suf[n];
        
        int max1 = height[0];
        for(int i = 0; i < n; i++)
        {
            max1 = max(max1, height[i]);
            pre[i] = max1;
        }
        
        int max2 = height[n-1];
        for(int i = n - 1; i >= 0; i--)
        {
            max2 = max(max2, height[i]);
            suf[i] = max2;
        }
        
        int tH = 0;
        int WaH = 0;
        for(int i = 0; i < n; i++)
        {
            int lb = pre[i];
            int rb = suf[i];
            int he = min(lb, rb);
            tH = he - height[i];
            WaH = WaH + tH;
        }
    
        return WaH;
    }
};
