package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader<words> {

	//public static void main(String[] args) {
	/*
	 * User API to read the below textFile and print to console.
	 * Use BufferedReader class.
	 * Use try....catch block to handle Exception.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
	 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
	 * order from LinkedList and retrieve as FILO order from Stack.
	 *
	 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
	 * Use For Each loop/while loop/Iterator to retrieve data.
	 */
	ArrayList<String> words = new ArrayList<>();
	LinkedList<String> list = new LinkedList<>();
	Stack<String> dataStack = new Stack<>();

		try {
		String textFile = "/Users/Abidur/Desktop/MidtermJuly2019/src/data/self-driving-car";

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(textFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		assert fr != null;
		br = new BufferedReader(fr);

		String data = "";
		while (true) {
			try {
				if ((data = br.readLine()) == null) break;
			} catch (IOException e) {
				e.printStackTrace();
			}
			String textData = data;
			System.out.println(textData);

		}




	} catch(
	private IOException ex1){
		assert false;
		ex1.printStackTrace();
	}
		(
	private String str : words {
		dataStack.add(str);
		final var add = list.add(str);

	}

	public DataReader(String str) {
		this.str = str;
	}
	//System.out.println(dataStack.peek());
	//	System.out.println(list.peek());



	private static void printStack(Stack<String> st) {
		if (st.isEmpty())
			return;
		String word = st.pop();
		System.out.print(word + " ");
		printStack(st);
		st.push(word);
	}
}
