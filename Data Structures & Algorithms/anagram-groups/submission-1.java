class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String word : strs) {
         char[] charAnagram = word.toCharArray();
         Arrays.sort(charAnagram);
         String keyString = new String(charAnagram);
         if (anagrams.containsKey(keyString)) {
            List<String> tempList = anagrams.get(keyString);
            tempList.add(word);
            anagrams.put(keyString, tempList);
         } else {
            List<String> tempList = new ArrayList<>();
            tempList.add(word); 
            anagrams.put(keyString, tempList);
         }
      }
      return new ArrayList<>(anagrams.values());
   }
}
