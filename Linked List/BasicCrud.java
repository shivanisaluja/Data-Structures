package LinkedList;
import java.util.LinkedList;
public class CRUD {

	public static void main(String[] args) {

//object of Linked List
		LinkedList<String> colors = new LinkedList<String>();

//		Adding Elements
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		colors.addFirst("Pink");
		colors.addLast("Orange");

//printing colors
		System.out.println(colors);

//removing elements
		colors.remove("Pink");
		colors.removeFirst();

		System.out.println(colors);

//update
		colors.set(0, "purple");
		System.out.println(colors);

	}

}
