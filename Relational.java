package sasikumar;
import java.util.Scanner;
public class Relational {

	public static void main(String[] args) {
		try(Scanner sc =new Scanner(System.in)){
		System.out.println("Enter the num:");
		int a=sc.nextInt();
		switch (a)
		{
		case 1:
			if(a==1)
			{
				System.out.println("Equal to 1");
				break;
				
			}
			
		case 2:
			if(a==2)
			{
				System.out.println("Equal to 2");
				break;
			}
		case 3:
			if(a<=3&&a<=5)
			{
				System.out.println("range between 3 and 5");
				break;
				
			}
		
	default:
	
			
			{
				System.out.println("Out of range");
				break;
			}
			
		}
		
		}
	}

}
