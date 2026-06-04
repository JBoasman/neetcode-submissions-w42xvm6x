class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] kList = new int[k];
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < k; i++) {
            int maxKey = Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();
            kList[i] = maxKey;
            count.remove(maxKey);
        }
        return kList; 
    }
}