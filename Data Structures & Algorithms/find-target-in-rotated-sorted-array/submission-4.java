class Solution {
    public int search(int[] nums, int target) {
       int right = nums.length -1;
       int left = 0;
       int output = -1;
       while (left <= right) {
            int mid = (left + (right - left)/2);
            if (nums[mid] == target) {
                output = mid;
                left = right+1;
            } else if ((nums[mid] < target && nums[right] <= target && nums[mid] > nums[right]) || (nums[mid] > target && nums[right] >= target && nums[mid] > nums[right]) || (nums[mid] < target && nums[right] >= target)){
                //if mid and right are both less than target, target is between them, if mid is greater than right; (rotated end/start is between)
                //if mid and right are both greater than targer, target is between them if mid is greater than right; (rotated end/start is between)
                left = mid + 1;
            } else {
                right = mid - 1;
            } 
       }
       return output; 
    }
}
