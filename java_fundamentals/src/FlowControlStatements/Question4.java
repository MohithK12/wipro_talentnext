package FlowControlStatements;
import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s= new Scanner(System.in);
 char c1 = s.next().charAt(0);
 char c2 = s.next().charAt(0);
 if(c1<c2) {
	 System.out.print(c1+","+c2);
 }
 else {
	 System.out.print(c2+","+c1);
 }
 }

}
