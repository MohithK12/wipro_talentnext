package Arrays;
import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		withoutTen(arr);
	}
	static void withoutTen(int[] arr) {
		int idx=0;
		int[] temp = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(!(arr[i]==10)) {
				temp[idx++]=arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(temp[i]+" ");
		}
	}

}
