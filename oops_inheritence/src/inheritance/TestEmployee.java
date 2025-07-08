package inheritance;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.print("Employee Details : ");
		Employee e = new Employee("Yaswin",200000,2026,"NI7456");
		System.out.println("Name : "+e.getName());
		System.out.println("Joined Year : "+e.getYear());
		System.out.println("Salary : "+e.getSalary());
		System.out.println("National Insurance Number : "+e.getNIno());
		System.out.println("Updated Employee details : ");
		e.setName("John");
		e.setSalary(350000);
		e.setYear(2025);
		e.setNIno("NI23049");
		System.out.println("Name : "+e.getName());
		System.out.println("Joined Year : "+e.getYear());
		System.out.println("Salary : "+e.getSalary());
		System.out.println("National Insurance Number : "+e.getNIno());
		System.out.println(e.getName());
	}
}
