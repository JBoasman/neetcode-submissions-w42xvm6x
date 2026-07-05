class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> output = new ArrayList<>();
      Map<String, Integer> anagramMap = new HashMap<>();
      for (String s : strs) {
         char[] asChars = s.toCharArray();
         Arrays.sort(asChars);
         String sortedS = new String(asChars);
         if (anagramMap.containsKey(sortedS)) {
            int subListIndex = anagramMap.get(sortedS);
            output.get(subListIndex).add(s);
         } else {
            int size = anagramMap.keySet().size();
            anagramMap.put(sortedS, size);
            List<String> subList = new ArrayList<>();
            subList.add(s);
            output.add(subList);
         }
      }
      return output;
   }
}
