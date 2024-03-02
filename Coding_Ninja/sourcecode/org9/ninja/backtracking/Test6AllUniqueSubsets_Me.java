package org9.ninja.backtracking;
import java.util.*;

public class Test6AllUniqueSubsets_Me {
	public static void printSubsets(int input[]) {

		Integer[] input1 = Arrays.stream(input).boxed().toArray(Integer[]::new);
		List<Integer> array = Arrays.asList(input1);
		List<List<Integer>> res = subsets(array);
		// Collections.sort(res);

		// Sort subsets lexicographically
		Collections.sort(res, (a, b) -> {
			int n = Math.min(a.size(), b.size());
			for (int i = 0; i < n; i++) {
				int cmp = a.get(i).compareTo(b.get(i));
				if (cmp != 0)
					return cmp;
			}
			return Integer.compare(a.size(), b.size());
		});

		// Print the generated subsets
		for (List<Integer> subset : res) {
			for (Integer num : subset) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}

	public static void calcSubset(List<Integer> A, Set<List<Integer>> res, List<Integer> subset, int index) {
		// Add the current subset to the result set
		res.add(new ArrayList<>(subset));

		// Generate subsets by recursively including and
		// excluding elements
		for (int i = index; i < A.size(); i++) {
			// Include the current element in the subset
			subset.add(A.get(i));

			// Recursively generate subsets with the current
			// element included
			calcSubset(A, res, subset, i + 1);

			// Exclude the current element from the subset
			// (backtracking)
			subset.remove(subset.size() - 1);
		}
	}

	public static List<List<Integer>> subsets(List<Integer> A) {
		List<Integer> subset = new ArrayList<>();
		Set<List<Integer>> res = new HashSet<>();

		int index = 0;
		calcSubset(A, res, subset, index);

		return new ArrayList<>(res);
	}
}
