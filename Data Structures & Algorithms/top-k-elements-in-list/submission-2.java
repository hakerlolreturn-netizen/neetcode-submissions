class Solution {
    public int[] topKFrequent(int[] nums, int k) {
              HashMap<Integer, Integer> map = new HashMap<>();
      int[] max = new int[k];
      int[] maxKeys = new int[k];
      int minIndex = 0;
      int prevMinIndex = -1;
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      for (int i = 0; i < max.length; i++) {
        if (max[i] < max[minIndex]) {
          minIndex = i;
        }
      }
      if (max[minIndex] < entry.getValue()) {
        max[minIndex] = entry.getValue();
        maxKeys[minIndex] = entry.getKey();
        prevMinIndex = minIndex;
      }
    }
    return maxKeys;
    }
}
