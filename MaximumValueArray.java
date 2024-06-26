public class maximumval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,3,23,9,8};
		System.out.print("Maximum value of array is " +max(arr));      
	}
	static int max(int[] arr) {
		if(arr.length==0) {
			return -1;
			
		}
		int maxval=arr[0];
		for(int i =1;i<arr.length;i++) {
			if(arr[i]>maxval) {
				maxval=arr[i];
			}
			
		}
		return maxval ;
		
	}

}