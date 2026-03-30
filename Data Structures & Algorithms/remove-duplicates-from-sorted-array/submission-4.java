class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int lastUnique = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[lastUnique]) {
                nums[lastUnique++ + 1] = nums[i];
            }
        }
        return lastUnique + 1;
    }
}