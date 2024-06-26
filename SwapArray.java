import java.util.Arrays;

public class arraySWAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		swap(arr,0,1);
		//System.out.println(Arrays.toString(arr));
		for(int i:arr) {
		 System.out.print(i + " ");
		}
	}
	static void swap(int[] arr,int index1,int index2) {
		int temp = arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		
	}

}