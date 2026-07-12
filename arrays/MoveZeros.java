package arrays;
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.

//Example 1:
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]

//Example 2:
//Input: nums = [0]
//Output: [0]
 
//Constraints:
//1 <= nums.length <= 104
//-231 <= nums[i] <= 231 - 1

class MoveZeros {
    public void moveZeroes(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if (nums[j] == 0 && nums[j+1] != 0) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
//time complexity O(n^2)
//space complexity O(1)        
    }
}