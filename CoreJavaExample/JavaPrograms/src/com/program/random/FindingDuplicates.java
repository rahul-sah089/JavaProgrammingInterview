package com.program.random;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingDuplicates {
	public static void main(String[] args) {

		List<Integer> duplicates = returnList();
		System.out.println("Original List-->"+duplicates);
		System.out.println("Duplicate List"+duplicateSet(duplicates));

	}

	public static Set<Integer> duplicateSet(List<Integer> target) {
		Set<Integer> duplicates = new HashSet<Integer>();
		for (int i = 0; i < target.size(); i++) {
			for (int j = 0; j < target.size(); j++) {
				if (i == j) {
					break;
				} else if (target.get(i) == target.get(j)) {
					duplicates.add(target.get(i));
				}
			}
		}
		return duplicates;
	}

	public static List<Integer> returnList() {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(12);
		numbers.add(34);
		numbers.add(12);
		numbers.add(12);
		numbers.add(23);
		numbers.add(12);
		numbers.add(89);
		numbers.add(89);
		numbers.add(98);
		numbers.add(1);
		return numbers;
	}
}
