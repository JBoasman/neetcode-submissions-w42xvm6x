class Solution {
    public int searchInsert(int[] nums, int target) {
        int min = 0;
        int max = nums.length-1;
        while (min <= max) {

            int newMiddle = (min + (max-min)/2);
            
            if (target == nums[newMiddle]) {
                return newMiddle;
            }

            if (target < nums[newMiddle]) { //target is between min and newMiddle
                max = newMiddle-1;
            } else { //target is between newMiddle and max
                min = newMiddle+1;
            }
        }
        return max + 1;
    }
}