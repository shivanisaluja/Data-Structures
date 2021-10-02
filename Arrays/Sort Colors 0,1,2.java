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

