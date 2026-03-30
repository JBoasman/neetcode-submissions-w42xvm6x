class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                count++;
            }
            int total = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                total = total + nums[j];
                if (total == k) {
                    count++;
                }
            }
        }
        return count;
    }
}