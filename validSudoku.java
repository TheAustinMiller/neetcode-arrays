public boolean isValidSudoku(char[][] board) {
        // Check rows
        for (int i = 0; i < board.length; i++) {
            ArrayList<Integer> check1 = new ArrayList<>();
            HashSet<Integer> check2 = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    check1.add(board[i][j] - '0');
                    check2.add(board[i][j] - '0');
                }
            }
            if (check1.size() != check2.size()) {
                return false;
            }
        }

        // Check columns
        for (int i = 0; i < board[0].length; i++) {
            ArrayList<Integer> check1 = new ArrayList<>();
            HashSet<Integer> check2 = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] != '.') {
                    check1.add(board[j][i] - '0');
                    check2.add(board[j][i] - '0');
                }
            }
            if (check1.size() != check2.size()) {
                return false;
            }
        }

        // Check 3x3 sub-boxes
        for (int x = 0; x < 9; x += 3) {
            for (int y = 0; y < 9; y += 3) {
                if (!checkBox(board, x, y)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean checkBox(char[][] board, int startX, int startY) {
        ArrayList<Integer> check1 = new ArrayList<>();
        HashSet<Integer> check2 = new HashSet<>();
        for (int i = startX; i < startX + 3; i++) {
            for (int j = startY; j < startY + 3; j++) {
                if (board[i][j] != '.') {
                    check1.add(board[i][j] - '0');
                    check2.add(board[i][j] - '0');
                }
            }
        }
        return check1.size() == check2.size();
    }
