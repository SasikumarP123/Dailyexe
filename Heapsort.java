package sasikumar;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Heapsort
{
	private static void heapsort(int[] arr) 
	{
		//using Priority queue 
		PriorityQueue<Integer> maxHeap=new PriorityQueue<>();
		//input all the element
		for(int i=0;i<arr.length;i++)
		{
			maxHeap.add(arr[i]);
		}
		// remove the last node
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=maxHeap.poll();
		}
		
		
		
	}


	public static void main(String[] args)
	{
		
		int arr[]= {1,4,2,3,5,7};
		System.out.println("Before sorting: "+Arrays.toString(arr));
		Heapsort.heapsort(arr);
		System.out.print("After Heapsorting: "+Arrays.toString(arr));		
			
		

	}

	
}
