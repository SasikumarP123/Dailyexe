package sasikumar;
import java.util.*;

public class swap_arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(40);
		a.add(20);
		a.add(30);
		a.add(10);
		System.out.println("ArrayList: "+a);
		Collections.swap(a, 0, 3);
		System.out.println("After swap: "+a);
		
		// TODO Auto-generated method stub

	}

}
