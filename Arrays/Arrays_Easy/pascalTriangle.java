package Arrays.easy_problems;
import java.util.List;
import java.util.ArrayList;
public class pascalTriangle {


	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();

		for (int i = 1; i <= numRows; i++) {
			List<Integer> currentRow = new ArrayList<>();
			List<Integer> prevRow = (i > 1) ? result.get(i - 2) : null;

			currentRow.add(1);

			if (prevRow != null) {
				for (int j = 1; j < i - 1; j++) {
					currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
				}
			}

			if (i > 1) {
				currentRow.add(1);
			}

			result.add(currentRow);
		}

		return result;
	}

	public static void main(String[] args) {

		// Example usage
		int numRows = 5; // Replace with the desired number of rows
		List<List<Integer>> result = generate(numRows);

		// Printing the generated Pascal's triangle
		for (List<Integer> row : result) {
			System.out.println(row);
		}
	}
}
