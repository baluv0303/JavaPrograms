package heap;

import java.util.PriorityQueue;

public class KthLargest {

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(nums, k)); // 5
    }

    public static int findKthLargest(int[] nums, int k){

        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            throw new IllegalArgumentException("Invalid input");
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num: nums){
            minHeap.add(num);

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        return minHeap.peek();

    }
}
