package arrays;

import java.util.HashSet;
import java.util.Map;

public class twoSum {

    public static boolean twoSumBruteforce(int[] arr, int tar){
        int n = arr.length;
        for (int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]== tar){
                    return true;
                }
            }
        }
        return false;

    }

    public static boolean twoSumHashmap(int[] arr, int tar){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i< arr.length; i++){
            int complement = tar - arr[i];
            if(set.contains(complement)){
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static void main(String[] args){

        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;

        if (twoSumBruteforce(arr, target))
            System.out.println("true");
        else
            System.out.println("false");

        if (twoSumHashmap(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}


