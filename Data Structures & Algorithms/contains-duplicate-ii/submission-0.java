class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> memory = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (memory.containsKey(nums[i])) {
                if (Math.abs(i - memory.get(nums[i])) > k) {
                    memory.put(nums[i], i);
                } else {
                    return true;
                }
            }
            if (!memory.containsKey(nums[i])) {
                memory.put(nums[i], i);
            }
        }
        return false;
    }
}