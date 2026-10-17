class Solution {
    public int[] twoSum(int[] nums, int target) {
    int diff;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
        diff = target - nums[i];
        if (map.containsKey(diff)) {
          System.out.println(map.get(diff) + " " + i);
          return new int[]{map.get(diff), i};
        }
        map.put(nums[i], i);
    }
    return null;
}
}
