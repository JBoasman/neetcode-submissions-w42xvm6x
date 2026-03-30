class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            
            if (i == nums.length -1) {
                    return false;
            }
            
            for (int j = 1; j <= k; j++) {
                if (i + j < nums.length) {
                    if (nums[i] == nums[i + j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}