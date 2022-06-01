package sasikumar;
import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> arr1=new ArrayList<>();
		arr1.add("Kumar");
		arr1.add("Sasi");
		arr1.add(1,"mano");
		System.out.println("Initializing arraylist:"+arr1);
		arr1.set(1,"san");
		System.out.println("Uptating Arraylist:"+arr1);
		arr1.remove(1);
		System.out.println("Remove any one in arratlist:"+arr1);
		//arr1.clear();
		System.out.println("Clear arraylist:"+arr1);
		
		//change ArrayList into Array
		
		String i[]=new String[arr1.size()];
		arr1.toArray(i);
				
		for(String n:i) //for_each 
		{
			System.out.print("Array : "+n);
		}
		System.out.println();		

	}


}
