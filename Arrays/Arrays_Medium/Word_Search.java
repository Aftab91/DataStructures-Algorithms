package Arrays.medium_problems;
import java.util.*;
public class Word_Search {

    public static boolean exist(char[][] board, String word) {
        char c = word.charAt(0);
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (c == board[i][j] && sub(board, word, i, j, 0, m, n, c))
                    return true;

        return false;
    }

    static boolean exist(char[][] board, String word, int i, int j, int index, int m, int n) {
        if (word.length() == index)
            return true;
        char c = word.charAt(index);

        if (i > 0 && board[i - 1][j] == c
                && sub(board, word, i - 1, j, index, m, n, c)) //top
            return true;
        if (i < m - 1 && board[i + 1][j] == c
                && sub(board, word, i + 1, j, index, m, n, c)) //down
            return true;
        if (j > 0 && board[i][j - 1] == c && sub(board, word, i, j - 1, index, m, n, c)) //left
            return true;
        if (j < n - 1 && board[i][j + 1] == c) //right
            return sub(board, word, i, j + 1, index, m, n, c);

        return false;
    }

    static boolean sub(char[][] board, String word, int i, int j,
                int index, int m, int n, char c) {
        board[i][j] = 0;
        if (exist(board, word, i, j, index + 1, m, n))
            return true;
        else board[i][j] = c;
        return false;
    }

	public static void main(String[] args) {
		char[][] board = {
				{'A', 'B', 'C', 'E'},
				{'S', 'F', 'C', 'S'},
				{'A', 'D', 'E', 'E'}
		};
		String word = "ABCCED";
		boolean result = exist(board, word);
		System.out.println("Output: " + result);
	}
}
