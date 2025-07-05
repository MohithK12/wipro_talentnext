package Arrays;
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int sum =0;
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				sum+=arr[i];
			}
			System.out.println("sum :"+sum);
			System.out.println("average :"+sum/n);
			
	}

}
