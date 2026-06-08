class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] toTheRight = new int[length];
        int[] toTheLeft = new int[length];
        int[] output = new int[length];
        toTheLeft[0] = 1;
        toTheRight[length-1] = 1;
        for (int i = 1; i < nums.length; i++) {
            toTheLeft[i] = nums[i - 1] * toTheLeft[i - 1];
        }
        for (int i = length - 2; i >= 0; i--) {
            toTheRight[i] = nums[i + 1] * toTheRight[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            output[i] = toTheRight[i] * toTheLeft[i];
        }
        return output;
    }
}  
