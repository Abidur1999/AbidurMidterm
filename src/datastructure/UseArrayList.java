package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<Integer> ArrayList = new ArrayList<>(2);

		ArrayList.add(10);
		ArrayList.add(20);
		ArrayList.add(30);
		ArrayList.add(40);
		ArrayList.add(95);

		// Retrieving data using For Each

		System.out.println("The ArrayList items by using For Each:");
		for(Integer item: ArrayList)
			System.out.println(item);

		// Retrieving data using iterator

		System.out.println("The ArrayList items by using iterator interface:");
		Iterator iterator = ArrayList.iterator();

		while(iterator.hasNext())
			System.out.println(iterator.next());

		for (Integer integer : ArrayList) System.out.println(integer);

		ArrayList.remove(Integer.valueOf(40));
		System.out.println("Removed 40. Now the ArrayList content is:");
		for(Integer item: ArrayList)
			System.out.println(item);

		System.out.println("Retrieving element at index 2: " + ArrayList.get(2));
	}

}

