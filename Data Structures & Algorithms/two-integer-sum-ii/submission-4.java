class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (numbers[start] + numbers[end] != target) {
            if (numbers[start] + numbers[end] > target) { //biggest possible end number
                end--;
            } else { //smallest possible start number
                start++;
            }
        }
        int[] result = new int[2];
        result[0] = start + 1;
        result[1] = end + 1;
        return result;
    }
}
