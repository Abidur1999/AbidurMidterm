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
ArrayList<String> array = new ArrayList<>();

array.add("Canada");
array.add("NJ");
array.add("Washington");
array.add("Ohio");
array.add("Florida");
		System.out.println("Added All" + array);

		System.out.println("Gettting state name using While loop with Iterator");
		Iterator itr = array.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}
array.remove("NJ");
		System.out.println("Statename" + array);

		System.out.println("");
		System.out.println("Gettting state name using While loop with Iterator");

		for (String st : array){
			System.out.println(st);
		}
	}
}
