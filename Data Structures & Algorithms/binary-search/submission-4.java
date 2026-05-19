class Solution {
    public int search(int[] nums, int target) {
        int min = 0;
        int max = nums.length-1;

        while (min <= max) {
            int pointer = (min + (max-min)/2);
            
            if (target == nums[pointer]) {
                return pointer;
            }

            if (target < nums[pointer]) { //target is between min and pointer
                max = pointer-1;
            } else { //target is between pointer and max
                min = pointer+1;
            }
        }
        
        return -1;
    }
}