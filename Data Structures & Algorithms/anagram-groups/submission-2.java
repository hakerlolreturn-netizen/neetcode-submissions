class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    if (strs == null || strs.length == 0) {
      return new ArrayList<>();
    }
    if (strs.length == 1) {
      return Collections.singletonList(Collections.singletonList(strs[0]));
    }
    HashMap<List<Integer>, List<String>> map = new HashMap<>();
    for (String str : strs) {
      int[] count = new int[26];
      for (int i = 0; i < str.length(); i++) {
        count[str.charAt(i) - 'a']++;
      }
      List<Integer> key = Arrays.stream(count).boxed().toList();
      map.computeIfAbsent(key, k-> new ArrayList<>()).add(str);
    }
    return new ArrayList<>(map.values());
}
}