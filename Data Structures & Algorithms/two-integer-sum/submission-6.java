class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> targetSearch = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (targetSearch.containsKey(complement)) {
                return new int[] {targetSearch.get(complement), i};
            }
            targetSearch.put(nums[i], i);
        }
        return null;
    }
}
