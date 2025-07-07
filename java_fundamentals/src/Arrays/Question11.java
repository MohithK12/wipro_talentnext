package Arrays;
import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]==4 || arr[i]==1) {
				cnt++;
			}
		}
		if(cnt==n) {
			System.out.print("true");
		}
		else {
			System.out.print("false");
		}
	}

}
