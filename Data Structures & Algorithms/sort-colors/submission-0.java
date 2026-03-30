class Solution {
    public void sortColors(int[] nums) {
        int[] newNums = new int[nums.length]; 
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int elem : nums) {
            map.put(elem, map.getOrDefault(elem, 0) + 1);
        }
        int zeroVal = map.getOrDefault(0, 0);
        int oneVal = map.getOrDefault(1, 0);
        int twoVal = map.getOrDefault(2, 0);
        sortHelper(0, newNums, 0, zeroVal);
        sortHelper(zeroVal, newNums, 1, oneVal);
        sortHelper(oneVal + zeroVal, newNums, 2, twoVal);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = newNums[i];
        }
    }
    public void sortHelper(int index, int[] newNums, int val, int count) {
        while (count > 0) {
            newNums[index] = val;
            index++;
            count--;
        }
    }
}
