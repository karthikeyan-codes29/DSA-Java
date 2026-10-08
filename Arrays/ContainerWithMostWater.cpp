/*
Problem: Container With Most Water
Platform: LeetCode
Approach: Two Pointers
Time Complexity: O(n)
Space Complexity: O(1)
Status: Accepted
*/

class Solution {
public:
    int maxArea(vector<int>& height) {
        int n = height.size();
        int i = 0;
        int j = n - 1;
        int wh = 0;
        int w = 0;
        int tw = 0;

        while (i < j) {
            wh = min(height[i], height[j]);
            w = j - i;

            int cw = wh * w;
            tw = max(cw, tw);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return tw;
    }
};
