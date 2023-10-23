package Arrays.medium_problems;
import java.util.*;

public class mergeIntervals {


	public static int[][] merge(int[][] intervals) {
		if (intervals.length <= 1)
			return intervals;

		// Sort by ascending starting point
		Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

		List<int[]> result = new ArrayList<>();
		int[] newInterval = intervals[0];
		result.add(newInterval);

		for (int[] interval : intervals) {
			if (interval[0] <= newInterval[1]) // Overlapping intervals, merge
				newInterval[1] = Math.max(newInterval[1], interval[1]);
			else {                             // Disjoint intervals, add the new interval to the list
				newInterval = interval;
				result.add(newInterval);
			}
		}

		return result.toArray(new int[result.size()][]);
	}

	public static void main(String[] args) {

		// Example usage
		int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}}; // Replace with your input
		int[][] mergedIntervals = merge(intervals);

		for (int[] interval : mergedIntervals) {
			System.out.println("[" + interval[0] + ", " + interval[1] + "]");
		}
	}
}
