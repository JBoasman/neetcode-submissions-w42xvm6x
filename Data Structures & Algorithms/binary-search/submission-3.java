class Solution {
    public int search(int[] nums, int target) {
        return searchHelper(nums, target, 0, (nums.length - 1));
    }
       
    public int searchHelper(int[] nums, int target, int min, int max) {
        if (min > max) {
            return -1;
        }

        int pointer = (min + (max-min)/2);
        
        if (target == nums[pointer]) {
            return pointer;
        }

        if (target < nums[pointer]) { //target is between min and pointer
            return searchHelper(nums, target, min, pointer-1);
        } else { //target is between pointer and max
            return searchHelper(nums, target, pointer+1, max);
        }
    }
}