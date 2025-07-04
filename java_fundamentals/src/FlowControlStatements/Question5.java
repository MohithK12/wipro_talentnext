package FlowControlStatements;
import java.util.*;
public class Question5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	char c = sc.next().charAt(0);
	if(c>='A' && c<='Z' || c>='a' && c<='z') {
		System.out.print("Alphabet");
	}
	else if(c>=0 && c>=9) {
		System.out.print("Number");
	}
	else {
		System.out.print("Special Character");
	}
	}

}
