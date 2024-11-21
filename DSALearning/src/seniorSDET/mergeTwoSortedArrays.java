package seniorSDET;

public class mergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = {1,2,3,0,0,0};
		int nums2[] = {2,5,6};
		int m=3, n = 3;
		
		mergeArrays(nums1,m,nums2,n);
		
		for(int i : nums1) {
			System.out.print(i + " ");
		}

	}
	
	public static void mergeArrays(int[] nums1, int m, int[] nums2, int n ) {
		int i = m-1, j= n-1, k= m+n-1;
		
		while(i>=0 && j>=0) {
			if(nums1[i] > nums2[j]) {
				nums1[k--]= nums1[i--];
			}
			else {
				nums1[k--]= nums2[j--];
			}
		}
		
		while(j>=0) {
			nums1[k--]= nums2[j--];
		}
		
		 
	}

}
