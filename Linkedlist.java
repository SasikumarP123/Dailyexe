package sasikumar;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> al = new LinkedList<>();
		al.add(101);
		al.add(102);
		al.add(103);
		al.add(104);
		al.add(105);
		al.add(106);
		al.add(107);
		al.add(108);
		System.out.println("LinkedList : "+al);
	    al.get(2);
		System.out.println("Get Element :"+al);
		al.set(2,109);
		al.set(3,110);
		System.out.println("Set LinkedList : "+al);
		al.remove(2);
		al.remove(2);
		System.out.println("Remove LinkedList : "+al);
		
		System.out.println("LinkedList Indexof : "+al.indexOf(al));
		System.out.println("LinkedList Lastindexof : "+al.lastIndexOf(al));
		System.out.println("LinkedList : "+al);
		al.clear();
		System.out.println("LinkedList clear : "+al);
		

	}

}
