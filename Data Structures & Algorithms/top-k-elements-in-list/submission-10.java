class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] output = new int[k]; 

        //Hashmap of every value and its frequency
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int n : nums) {
            frequency.put(n, frequency.getOrDefault(n, 0) + 1);
        }

        //putting every value in a bucket at an index that corresponds with its frequency
        List<Integer>[] buckets = new List[nums.length + 1];
        
        for (Map.Entry<Integer, Integer> e : frequency.entrySet()) {
            int f = e.getValue();
            if (buckets[f] == null) {
                buckets[f] = new ArrayList<>();
            }
            buckets[f].add(e.getKey());
        }


        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
                for (int n : buckets[i]) {
                    output[k - 1] = n;
                    k--;
                    
                    if (k == 0) {
                        return output;
                    }
                } 
            }
        }
        return output;
    }
}
