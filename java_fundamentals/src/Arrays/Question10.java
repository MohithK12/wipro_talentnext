package Arrays;
import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int idx=0;
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] temp = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				temp[idx++]=arr[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(!(arr[i]%2==0)){
				temp[idx++]=arr[i];
			}
		}
		for(int ele : temp) {
			System.out.print(ele+" ");
		}
		
	}

}
