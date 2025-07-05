package Arrays;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt =0;
		int[] arr =new int[n];
		int[] temp = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			boolean isDuplicate = false;
			for(int j=0;j<cnt;j++) {
				if(arr[i]==temp[j]) {
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) {
				temp[cnt]=arr[i];
				cnt++;
			}
		}
		for(int i=0;i<cnt;i++) {
			System.out.print(temp[i]+" ");
		}
		sc.close();
	}

}
