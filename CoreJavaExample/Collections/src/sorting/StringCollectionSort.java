package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class StringCollectionSort {
	public static void main(String[] args){
		ArrayList<String> stuff = new ArrayList<String>();
		stuff.add("Rahul");
		stuff.add("Siddharth");
		stuff.add("Sandhya");
		stuff.add("Anjali");
		System.out.println("Unsorted collection-->"+stuff);
		Collections.sort(stuff);
		System.out.println("After sorting collection-->"+stuff);
	}
}
