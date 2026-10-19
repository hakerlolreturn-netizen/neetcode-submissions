class Solution {
    public boolean isValidSudoku(char[][] board) {
            for (int i = 0; i < board[0].length; i++) {
      HashSet<Integer> set = new HashSet<>();
    Set<Integer> setRows = new HashSet<>();
      Set<Integer> setColumns = new HashSet<>();
      for (int j = 0; j < board[0].length; j++) {
        int row = i / 3 * 3 + j / 3;
        int column = i % 3 * 3 + j % 3;
        String el = String.valueOf(board[row][column]);
                String rowEl = String.valueOf(board[i][j]);
        String columnEl = String.valueOf(board[j][i]);
        if (!".".equals(el) && !set.add(Integer.valueOf(el))) {
            return false;
        } if (!".".equals(rowEl) && !setRows.add(Integer.valueOf(rowEl))) {
          return false;
        } if (!".".equals(columnEl) && !setColumns.add(Integer.valueOf(columnEl))) {
          return false;
        }
      }
    }
    return true;
    }
}
