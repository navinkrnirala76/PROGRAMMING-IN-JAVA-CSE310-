package q11068;
public class ElementCheck {
	/**
	 * Find if the arr contains only arg1 or arg2 elements
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean checkElement(int[] arr, int arg1, int arg2) {
		
		//Write your code here
		int count=0;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i] == arg1 || arr[i] == arg2)
			{
				count++;
			}
		}
		if(count == arr.length)
		{
			return true;
		}
		else
		return false;
	}
}
