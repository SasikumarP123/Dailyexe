package sasikumar;

public class simplepattern {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) // row
		{
			for(int j=0;j<5-i;j++) //column print
			{
			System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) //column print
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
