class Solution {
    public boolean isValidSudoku(char[][] board) {
            for (int i = 0; i < board[0].length; i++) {
      HashSet<Integer> set = new HashSet<>();
    Set<Integer> setRows = new HashSet<>();
      Set<Integer> setColumns = new HashSet<>();
      for (int j = 0; j < board[0].length; j++) {
        int row = i / 3 * 3 + j / 3;
        int column = i % 3 * 3 + j % 3;
        int boxEl = board[row][column] - '1';
        int rowEl = board[i][j] - '1';
        int columnEl = board[j][i] - '1';
        if (board[row][column] != '.' && !set.add(boxEl)) {
            return false;
        } if (board[i][j] !='.' && !setRows.add(rowEl)) {
          return false;
        } if (board[j][i] !='.' && !setColumns.add(columnEl)) {
          return false;
        }
      }
    }
    return true;
    }
}
