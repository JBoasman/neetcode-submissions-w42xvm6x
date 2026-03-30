class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) { return 0;}
        Arrays.sort(nums);
        int countBig = 0;
        int currentCount = 0;
        int lastVal = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == lastVal + 1) {
                currentCount = currentCount + 1;
                if (currentCount > countBig) {
                    countBig = currentCount;
                }
                lastVal = nums[i];
            } else if (nums[i] != lastVal) {
                currentCount = 0;
                lastVal = nums[i];
            }
        }
        return countBig + 1;
    }
}
