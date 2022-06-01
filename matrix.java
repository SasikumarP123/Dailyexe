package sasikumar;

public class matrix {

	public static void main(String[] args) {
		int a[][]= {{1,2},{3,4}};
		int b[][]= {{5,6,7},{8,9,10}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				int sum=0;
				int c;
				for(int k=0;k<b.length;k++)
				{
					c=a[i][k]*b[k][j];
					sum += c;
					
				}
				System.out.print(sum+" ");
				
			}
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
 