package arrays;

//You are given an integer array height of length n. 
// There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//Return the maximum amount of water a container can store.
//Notice that you may not slant the container.

 //Example 1:
//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

//Example 2:
//Input: height = [1,1]
//Output: 1
 
//Constraints:
//n == height.length
//2 <= n <= 105
//0 <= height[i] <= 104

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i1 = 0;
        int i2 = (height.length - 1);
        int breadth = i2 - i1;
        int maxArea = 0;
        int currentArea;
        while (i1 < i2) {
            currentArea = breadth * (Math.min (height[i1], height[i2]));
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }
            if (height[i1] <= height[i2]) {
                i1++;
            }
            else if (height[i1] > height[i2]) {
                i2--;
            }
            breadth--;

        }
        return maxArea;
//time complexity O(n)
//space complexity O(1)
//technique used: two pointer technique
    }
}
