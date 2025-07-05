package Arrays;
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
	
					Scanner sc = new Scanner(System.in);
					int n = sc.nextInt();
					int max=0,min=Integer.MAX_VALUE;
					int[] arr = new int[n];
					for(int i=0;i<n;i++) {
						arr[i]=sc.nextInt();
					}
					for(int i=0;i<n;i++) {
						if(arr[i]>max) {
							max = arr[i];
						}
						if(arr[i]<min) {
							min=arr[i];
						}
					}
					System.out.println("max value :"+max);
					System.out.println("min value :"+min);
					
			}

		

	}


