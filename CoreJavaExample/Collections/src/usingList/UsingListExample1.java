package usingList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Dog {
	public String name;

	Dog(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}

}

public class UsingListExample1 {
	public static void main(String[] args) {
		System.out.println("Main Method started");
		List<Dog> dogList = new ArrayList<Dog>();
		Dog dog1 = new Dog("Marry");
		Dog dog2 = new Dog("Tommy");
		Dog dog3 = new Dog("Rambo");
		Dog dog4 = new Dog("Rocky");

		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		dogList.add(dog4);

		Iterator<Dog> dogIterator = dogList.iterator();
		// printing all the element of dog list
		System.out.println("Printing the list of dogs");
		while (dogIterator.hasNext()) {
			Dog dog = dogIterator.next();
			System.out.println(dog);
		}
		System.out.println("Dog list content-->" + dogList);
		System.out.println("Dog list size-->" + dogList.size());
		System.out.println("get 1st index dog name-->" + dogList.get(1).name);
		dogList.remove(1);
		System.out.println("Dog list content after removal-->");
		System.out.println("Dog list content-->" + dogList);
		System.out.println("Dog list size-->" + dogList.size());

		// converting list to an array and iterating
		Object[] objArray = dogList.toArray();
		for (Object obj : objArray) {
			Dog dog2Dog = (Dog) obj;
			System.out.println(dog2Dog);
		}

		System.out.println("Main Method Ended");
	}
}
