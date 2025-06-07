class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i = 0, rem = 0, j = 0;
        while (i < nums.size()) {
            j = i + 1;
            if (i + 1 < nums.size() && nums[i] == nums[i + 1]) {
                j = i + 2;
                nums[i - rem] = nums[i];
                nums[i - rem + 1] = nums[i + 1];
                while (j < nums.size() && nums[j] == nums[i]) {
                    j++;
                    rem++;
                }
                i = j;
            } else {
                nums[i - rem] = nums[i];
                i++;
            }
        }
        return nums.size() - rem;
    }
};