package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {

    public static void main(String[] args){
        int[] nums= {3,6,8,9,1,2,8};
        int k = 2;
        System.out.println(findKthSmallest(nums,k));
    }

    public static int findKthSmallest(int[] nums, int k){
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            throw new IllegalArgumentException("Invalid input");
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : nums){
            maxHeap.add(num);

            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }

}
