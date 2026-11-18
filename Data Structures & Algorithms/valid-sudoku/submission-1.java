class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean answer = true;
        // Check rows
        for (int i = 0; i < board[0].length; i++) {
            answer &= isValidRow(board[i]);
        }
        //Check colums
        for (int i = 0; i < board.length; i++) {
            answer &= isValidColumn(board, i);
        }
        //Check boxes
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                answer &= isValidBox(i,j,board);
            }
        }
        return answer;
    }

    private boolean isValidRow(char[] row) {
        Set<Character> rowSet = new HashSet<>();
        for (char c : row) {
            if (c != '.') {
                if (rowSet.contains(c)) {
                    return false;
                }
                rowSet.add(c);
            }
        }
        return true;
    }

    private boolean isValidColumn(char[][] board, int col) {
        Set<Character> colSet = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            char c = board[i][col];
            if (c != '.') {
                if (colSet.contains(c)) {
                    return false;
                }
                colSet.add(c);
            }
        }
        return true;
    }

    private boolean isValidBox(int topLeftX, int topLeftY, char[][] board) {
        Set<Character> boxSet = new HashSet<>();
        for (int i = topLeftX; i < topLeftX + 3; i++) {
            for (int j = topLeftY; j < topLeftY + 3; j++) {
                char c = board[i][j];
                if ( c != '.') {
                    if (boxSet.contains(c)) {
                        return false;
                    }
                    boxSet.add(c);
                }
            }
        }
        return true;
    }


}