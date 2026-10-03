/*
Problem: Max Number of K-Sum Pairs
Platform: LeetCode
Approach: Hash Map (Frequency Counting)
Time Complexity: O(n)
Space Complexity: O(n)
Status: Accepted
*/

class Solution {
public:
    int maxOperations(vector<int>& nums, int k) {
        unordered_map<int, int> mp;
        int count = 0;
        
        for(int i = 0; i < nums.size(); i++)
        {
            int req = k - nums[i];
            
            // If the complement exists with a frequency > 0, pair them up
            if(mp[req] > 0)
            {
                count++;
                mp[req]--;
            }
            else
            {
                mp[nums[i]]++;
            }
        } 
        return count;  
    }
};
