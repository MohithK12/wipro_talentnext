package Arrays;
import java.util.*;

public class Question13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
			arr[i][j]=sc.nextInt();
			}
		}
		int temp1=arr[0][0];
		int temp2 = arr[0][1];
		System.out.println("The given array is : ");
	    for(int i=0;i<2;i++) {
	    	for(int j=0;j<2;j++) {
	    		System.out.print(arr[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    arr[0][0]=arr[1][1];
	    arr[1][1]=temp1;
	    arr[0][1]=arr[1][0];
	    arr[1][0]=temp2;
	    System.out.println("The reverse of the array : ");
	    for(int i=0;i<2;i++) {
	    	for(int j=0;j<2;j++) {
	    		System.out.print(arr[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	}

}
