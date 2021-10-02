// method 1
// time complexity O(N)
// Space Complexity O(1)
package ArrayList;

public class Q1m1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,2,0,0,2,1};
		int zeroCount=0;
		int oneCount=0;
		int i;
		
//		count no. of 0's
		for(i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				zeroCount++;
			}
//			count no. of 1's
			
			if(arr[i]==1) {
				oneCount++;
				
			}
		}
//		setting value 0
		
		for( i=0;i<zeroCount;i++) {
			arr[i]=0;
		}
//		setting value 1
		for( i=zeroCount;i<(zeroCount+oneCount);i++) {
			arr[i]=1;
		}
		
// setting value 2
		for( i=(zeroCount+oneCount);i<arr.length;i++) {
			arr[i]=2;
		}
		
		
//		printing the sorted array
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
			
		

	}

}











// method 2
// time complexity O(N)
// Space Complexity O(1)
package ArrayList;

public class Q1m2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 0, 1, 2, 0 };
		sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	


	public static void sort(int arr[]){
		int low = 0;
		int mid = 0;
		int hi = arr.length - 1;
		int temp;

		while (mid <= hi) {
			switch (arr[mid]) {
//		if element at that particular index is 0
			case 0:
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;

				mid++;
				low++;
				break;

//			mid pointer increases by 1 index
//			if element at particular index is 1 move mid pointer  by 1 index
			case 1:
				mid++;
				break;

//			if element at particular index is 2			
			case 2:
				temp = arr[mid];
				arr[mid] = arr[hi];
				arr[hi] = temp;
//			decrement position of hi element by 1
				hi--;

			}

		}
	}
}

