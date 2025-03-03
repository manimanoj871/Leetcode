class Solution {
    public int totalFruit(int[] fruits) {
        int start=0,end=0,max=0;
        int n=fruits.length;
        Map<Integer,Integer>map=new HashMap<>();
        while(end<n)
        {
            map.put(fruits[end],map.getOrDefault(fruits[end],0)+1);
            if(map.size()>2)
            {
                while(map.size()>2)
                {
                    map.put(fruits[start],map.get(fruits[start])-1);
                    if(map.get(fruits[start])==0)
                    map.remove(fruits[start]);
                    start++;
                }
            }
            if(map.size()<=2) {
                max=Math.max(max,end-start+1);
            }
            end++;
        }
        return max;
        
    }
}