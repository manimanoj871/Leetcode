class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int pre[]=new int[n];
        pre[0]=nums[0];
        for(int i=1;i<n;i++)
        {
           pre[i]=nums[i]+pre[i-1];
        }
        int suf[]=new int[n];
        suf[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            suf[i]=suf[i+1]+nums[i];
        }
        int st=0,en=0;
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                st=0;
            }
            else
            st=pre[i-1];
            if(i==n-1)
            en=0;
            else
            en=suf[i+1];
            if(st==en)
            return i; 
        }
        return -1;
    }
}