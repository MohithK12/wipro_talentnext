package FlowControlStatements;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    if(Character.isUpperCase(ch)){
    	System.out.print(ch+"->"+Character.toLowerCase(ch));
    }
    else if(Character.isLowerCase(ch)) {
    	System.out.print(ch+"->"+Character.toUpperCase(ch));
    }
    else {
    	System.out.print("Invalid input");
    }
	
	}
}
