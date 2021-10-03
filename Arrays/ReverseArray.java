// reverse elements of an array

package ArrayList;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[] = { "a", "b", "c", "d" };
		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			String temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}

	}

}
