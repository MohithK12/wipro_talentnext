package class_and_objects;
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculator.powerInt(2, 2));
		System.out.println(Calculator.powerDouble(3.0, 2.0));
	}

}
class Calculator{
	static int powerInt(int num1,int num2) {
		return (int)Math.pow(num1,num2);
	}
	static double powerDouble(double num1,double num2) {
			return Math.pow(num1,num2);
	}
}
