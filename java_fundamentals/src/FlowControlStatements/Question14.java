package FlowControlStatements;
import java.util.*;
public class Question14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for(;n>0;n/=10) {
			int digit=n%10;
			sum+=digit;
		}
		System.out.println("The sum of digits is "+sum);
	}

}
