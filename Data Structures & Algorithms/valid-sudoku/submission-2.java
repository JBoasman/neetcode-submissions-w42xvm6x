class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int x = 0; x < 9; x++) {
            if (!colCheck(board, x)) {
                return false;
            }
        }
        for (int y = 0; y < 9; y++) {
            if (!rowCheck(board[y])) {
                return false;
            }
        }
        

        return boxCheck(board);
    }

    public boolean rowCheck(char[] row) {
        Set<Character> seen = new HashSet<>();
        for (Character c : row) {
            if (c == '.') {
                continue;
            } else if (seen.contains(c)) {
                return false;
            } else {
                seen.add(c);
            }
        }
        return true;
    }

    public boolean colCheck(char[][] board, int x) {
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            Character c = board[i][x];
            if (c == '.') {
                continue;
            } else if (seen.contains(c)) {
                return false;
            } else {
                seen.add(c);
            }
        }
        return true;
    }

    public boolean boxCheck(char[][] board) {
        
        for (int x = 0; x < 9; x += 3) {
            for (int y = 0; y < 9; y += 3) { //top left corner of each box starting point 
            Set<Character> seen = new HashSet<>(); //Own hash set for each box
                for (int i = x; i < x + 3; i++) {
                    for (int j = y; j < y + 3; j++) { //each square in each box
                        Character c = board[j][i];
                        if (c == '.') {
                            continue;
                        } else if (seen.contains(c)) {
                            return false;
                        } else {
                            seen.add(c);
                        }
                    }

                }
            }
        }
        return true;
    }
}
