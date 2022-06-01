package sasikumar;
import java.util.Arrays;

public class Bubble_sort {
	
	public static void bubblesort(int []ar)
	{
		int temp;
		for(int i=1;i<ar.length;i++)
		{
			for(int j=0;j<ar.length-i;j++)
			{
				if(ar[j+1]<ar[j])
				{
					temp=ar[j+1];
					ar[j+1]=ar[j];
					ar[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int [] ar= {1,4,3,2};
		System.out.println("Before sorting: "+Arrays.toString(ar));
		Bubble_sort.bubblesort(ar);
		
		System.out.println("after sort: "+ Arrays.toString(ar));
		
		// TODO Auto-generated method stub

	}
	

}
