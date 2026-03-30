class Solution {
    public int searchInsert(int[] nums, int target) {
        return searchHelper(nums, target, 0, (nums.length-1));
    }
    public int searchHelper(int[] nums, int target, int min, int max) {
        if (min > max) {
            return max + 1;
        }

        int newMiddle = (min + (max-min)/2);
        
        if (target == nums[newMiddle]) {
            return newMiddle;
        }

        if (target < nums[newMiddle]) { //target is between min and newMiddle
            return searchHelper(nums, target, min, newMiddle-1);
        } else { //target is between newMiddle and max
            return searchHelper(nums, target, newMiddle+1, max);
        }
    }
}