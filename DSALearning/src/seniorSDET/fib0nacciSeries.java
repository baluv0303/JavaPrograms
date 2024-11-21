package seniorSDET;

public class fib0nacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		fibonacci(n);

	}
	
	public static void fibonacci(int n) {
		int n1=0, n2=1, n3;
		System.out.print(n1+" "+ n2+ " ");
		for(int i=2; i< n; i++) {
			n3= n1+n2;
			System.out.print(n3+" ");
			n1 = n2;
			n2= n3;
			}
		
	}

}
