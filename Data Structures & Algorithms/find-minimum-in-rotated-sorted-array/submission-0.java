class Solution {
    public int findMin(int[] nums) {
        int maxIndex = nums.length - 1;
        int minIndex = 0;

        while (minIndex < maxIndex) {
            int midIndex = minIndex + (maxIndex - minIndex)/2;
            int minVal = nums[minIndex];
            int maxVal = nums[maxIndex];
            int midVal = nums[midIndex];
            if (midVal < maxVal) {
                maxIndex = midIndex;
            } else {
                minIndex = midIndex + 1;
            } 
        }
        return nums[maxIndex];
    }
}
