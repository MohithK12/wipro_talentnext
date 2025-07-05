package FlowControlStatements;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = n;
		int rev=0;
		while(n>0) {
			int digit = n%10;
			rev = rev*10+digit;
			n= n/10;
		}
		if(p==rev)
		System.out.print(p+" is Palindrome");
		else
			System.out.print(p+" is not a palindrome");

	}

}
