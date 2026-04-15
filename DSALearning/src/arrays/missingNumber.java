package arrays;

import java.util.HashSet;

public class missingNumber {

    public static void main(String[] args){
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(missingNumberFormula(arr));
        System.out.println(missingNumberHashset(arr));
    }

    public static int missingNumberFormula(int[] arr){
        int n = arr.length+1;
        int actualSum=0;

        for (int j : arr) {
            actualSum += j;
        }
        int expectedSum = n * (n+1) / 2 ;

        return expectedSum - actualSum;

    }

    public static int missingNumberHashset(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        //Put all the nums elemnts in hashSet
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        //Now check for missing number by comparing the normal series with what is contained in hashset
        for(int i=0;i<=arr.length;i++){
            if(!set.contains(i)) return i;
        }
        return -1;
    }
}

