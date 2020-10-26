package test;

public class Test {
	public int flip(int arr[], int k) {
		int temp;
		for (int i = 0; i < k; i++) {
			if (k != i) {
				temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				k--;
			} else
				break;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		return arr[0];
	}

	public int[] pancakeSort(int arr[]) {
		int k = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] > arr[i]) {
				k = i;
				System.out.println("k = " + k);
				break;
			}
		}
		flip(arr, k);

		return arr;
	}

	public String reverse(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		}
		return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
	}

	public static void main(String[] args) {
		Test test = new Test();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int k = 5;
		test.flip(arr, k);
		System.out.println("");
		test.pancakeSort(arr);
		
		System.out.println("");
		String str = "Hello";
		System.out.println(test.reverse(str));
	}
}
