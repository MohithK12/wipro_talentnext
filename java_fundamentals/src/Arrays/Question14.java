package Arrays;
import java.util.*;
public class Question14 {

	public static void main(String[] args) {
		if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		int max=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			arr[i][j]=sc.nextInt();
			if(arr[i][j]>max) {
				max=arr[i][j];
			}
			}
		}
		System.out.println("The biggest number in the given array is "+max);
	}

}
