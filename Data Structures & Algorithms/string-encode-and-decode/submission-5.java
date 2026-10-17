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
    char[] chars = str.toCharArray();
    int wordLen = Character.getNumericValue(chars[0]);
    for (int i = 1; i < chars.length; i++) {
      if (Character.isDigit(chars[i])) {
          wordLen = wordLen * 10 + Character.getNumericValue(chars[i]);
          continue;
      }
        if (wordLen == 0) {
          result.add("");
        } else {
            String word = String.valueOf(chars, i + 1, wordLen);
            result.add(word);
        }
        i += wordLen + 1;
        if (i >= chars.length) {
          break;
        }
        wordLen = Character.getNumericValue(chars[i]);
      }
    System.out.println(result);
    return result;
  }
}
