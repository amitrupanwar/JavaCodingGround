
package code.practice.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arr= new ArrayList();
		arr.add("String from gen arrlist");
		arr.add(1);
		arr.add(1.2344);

		System.out.println("ArrayList :- " + arr);

		System.out.println("Display ArrayList using enhanced for loop");
		for(Object obj:arr) {
			System.out.print(" " + obj);
		}

		System.out.println("\nCheck if String exists in arrlist :- "  + arr.contains("String from gen arrlist"));
		arr.remove(1);
		System.out.println("ArrayList after removing 1:- " + arr);
		
		arr.add(12);
		System.out.println("ArrayList after adding 12:- " + arr);

		Iterator itr= arr.iterator();
		System.out.println("Display ArrayList using Iterator :- ");
		while(itr.hasNext()) {
			System.out.print(" " + itr.next());
		}



		arr.set(1, "Adding at index 1");
		System.out.println("\nArrayList :- " + arr);
	}
}
