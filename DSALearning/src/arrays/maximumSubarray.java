package arrays;

public class maximumSubarray {

    public static void main(String[] args){
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int maxSum = maxSubarrayBruteforce(arr);
        System.out.println(maxSum);
        System.out.println(maxSubarrayKadanesApproach(arr));

    }

    public static int maxSubarrayKadanesApproach(int[] arr){
       int maxSum = arr[0];
       int currentSum= arr[0];
       for(int i=0; i< arr.length; i++){
//           currentSum += arr[i];
//           if(currentSum<0){
//               currentSum =0;
//           }
           currentSum = Math.max(arr[i], currentSum+arr[i]);
           maxSum = Math.max(maxSum,currentSum);
       }
       return maxSum;
    }

    public static int maxSubarrayBruteforce(int[] arr){
       int maxSum = Integer.MIN_VALUE;

       for(int i=0; i<arr.length; i++){
           int sum = 0;
           for(int j=i;j< arr.length; j++){
               sum += arr[j];
               maxSum = Math.max(maxSum, sum);
           }
       }
       return maxSum;
    }

}
