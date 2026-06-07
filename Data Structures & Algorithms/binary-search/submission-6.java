class Solution {
    public int search(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;
        while (min <= max) { //can point at the same element, only stops when min passes max
            int mid = (min + (max - min) / 2); //finds mid point
            if (nums[mid] == target) { //if mid is poionting at at target, return index
                return mid;
            } else if (nums[mid] > target) { //elses for min/max
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }
}
