class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (char[] row : board) {
            if (rowDuplicate(row)) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (columnDuplicate(i, board)) {
                return false;
            }
        }
        for (int x = 0; x < 9; x += 3) {
            for (int y = 0; y < 9; y += 3) {
                if (boxDuplicate(x, y, board)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean rowDuplicate(char[] row) {
        HashSet<Character> seen = new HashSet<>();
        for (char box : row) {
            if (box != '.') {
                if (seen.contains(box)) {
                    return true;
                } else {
                    seen.add(box);
                }
            }
        }
        return false;
    }

    public boolean columnDuplicate(int i, char[][] board) {
        HashSet<Character> seen = new HashSet<>();
        for (char[] row : board) {
            if (row[i] != '.') {
                if (seen.contains(row[i])) {
                    return true;
                } else {
                    seen.add(row[i]);
                }
            } 
        }
        return false;
    } 

    public boolean boxDuplicate(int xAxis, int yAxis, char[][] board) {
        HashSet<Character> seen = new HashSet<>();
        for (int x = xAxis; x < xAxis + 3; x++) {
            for (int y = yAxis; y < yAxis + 3; y++) {
                if (board[x][y] != '.') {
                    if (seen.contains(board[x][y])) {
                        return true;
                    } else {
                        seen.add(board[x][y]);
                    }
                }
            }
        }
        return false;
    } 
}
