class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numsCounts = new HashMap<>();
        List<Integer>[] frequencyBuckets = new ArrayList[nums.length + 1];
        for (int num : nums) {
            numsCounts.put(num, numsCounts.getOrDefault(num, 0) + 1);
        }

        for (int key : numsCounts.keySet()) {
            int count = numsCounts.get(key);
            if (frequencyBuckets[count] == null) {
                frequencyBuckets[count] = new ArrayList<>();
            }
            frequencyBuckets[count].add(key);
        }
        
        
        int numberToReturn = k;
        int index = frequencyBuckets.length - 1;
        int[] returnList = new int[k];
        int returnIndex = 0;
        while (numberToReturn > 0) {
            if (frequencyBuckets[index] != null) {
                for (int elem : frequencyBuckets[index]) {
                    returnList[returnIndex++] = elem;
                    numberToReturn--;
                }
            }
            index--;
        }
        return returnList;
    }
}
