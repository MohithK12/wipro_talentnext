package Arrays;

import java.util.*;

public class Question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int ele : a) {
			System.out.print((char)ele+" ");
		}
	}
}
