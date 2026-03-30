class Solution {
    public int[] productExceptSelf(int[] nums) {
        int productTotal = 1;
        int zeroCount = 0;
        int[] output = new int[nums.length];
        for (int num : nums) {
            productTotal = productTotal * num;
            if (num == 0) {
                zeroCount++;
            }
        }
        if (zeroCount == 0) {
            for (int i = 0; i < nums.length; i++) {
                output[i] = productTotal / nums[i];
            }
        }
        if (zeroCount > 1) {
            for (int i = 0; i < nums.length; i++) {
                output[i] = 0;
            }
        }
        if (zeroCount == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    int newProductTotal = 1;
                    for (int j = 0; j < nums.length; j++) {
                        if (nums[j] != 0) {
                            newProductTotal = newProductTotal * nums[j];
                        }
                    }
                    output[i] = newProductTotal;
                } else {
                    output[i] = 0;
                }
            }
        }
        return output;
    }
}  
