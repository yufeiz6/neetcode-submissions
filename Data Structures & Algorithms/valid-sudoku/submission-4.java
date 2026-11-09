class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] row = new HashSet[9];
        Set<Character>[] col = new HashSet[9];
        Set<Character>[] grid = new HashSet[9];

        for (int i = 0; i < board.length; i++) {
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            grid[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') {
                    continue;
                }

                int g = (i/3)*3 + (j/3);
                if (row[i].contains(c) || col[j].contains(c) || grid[g].contains(c)) {
                    return false;
                }

                row[i].add(c);
                col[j].add(c);
                grid[g].add(c);
            }
        
        }
        return true;
    }
}
