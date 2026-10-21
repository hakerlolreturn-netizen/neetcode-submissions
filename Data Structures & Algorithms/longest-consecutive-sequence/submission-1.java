class Solution {
    public int longestConsecutive(int[] nums) {
            if (nums == null || nums.length == 0) {
      return 0;
    }
            int res = 1;
    int temporaryRes = 1;
    HashSet<Integer> set =  Arrays.stream(nums)
        .boxed()
        .collect(Collectors.toCollection(HashSet::new));
    int startOfTheSequence;
    for (int num : set) {
      if (!set.contains(num - 1)) {
        startOfTheSequence = num;
        for (int i = 0; i < set.size(); i++) {
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
