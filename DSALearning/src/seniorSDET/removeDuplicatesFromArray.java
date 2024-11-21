package seniorSDET;

import java.util.HashSet;

public class removeDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,3,4,5,5,5,7,8};
		int newLength = removeDuplicates2(a);
		
		for (int i = 0; i < newLength; i++) {
            System.out.print(a[i] + " ");
        }
		 int k=removeDuplicates2(a);
		
		for(int i=0; i<k;i++) {
			System.out.print(a[i]+" ");
		}

		
	}
	
	public static void removeDuplicates(int[] a) {
		
		HashSet<Integer> hs = new HashSet<>();
		for(int i=0; i<a.length;i++) {
			hs.add(a[i]);
		}
		System.out.println(hs);
		
	}
	
	public static int removeDuplicates2(int[] a) {
		
		int i=0;
		for(int j=1;j<a.length; j++) {
			if(a[i]!=a[j]) {
				i++;
				a[i]=a[j];
			}
		}
		return i+1;
		
	}

}
