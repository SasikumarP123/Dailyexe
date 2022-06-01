package sasikumar;

public class reversepyramid {

	public static void main(String[] args) {
		int i,j,n=5,k;
		// TODO Auto-generated method stub
		for(i=0;i<=n-1;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<=n-1-i;k++)
			{
				
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
