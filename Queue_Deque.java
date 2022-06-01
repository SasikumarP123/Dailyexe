package sasikumar;

import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;
public class Queue_Deque {

	public static void main(String[] args) {
		/*Queue <Integer> li=new LinkedList <>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		System.out.println("Queue:"+li);
		li.peek();
		System.out.println("Access Element: "+li);
		li.poll();
		System.out.println("Remove Element: "+li);
		li.offer(60);
		System.out.println("Import Last Element: "+li);
		*/
		
		// TODO Auto-generated method stub
		Deque<Integer> de=new LinkedList<>();
		de.add(20);
		de.addFirst(10);
		de.addLast(30);
		System.out.println("LinkedList Deque: "+de);
		de.add(40);
		de.addFirst(60);
		de.addLast(50);
		System.out.println("Add Element Deque List: "+de);
		de.removeFirst();
		de.removeLast();
		System.out.println("Remove Element Deque List: "+de);
	}

}
