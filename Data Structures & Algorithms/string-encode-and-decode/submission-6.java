class Solution {
  private String separator = "#";

  public String encode(List<String> strs) {
    if (strs == null || strs.isEmpty()) {
      return "";
    }
    StringBuilder sb = new StringBuilder();
    for (String str : strs) {
      sb.append(str.length()).append(separator).append(str);
    }
    return sb.toString();
  }

    public List<String> decode(String str) {
    if (str == null || str.isEmpty()) {
      return new ArrayList<>();
    }
    List<String> result = new ArrayList<>();
    int wordLen = Character.getNumericValue(str.charAt(0));
    for (int i = 1; i < str.length(); i++) {
      if (Character.isDigit(str.charAt(i))) {
          wordLen = wordLen * 10 + Character.getNumericValue(str.charAt(i));
          continue;
      }
        if (wordLen == 0) {
          result.add("");
        } else {
            String word = str.substring(i + 1, i + 1 + wordLen);
            result.add(word);
        }
        i += wordLen + 1;
        if (i >= str.length()) {
          break;
        }
        wordLen = Character.getNumericValue(str.charAt(i));
      }
    return result;
  }
}
