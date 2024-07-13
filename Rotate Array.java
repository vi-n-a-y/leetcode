// 189. Rotate Array
// Medium
// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
// Example 1:

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]
// Example 2:

// Input: nums = [-1,-100,3,99], k = 2
// Output: [3,99,-1,-100]
// Explanation: 
// rotate 1 steps to the right: [99,-1,-100,3]
// rotate 2 steps to the right: [3,99,-1,-100]


class Rotate Array {
    public int[]  reverse(int[] nums, int i,int k) {

       while(i<=k){
        int temp=nums[i];
        nums[i]=nums[k];
        nums[k]=temp;
        i++;
        k--;

       }
       return nums;
   
    }
    public void rotate(int[] nums,int k){
        int n=nums.length;
        k=k%n;//if k is greater than length of the array 
        reverse(nums,0,n-1);
         reverse(nums,0,k-1);
         reverse(nums,k,n-1);

    }
}   

