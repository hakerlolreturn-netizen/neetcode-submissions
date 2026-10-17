class Solution {
    public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    char[] charsS = s.toCharArray();
    char[] charsT = t.toCharArray();
    HashMap<Character, Integer> setResS = new HashMap<>();
    HashMap<Character, Integer> setResT = new HashMap<>();
    for (int i = 0; i < charsS.length; i++) {
      setResS.merge(charsS[i], 1, Integer::sum);
      setResT.merge(charsT[i], 1, Integer::sum);
    }
    return setResS.equals(setResT);
    }
}
