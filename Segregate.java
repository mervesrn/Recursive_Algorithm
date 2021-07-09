
public class Segregate {
	void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// Standard partition process of QuickSort(). It considers
	// the last element as pivot and moves all smaller element
	// to left of it and greater elements to right. 
	int[] partition(int arr[], int p, int r)
	{
		int pivot =0, i = p;
		for (int j = p; j < r; j++)
		{
			if (arr[j] <= pivot)
			{
				swap(arr, i, j);
				i++;
			}
		}
		
		return arr;
	}
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	int[] partition2(int arr[], int i, int j)
	{
		int pivot =0; 
		int r=arr.length;
		
		if(j==r) {
			System.out.println("j==r");
			return arr;
		}
		else if (arr[j] <= pivot)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			return partition2(arr,i+1,j+1);
		}
		else {
		
			return partition2(arr,i,j+1);
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[])
	{
		Segregate ob = new Segregate();
		int arr[] = {-12, 19, 42, 21, -1, 38, -21,-31,5,-36,0};
		
		
		 System.out.println();
			System.out.println("Quicksort Partition Process Result:");
			
		int[] arr2 =ob.partition(arr, 1, arr.length);
		for (int i = 0; i < arr2.length; i++) {
	         System.out.printf( arr2[i]+ " ,");          
	    }
		System.out.println();
		System.out.println("Recursive Result:");
		
		 int[] arr3 = new int[arr.length];
		arr3 =ob.partition2(arr, 1, 1);
		for (int i = 0; i < arr3.length; i++) {
	         System.out.printf( arr3[i]+ " ,");          
	    }	
	}
}