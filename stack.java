package sasikumar;
import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println("Stack Elements: "+s);
		s.pop();
		System.out.println("Stack Remove Last Elements: "+s);
		s.peek();
		System.out.println("Stack Element Peek:"+s);
		int n=s.search(20);
		System.out.println("Stack Element Peek:"+n);
		
		// TODO Auto-generated method stub

	}

}
