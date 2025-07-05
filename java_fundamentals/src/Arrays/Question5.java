package Arrays;
import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr =  new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		if(n<2) {
			System.out.print("We want atleast 2 elements");
			return;
		}
		Arrays.sort(arr);
		System.out.println("The first smallest "+arr[0]+", The second smallest "+arr[1]);
		System.out.println("The first largest "+arr[n-1]+", The second largest "+arr[n-2]);
	}

}
