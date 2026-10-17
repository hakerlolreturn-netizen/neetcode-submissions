class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();
            for (int num : nums) {
      if (!hm.add(num)) {
        return true;
      }
    }
    return false;
  }
}