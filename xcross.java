package sasikumar;
import java.util.Scanner;
import java.lang.String;

public class xcross {

	public static void main(String[] args) 
	{
		try (var in = new Scanner(System.in)) {
			System.out.println("Enter the string:");
			String str=in.next();
			
			for(int i=1;i<=str.length();i++)
			{
				for(int j=1;j<=str.length();j++) 
				{
				if(i==j)
				{
					System.out.print(str.charAt(i-1));
					
				}
				else if(i+j==(str.length()+1))
				{
					System.out.print(str.charAt(str.length()-i));
				}
				else
				{
					System.out.print(" ");
				}
			// TODO Auto-generated method stub

				}
			System.out.println();
			}
		}
		}
	}

