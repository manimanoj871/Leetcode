class Solution {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int pre=0;
        for(int i:nums)
        {
            pre+=i;
            int remove=pre-k;
            count+=map.getOrDefault(remove,0);
            map.put(pre,map.getOrDefault(pre,0)+1);

        }
       return count;     
    }
}