class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] output = new int[k]; 

        //Hashmap of every value and its frequency
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int n : nums) {
            int current = frequency.getOrDefault(n, 0);
            frequency.put(n, current + 1);
        }

        //putting every value in a bucket at an index that corresponds with its frequency
        List<Integer>[] buckets = new List[nums.length + 1];
        
        for (int n : frequency.keySet()) {
            int f = frequency.get(n);
            if (buckets[f] == null) {
                buckets[f] = new ArrayList<>();
            }
            buckets[f].add(n);
        }

        int kStartIndex = buckets.length - 1;
        while (k > 0) {
            while (buckets[kStartIndex] == null) {
                kStartIndex--;
            }
            for (int n : buckets[kStartIndex]) {
                output[k - 1] = n;
                k--;
            }
            kStartIndex--;
        }

        return output;
    }
}
