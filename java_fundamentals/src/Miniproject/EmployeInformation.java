package Miniproject;

import java.util.*;

public class EmployeInformation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empId = sc.nextInt();
		int[] empNo = { 1001, 1002, 1003, 1004, 1005, 1006, 1007 };
		String[] empName = { "Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay" };
		String[] dept = { "R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM" };
		char[] desigCode = { 'e', 'c', 'k', 'r', 'm', 'e', 'c' };
		int[] basic = { 20000, 30000, 10000, 12000, 50000, 23000, 29000 };
		int[] hra = { 8000, 12000, 8000, 6000, 20000, 9000, 12000 };
		int[] it = { 3000, 9000, 1000, 2000, 20000, 4400, 10000 };
		char[] dCode = { 'e', 'c', 'k', 'r', 'm' };
		String[] dName = { "Engineer", "Consultant", "Clerk", "Receptionist", "Manager" };
		int[] da = { 20000, 32000, 12000, 15000, 40000 };
		boolean found = false;
		for (int i = 0; i < empNo.length; i++) {
			if (empNo[i] == empId) {
				String designation = "";
				int daValue = 0;

				for (int j = 0; j < dCode.length; j++) {
					if (desigCode[i] == dCode[j]) {
						designation = dName[j];
						daValue = da[j];
						break;
					}
				}

				int salary = basic[i] + hra[i] + daValue - it[i];

				System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
				System.out.println(
						empNo[i] + "\t" + empName[i] + "\t\t" + dept[i] + "\t\t" + designation + "\t" + salary);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("There is no employee with empid : " + empId);
		}
	}

}

