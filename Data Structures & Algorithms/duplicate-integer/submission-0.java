class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (i == 0){
                hm.put(nums[i], 1);
            } else {
                if (!hm.containsKey(nums[i])){
                    hm.put(nums[i], 1);
                } else {
                    return true;
                }
            }
        }
                    return false;
    }
}