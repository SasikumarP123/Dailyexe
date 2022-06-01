package sasikumar;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		Vector<Integer> ve =new Vector<>();
		ve.add(10);
		ve.add(20);
		ve.add(30);
		ve.add(40);
		System.out.println("Vector Elements :"+ve);
		ve.add(4,50);
		ve.add(5,60);
		System.out.println("Vector Elements :"+ve);
		Vector<Integer> nm=new Vector<>();
		nm.add(70);
		nm.addAll(ve);
		System.out.println("New Vector Add Old Elements :"+nm);
		int a=nm.get(2);
		System.out.println("Index Elements :"+a);
		nm.remove(1);
		System.out.println("Remove Vector Elements :"+nm);
		nm.set(0,10);
		System.out.println("Insert Vector Element :"+nm);
		System.out.println("Vector Elements Size :"+nm.size());
		nm.toArray();		
		System.out.print("Array Vector : "+nm);
		nm.toString();
		System.out.print("String Vector : "+nm);
		
	
				
				
		
		//nm.removeAll(nm);
		//System.out.println("RemoveAll Vector Elements :"+nm);
		// TODO Auto-generated method stub

	}

}
