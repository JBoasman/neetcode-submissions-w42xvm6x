class Solution {
    public void rotate(int[] nums, int k) {
        int[] destination = new int[nums.length]; 
        int n = nums.length;
        k = k % n;
        System.arraycopy(nums, 0, destination, k, nums.length - k); 
        System.arraycopy(nums, nums.length - k, destination, 0, k);  
        for (int i = 0; i < nums.length; i++) {
            nums[i] = destination[i];
        }      
    }
}