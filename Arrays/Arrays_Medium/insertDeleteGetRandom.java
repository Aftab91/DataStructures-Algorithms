package Arrays.medium_problems;

import java.util.*;



public class insertDeleteGetRandom {

	public static boolean insert(List<Integer> list, Map<Integer, Integer> map, int val) {
		if (map.containsKey(val))
			return false;

		map.put(val, list.size());
		list.add(val);
		return true;
	}

	public static boolean remove(List<Integer> list, Map<Integer, Integer> map, int val) {
		if (!map.containsKey(val))
			return false;

		int index = map.get(val);
		int lastElement = list.get(list.size() - 1);
		list.set(index, lastElement);
		map.put(lastElement, index);
		map.remove(val);
		list.remove(list.size() - 1);
		return true;
	}

	public static int getRandom(List<Integer> list, Random random) {
		if (list.isEmpty())
			return -1; // Return a default value indicating failure.

		int randomIdx = random.nextInt(list.size());
		return list.get(randomIdx);
	}
	
	public static void main(String[] args) {
		List<Boolean> results = new ArrayList<>();

		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		Random random = new Random();

		String[] commands = {"insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"};
		int[] values = {1, 2, 2, 0, 1, 2, 0};

		for (int i = 0; i < commands.length; i++) {
			String command = commands[i];
			int value = values[i];

			if (command.equals("insert")) {
				results.add(insert(list, map, value));
			} else if (command.equals("remove")) {
				results.add(remove(list, map, value));
			} else if (command.equals("getRandom")) {
				results.add(getRandom(list, random) == value);
			}
		}

		System.out.println(results);

	}
}

