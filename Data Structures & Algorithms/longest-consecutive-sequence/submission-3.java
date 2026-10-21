class Solution {
    public int longestConsecutive(int[] nums) {
            if (nums == null || nums.length == 0) {
      return 0;
    }
            int res = 1;
    int temporaryRes = 1;
    HashSet<Integer> set = new HashSet<>(nums.length);
    for (int num : nums) {
      set.add(num);
    }
    int startOfTheSequence;
    for (int num : set) {
      if (!set.contains(num - 1)) {
        startOfTheSequence = num;
        while (set.contains(startOfTheSequence + 1)) {
          if (set.contains(startOfTheSequence + 1)) {
            startOfTheSequence = startOfTheSequence + 1;
            temporaryRes++;
          }
        }
        res = Math.max(temporaryRes, res);
        temporaryRes = 1;
      }
    }
    return res;
    }
}
