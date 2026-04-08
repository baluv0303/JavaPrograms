package arrays;

public class ContainerWithMostWater {

    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Result from two pointers " + maxAreaTwoPointers(height));
        System.out.println("Result from brute force approach " + maxAreaBruteforce(height));

    }

    public static int maxAreaTwoPointers(int[] height){
        int left = 0, right = height.length-1;
        int maxArea = 0;
        while(left < right){
            int width = right -left;
            int minHeight = Math.min(height[left], height[right] );
            int area = minHeight * width ;
            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
//        Time: O(n)
//        Space: O(1)
    }

    public static int maxAreaBruteforce(int[] height){
        int maxArea =0, n = height.length;

        for(int i=0; i< n; i++){
            for(int j=i+1; j<n ; j++){
                int width = j -i ;
                int minHeight =  Math.min(height[i], height[j]);
                int area = width * minHeight ;
                maxArea = Math.max(area, maxArea);

            }
        }
        return maxArea;
    }
}
