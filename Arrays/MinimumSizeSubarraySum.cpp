/*
Problem: Minimum Size Subarray Sum
Platform: LeetCode
Approach: Sliding Window
Time Complexity: O(n)
Space Complexity: O(1)
Status: Accepted
*/

class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int n=nums.size();
        int sum=0;
        int ans=n+1;
        int start=0;

        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];

            while(sum>=target)
            {
                ans=min(ans,i-start+1);
                sum=sum-nums[start];
                start++;
            }
        }

        if(ans==n+1)
        {
            return 0;
        }
        
        return ans;
    }
};
