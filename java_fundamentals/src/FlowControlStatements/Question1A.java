package FlowControlStatements;
import java.util.*;
public class Question1A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a<0) {
			System.out.print("Negative");
		}
		else if(a>0){
			System.out.print("Positive");
		}
		else {
			System.out.println("Zero");
		}
	}

}
