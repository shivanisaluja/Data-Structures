// Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
// A subarray is a contiguous part of an array.
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: [4,-1,2,1] has the largest sum = 6.

package ArrayList;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		array at index 0
		int i = 0;
		int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int sum = 0;

//		initially max=-2	
		int max = arr[i];

		for (i = 0; i < arr.length; i++) {
//			inititally sum= 0+ (-2)=-2

			sum = sum + arr[i];

			if (sum > max) {
				max = sum;
			}

			if (sum < 0) {
				sum = 0;
			}

		}

		System.out.println(max);

	}

}
