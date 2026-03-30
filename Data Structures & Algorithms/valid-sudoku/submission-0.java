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
        if (boxesDuplicate(board)) return false;
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
    public boolean boxesDuplicate(char[][] board) {
    // Jump by 3 to find the start of each 3x3 box
    for (int boxRow = 0; boxRow < 9; boxRow += 3) {
        for (int boxCol = 0; boxCol < 9; boxCol += 3) {
            
            // New set for every 3x3 box
            HashSet<Character> seen = new HashSet<>();
            
            // Traverse the 3x3 area starting at (boxRow, boxCol)
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    char val = board[boxRow + r][boxCol + c];
                    
                    if (val != '.') {
                        if (seen.contains(val)) return true; // Found duplicate
                        seen.add(val);
                    }
                }
            }
        }
    }
    return false; // All 9 boxes are clean
}
}

