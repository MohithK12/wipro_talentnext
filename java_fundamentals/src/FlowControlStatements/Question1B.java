package FlowControlStatements;
import java.util.*;
public class Question1B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 int i = sc.nextInt();
	 int j = sc.nextInt();
	 System.out.print(lastDigit(i,j));
	}
 static boolean lastDigit(int i, int j){
	 if((i%10)==(j%10)) {
		 return true;
	 }
	 return false;
 }
}
