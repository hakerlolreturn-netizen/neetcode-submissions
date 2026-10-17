class Solution {
    public int[] productExceptSelf(int[] nums) {
int[] result = new int[nums.length];
    int[] prefixArray = new int[nums.length];
    prefixArray[0] = 1;
    int[] suffixArray = new int[nums.length];
    suffixArray[nums.length - 1] = 1;
    for (int i = 1; i < nums.length; i++){
        prefixArray[i] = nums[i - 1] * prefixArray[i - 1];
    }
    for (int i = nums.length - 2; i >= 0; i--){
      suffixArray[i] = nums[i + 1] * suffixArray[i + 1];
    }

    for (int i = 0; i < result.length; i++) {
      result[i] = prefixArray[i] * suffixArray[i];
    }

    return result;
    }
}  


