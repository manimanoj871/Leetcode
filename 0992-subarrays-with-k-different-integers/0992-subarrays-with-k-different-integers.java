import java.util.HashMap;

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

    private int atMostK(int[] nums, int k) {
        if (k == 0) return 0;  // Edge case
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0, count = 0;
        
        while (right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (map.size() > k) { // Shrink window if we exceed k distinct numbers
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]); // Remove from map if frequency becomes 0
                }
                left++;
            }

            count += right - left + 1; // Count valid subarrays
            right++;
        }
        
        return count;
    }
}
