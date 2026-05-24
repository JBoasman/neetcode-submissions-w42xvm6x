class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int formular = size * (size + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (formular - sum);
    } 
}
