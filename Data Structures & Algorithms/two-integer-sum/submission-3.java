class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> targetSearch = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            targetSearch.put(target - nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            if (targetSearch.containsKey(nums[j]) && targetSearch.get(nums[j]) != j) {
                return new int[] {j, targetSearch.get(nums[j])};
            }
        }
        return null;
    }
}
