package FlowControlStatements;
import java.util.*;
public class Question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Gender:");
		String s1 = sc.nextLine();
		System.out.println("Enter Age");
		int age = sc.nextInt();
		if(s1.equals("Male")){
			if(age>=1 && age<59) {
				System.out.print("8.4");
			}
			else {
				System.out.print("10.5");
			}
			}
		else{
			if(age>=1 && age<59) {
				System.out.print("8.2");
			}
			else {
				System.out.print("9.2");
			}
		}
	}

}
