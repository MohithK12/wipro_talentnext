package Arrays;
import java.util.*;
public class Question12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		int[] temp = new int[2];
		for(int i=0;i<3;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++) {
			b[i]=sc.nextInt();
		}
		temp[0]=a[1];
		temp[1]=b[1];
		System.out.print(Arrays.toString(temp));
	}

}
