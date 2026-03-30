class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int index = 0; index < nums.length; index++) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[index] == nums[i]) {
                    count++;
                }
            }
            if (count > 1) {
                return true;
            }
        }
        return false;
    }
}