/*
Problem: Subarray Sum Equals K
Platform: LeetCode
Approach: Prefix Sum with Hash Map (Frequency Counting)
Time Complexity: O(n)
Space Complexity: O(n)
Status: Accepted
*/

class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int, long long> mp;
        mp[0] = 1; // Base case for subarrays starting from index 0
        long long ans = 0, tot = 0;
        
        for(int i = 0; i < nums.size(); i++)
        {
            tot += nums[i];
            
            // If (prefix_sum - k) exists, add its frequency to the answer
            if(mp[tot - k] > 0)
            {
                ans += mp[tot - k];
            }
            
            // Record the current prefix sum frequency
            mp[tot]++;
        }
        return ans;
    }
};
