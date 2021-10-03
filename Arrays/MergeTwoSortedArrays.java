//using extra spaces

package ArrayList;
import java.util.Arrays;
public class mergeTwoSortedArrays {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = { 1, 5, 9, 10, 15, 20 };
		int[] a2 = { 2, 3, 8, 13 };

		int[] mergedArray = merge(a1, a2);

		print(mergedArray);

	}

	public static int[] merge(int[] a, int[] b) {
//		new array 
		int[] res = new int[a.length + b.length];
//	pointer for a array
		int i = 0;
//	pointer for b array
		int j = 0;
//	pointer for res array
		int k = 0;

//	 if both the array have values then compare both and which ever is small add that element in new array ie res[k] and move the pointer 
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				res[k] = a[i];
				i++;
				k++;
			}

			else {
				res[k] = b[j];
				j++;
				k++;
			}

		}

//	if b is empty and values are only in a array
		while (i < a.length) {
			res[k] = a[i];
			i++;
			k++;
		}

//	if a is empty and values are only in b array
		while (j < b.length) {
			res[k] = b[j];
			j++;
			k++;
		}

		return res;

	}

//	print method

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
