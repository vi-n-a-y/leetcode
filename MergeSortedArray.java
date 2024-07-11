// 88. Merge Sorted Array

// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

// Example 1:

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int left=m-1;
		  int right=0;
		  while(left>=0 && right<n) {
			  if(nums1[left]>nums2[right]) {
				  int temp=nums1[left];
				  nums1[left]=nums2[right];
				  nums2[right]=temp;
				  left--;
				  right++;
				 
			  }else {
				  break;
			  }
		  }
		  
		  for(int i:nums1) {
			  System.out.print(i);
		  }
		  for(int i=0;i<m;i++) {
			  for(int j=i+1;j<m;j++) {
				  if(nums1[i]>=nums1[j]) {
					 int temp=nums1[i]; 
					 nums1[i]=nums1[j];
					 nums1[j]=temp;
				  }
			  }
		  }
		  
		  for(int i=0;i<n;i++) {
			  for(int j=i+1;j<n;j++) {
				  if(nums2[i]>nums2[j]) {
					 int temp=nums2[i]; 
					 nums2[i]=nums2[j];
					 nums2[j]=temp;
				  }
			  }
		  }
		  
		 nums1=Arrays.copyOf(nums1,m+n);
		  for(int i=m;i<m+n;i++) {
			  nums1[i]=nums2[i-m];
		  }

    }
}//main method
