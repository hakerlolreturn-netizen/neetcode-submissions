class Solution {
    public int[] productExceptSelf(int[] nums) {
    int[] result = new int[nums.length];
    result[0] = 1;
    int prefix = 1;
    int postfix = 1;
    for (int i = 1; i < nums.length; i++){
      result[i] = nums[i - 1] * prefix;
      prefix = nums[i - 1] * prefix;
    }
    for (int i = nums.length - 1; i >= 0; i--){
      result[i] = result[i] * postfix;
      postfix = nums[i] * postfix;
    }

    return result;
    }
}  


