package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<String, List<String>> palindromes = new HashMap<>();
		palindromes.put("a", Arrays.asList("A nut for a jar of tuna", "Avid diva"));
		palindromes.put("b", Arrays.asList("Borrow or rob", "Bombard a drab mob"));
		palindromes.put("c", Arrays.asList("civic", "10 amendments"));
		palindromes.put("d", Arrays.asList("desaturated", "Did Hannah see bees? Hannah did"));
		palindromes.put("e", Arrays.asList("Allegory of the cave","King Author"));

		System.out.println("The Map items by using iterator interface:");

		for (Map.Entry<String, List<String>> stringListEntry : palindromes.entrySet()) {
			System.out.println(((Map.Entry) stringListEntry).getKey() + " palindromes: " + ((Map.Entry) stringListEntry).getValue());
		}

		System.out.println("\nThe Map items by using For Each:");
		for(String key: palindromes.keySet()) {
			System.out.println(key + " palindromes: ");
			for(String item: palindromes.get(key))
				System.out.println(item);
			System.out.println();
		}


	}

	}


