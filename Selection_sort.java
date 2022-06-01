package sasikumar;
import java.util.Arrays;

public class Selection_sort {
	public static void selectionsort(int[] ar) {
		int temp;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[j];
					ar[j]=ar[i];
					ar[i]=temp;
				}
			}
		}
		
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		int []ar={20,10,40,60,30};
		System.out.println("Arrays Before sorting: "+Arrays.toString(ar));
		Selection_sort.selectionsort(ar);
		System.out.println("After Selection sort: "+Arrays.toString(ar));
		// TODO Auto-generated method stub

	}

	

}
