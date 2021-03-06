package generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MixingGenericNonGeneric {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(12);
		myList.add(23);
		myList.add(52);
		myList.add(1);
		myList.add(4);
		Adder adder = new Adder();
		int sum = adder.addAll(myList);
		System.out.println("Sum of list element-->" + sum);

	}
}

class Adder {
	int addAll(List list) {
		Iterator itr = list.iterator();
		int sum = 0;
		while (itr.hasNext()) {
			sum += ((Integer) itr.next()).intValue();
		}
		return sum;
	}
}
