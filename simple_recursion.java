package sasikumar;

public class simple_recursion {
	static int count=0;
	static void sasi()
	{
		
	count++;
		if(count<=5)
		{
		System.out.println(" Java "+count);
		sasi();
	}}
	
	/*static void sasi()
	{
		System.out.println(" Java ");
		sasi();
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sasi();

	}

}
