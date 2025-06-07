class Solution {
    public int trap(int[] a) {
        int n=a.length;
        int res=0;
        for(int i=0;i<n-1;i++)
        {
            int r=a[i];
            for(int j=0;j<i;j++)
            r=Math.max(r,a[j]);
            int l=a[i];
            for(int j=i+1;j<n;j++)
            l=Math.max(l,a[j]);
            res=res+Math.min(l,r)-a[i];
        }
        return res;
    }
}