package q11076;

public class CheckAlternateNo {
	/**
	 * Check if the arg element is present at every odd postition of the arr
	 * 
	 * 
	 * @return result
	 */ 
	
	public boolean checkAlternate(int[] arr, int arg) {
		
		//Write your code here
		boolean result = false;
		for(int i = 0;i<arr.length;i+=2){
			if(arr[i] ==arg){
				result = true;
			} else {
				result = false;
			}
		}
		return result;
		
	}
}
