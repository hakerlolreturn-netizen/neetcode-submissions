class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    List<Integer>[] list = new List[nums.length + 1];
    for (int i = 0; i <= nums.length; i++) {
      list[i] = (new ArrayList<>());
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      list[entry.getValue()].add(entry.getKey());
    }
    int[] result = new int[k];
    int index = 0;
    for (int i = list.length - 1; i > 0 && index < k; i--) {
        if (list[i] ==  null) {
          continue;
        }
        for (int key : list[i]) {
          result[index] = key;
          index++;
        }
    }
    return result;
    }
}
