class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0,end=0;
        int zero=0;
        int max=0;
        int n=nums.length-1;
        while(end<n)
        {
            if(nums[end]==0) 
            zero++;
            if(zero>k)
            {
                if(nums[start]==0)
                zero--;
                start++;
            }
            if(zero<=k)
            max=Math.max(max,(end-start)+1);
            end++;

        }
        return max;
    }
}