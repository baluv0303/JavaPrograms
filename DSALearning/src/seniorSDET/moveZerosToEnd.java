package seniorSDET;

public class moveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
		 pushZeros(arr);
		 
		 for(int num : arr) {
			 System.out.print(num + "  ");
		 }
		 
	}
	
	public static void pushZeros(int[] arr) {
		int count =0;
		
		for(int i=0; i< arr.length; i++) {
			if(arr[i]!=0) {
				arr[count] = arr[i];
				count++;
			}
		}
		
		while(count< arr.length) {
			arr[count] =0;
			count++;
		}
	}
	
	

}
