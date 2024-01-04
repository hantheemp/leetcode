class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {

        sort(nums.begin(), nums.end());

        for (int index = 0; index < nums.size() -1; index++)
            if (nums[index] == nums [index + 1])
            return true;
        return false;
    }
};