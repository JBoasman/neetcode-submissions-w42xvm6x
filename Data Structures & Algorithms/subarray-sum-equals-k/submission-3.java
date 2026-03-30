class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> record = new HashMap<>();
        int count = 0;
        int prev = 0;
        record.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + prev;
            if (record.containsKey(nums[i] - k)) {
                count += record.get(nums[i] - k);
            }
            record.put(nums[i], record.getOrDefault(nums[i], 0) + 1);
            prev = nums[i];
        }
        return count;
    }
}