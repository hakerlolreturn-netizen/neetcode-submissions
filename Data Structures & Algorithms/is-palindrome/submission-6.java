class Solution {
    public boolean isPalindrome(String s) {
    char[] arr = s.toLowerCase().toCharArray();
      int left = 0;
      int right = arr.length - 1;
      boolean flag = true;
      while (left <= right) {
        while (!Character.isLetterOrDigit(arr[left]) && left <arr.length - 1) {
          left++;
        }
        while (!Character.isLetterOrDigit(arr[right]) && right > 0) {
          right--;
        }
        if (left > right) {
            return true;
        }
        if (arr[left] != arr[right]) {
          return false;
        }
        left++;
        right--;
        flag = true;
      }
      return true;
    }
}
