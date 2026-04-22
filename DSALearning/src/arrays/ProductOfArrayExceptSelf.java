package arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args){
        int[] arr= {1,2,3,4};
        int[] res= productExceptSelfBrutueforce(arr);
        int[] res2 = productExceptSelfPrefix(arr);
        for(int val: res){
            System.out.print(val + " ");
        }

        for(int val: res2){
            System.out.print(val + " ");
        }
    }

    public static int[] productExceptSelfPrefix(int[] arr){
        int n = arr.length;
        int[] res = new int[n];

        res[0] =1;
        for(int i=1; i< n; i++){
            res[i] = res[i-1] * arr[i-1];
        }

        int suffix = 1;
        for(int i= n-1; i>=0; i--){
            res[i] *= suffix;
            suffix *= arr[i];
        }
        return res;
//        Complexity:
//        Time: O(n)
//        Space: O(1) (excluding output)
    }

    public static int[] productExceptSelfBrutueforce(int[] arr){
        int n = arr.length;
        int[] res = new int[n];

        for(int i=0; i<n ; i++){
            int product =1;
            for(int j=0; j< n; j++){
                if(i != j){
                    product *= arr[j];
                }
            }
            res[i] = product;
        }
        return res;
        //Time complexity = O(n2)
        //Space complexity = O(1)
    }
}
