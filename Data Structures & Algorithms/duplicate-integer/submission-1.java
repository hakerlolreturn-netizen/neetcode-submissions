class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> hm = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (i == 0){
                hm.add(nums[i]);
            } else {
        if (!hm.contains(nums[i])) {
          hm.add(nums[i]);
        } else {
          return true;
        }
            }
        }
                    return false;
    }
}