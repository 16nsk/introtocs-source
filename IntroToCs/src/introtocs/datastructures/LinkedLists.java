package introtocs.datastructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {

	public static void main(String[] args) {
		// Working with LinkedLists
		
		LinkedList<String> gList = new LinkedList<String>();
		gList.add("Roast Beef");
		gList.add("Cheese");
		gList.add("Honey Wheat Bread");
		
		// gList.addFirst("Lettuce");
		// gList.addLast("Fruit Juice");
		
		// gList.remove(0);
		// gList.removeFirst();
		
		// System.out.println(gList.getFirst());
		// System.out.println(gList.getLast());	
		
		// ListIterator MUST be initiated after the List creation or alteration
		
		ListIterator<String> iter = gList.listIterator();
		
		/*if (iter.hasNext()) {
			String next = iter.next();
			System.out.println(next);
		}*/
		
		if (iter.hasNext()) {
			iter.next();
			iter.add("Lettuce");
		}
		
		if (iter.hasNext()) {
			iter.next();
			iter.remove();
		}
				
		for (String item: gList) {
			System.out.println(item + " ");
		}

	}

}
