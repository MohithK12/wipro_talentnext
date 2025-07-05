package Arrays;

import java.util.*;

public class Question3 {
	static int isPresent(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		int k = s.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		System.out.print(isPresent(arr, k));
		s.close();
	}

}
